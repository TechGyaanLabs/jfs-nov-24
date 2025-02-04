
function showTable(){

        let num = document.getElementById("idNum").value;

        let str = '<br>';
        for(let i=1; i<=10; i++){
            str += `${num} &emsp; *  &emsp; ${i} &emsp; =  &emsp; ${num * i}</br>`
        }
        
        document.getElementById("idShowTable").innerHTML = str;

}

const countries = 

[
    {
        "country": "India",
        "currency": "INR",
        "population": 1400000000,
        "countryCode": "IN",
        "flag": "https://flagcdn.com/w320/in.png"
    },
    {
      "country": "United States",
      "currency": "USD",
      "population": 331000000,
      "countryCode": "US",
      "flag": "https://flagcdn.com/w320/us.png"
    },
    
    {
      "country": "United Kingdom",
      "currency": "GBP",
      "population": 68000000,
      "countryCode": "GB",
      "flag": "https://flagcdn.com/w320/gb.png"
    },
    {
      "country": "Germany",
      "currency": "EUR",
      "population": 83000000,
      "countryCode": "DE",
      "flag": "https://flagcdn.com/w320/de.png"
    },
    {
      "country": "France",
      "currency": "EUR",
      "population": 67000000,
      "countryCode": "FR",
      "flag": "https://flagcdn.com/w320/fr.png"
    },
    {
      "country": "Canada",
      "currency": "CAD",
      "population": 38000000,
      "countryCode": "CA",
      "flag": "https://flagcdn.com/w320/ca.png"
    },
    {
      "country": "Australia",
      "currency": "AUD",
      "population": 26000000,
      "countryCode": "AU",
      "flag": "https://flagcdn.com/w320/au.png"
    },
    {
      "country": "Japan",
      "currency": "JPY",
      "population": 125000000,
      "countryCode": "JP",
      "flag": "https://flagcdn.com/w320/jp.png"
    },
    {
      "country": "China",
      "currency": "CNY",
      "population": 1410000000,
      "countryCode": "CN",
      "flag": "https://flagcdn.com/w320/cn.png"
    },
    {
      "country": "Brazil",
      "currency": "BRL",
      "population": 213000000,
      "countryCode": "BR",
      "flag": "https://flagcdn.com/w320/br.png"
    }
  ]
      
const countryNames = []

for(let i=0;i<countries.length;i++){
    countryNames.push(countries[i].name);
}

const idShowCountryNames = document.getElementById("idShowCountryNames");

let options = countries.map(country => `<option value="${country.country}">${country.country}</option>`).join("");

let selectStr = `
    <div class="form-group">
     <label for="countryName">Select Country</label>
        <select class="form-control" id="idSelectCountry">
           ${options}
        </select>
  </div>
  `
  idShowCountryNames.innerHTML = selectStr;


function getIndex(countryName){
    for(let i=0;i<countries.length;i++){
        if(countries[i].country === countryName){
            return i;
        }
    }
    return -1;
}
const idSelectCountry = document.getElementById("idSelectCountry")
idSelectCountry.addEventListener('change',(event)=>{       
    showCountryFullDetails();
})

function showCountryFullDetails(){
        let name = idSelectCountry.value;
        let i = getIndex(name);
        
        let idCountryDetails = document.getElementById("idCountryDetails");
        idCountryDetails.innerHTML = '';
        let countryDetails = `<strong>country ${name} details are not found `;
        if(i >= 0){
        country = countries[i];
        countryDetails = `
            <div class="card mt-2">
            <img class="card-img-top" src=${country.flag} alt="Card image cap">
            <div class="card-body">
                <h5 class="card-title">${country.country}</h5>
                <p class="card-text">
                ${country.country} has ${country.population} and currency is ${country.currency}
                </p>
                <a href="#" class="btn btn-primary">Go somewhere</a>
            </div>
            </div>
            `
        }
        idCountryDetails.innerHTML = countryDetails;
}

showCountryFullDetails();