
category = [
    { "name": "Business", "value": "business" },
    { "name": "Health", "value": "health" },
    { "name": "Sports", "value": "sports" },
    { "name": "technology", "value": "technology" }
  ]


country = [
    { "name": "United States", "code": "US" },
    { "name": "India", "code": "IN" },
    { "name": "Canada", "code": "CA" },
    { "name": "United Kingdom", "code": "GB" },
    { "name": "Germany", "code": "DE" },
    { "name": "France", "code": "FR" },
    { "name": "Australia", "code": "AU" }
  ]


const idCategoryCountry = document.getElementById("idCategoryCountry");
 if (idCategoryCountry) {
        idCategoryCountry.innerHTML = `
            <div class="row">
                <div class="col-2"></div>
                 <div class="col-4">
                <select id="idCategory" class="form-control" onchange="getNews()">
                    ${category.map(c => `<option value="${c.value}">${c.name}</option>`).join('')}
                </select>
                </div>
                 <div class="col-4">
                <select id="idCountry" class="form-control" onchange="getNews()">
                    ${country.map(c => `<option value="${c.code}">${c.name}</option>`).join('')}
                </select>  
                </div>
                <div class="col-2"></div>
            </div>   
        `;
}
const  key = 'b968754c2b9a45d4bc54f5793806f40a';
const baseUrl = 'https://newsapi.org/v2/top-headlines?';
const apiKey = `apiKey=${key}`;
function getNews(){
    let country = document.getElementById("idCountry").value.toLowerCase();
    let category = document.getElementById("idCategory").value.toLowerCase();
    let url = `${baseUrl}country=${country}&category=${category}&${apiKey}`;
   
    fetch(url)
        .then(response => response.json())
         .then(data => {       
                let news = '';
                if(data.articles.length != 0){
                data.articles.forEach(article => {
                    news += `
                        <div class="card mb-3">
                            <img src="${article.urlToImage}" class="card-img-top" alt="...">
                            <div class="card-body">
                                <h5 class="card-title">${article.title}</h5>
                                <p class="card-text">${article.description}</p>
                                <a href="${article.url}" class="btn btn-primary">Read More</a>
                            </div>
                        </div>
                    `;
                });
            }else{
                news = `<p class="text-center text-muted">No News Found</p>`;
            }
            document.getElementById("idNewItems").innerHTML = news;
        });

}
getNews();