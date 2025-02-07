
const idContactForm = document.getElementById('idContactForm');

const baseUrl = 'https://cbook-ucg6.onrender.com/api/contact';

idContactForm.addEventListener('submit', (event) => {
    event.preventDefault();
    let name = idContactForm.fullName.value;
    let email = idContactForm.email.value;
    let mobile = idContactForm.mobile.value;
    let dob = idContactForm.dob.value;

    let contact = {
        "fullName": name,
        "email": email,
        "mobile": mobile,
        "dob": dob
    }

    fetch(baseUrl, {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(contact)
        })
        .then(response => response.json())
        .then(data => {
            console.log('Success:', data);
            idContactForm.reset();
            showContacts();
        })
        .catch(error => {
            console.error('Error:', error);
        });

  
});

function showContacts(){
    fetch(`${baseUrl}/all`)
        .then(response => response.json())
        .then(contacts=>{
            
            // Create bootstrap table with edit and delete icons as action button for each contact

            let table = `
                <table class="table">
                    <thead>
                        <tr>
                            <th>Full Name</th>
                            <th>Email</th>
                            <th>Mobile</th>
                            <th>DOB</th>
                            <th>Action</th>
                        </tr>
                    </thead>
                    <tbody>
            `;

            contacts.forEach(contact => {
                table += `
                    <tr>
                        <td>${contact.fullName}</td>
                        <td>${contact.email}</td>
                        <td>${contact.mobile}</td>
                        <td>${contact.dob}</td>
                        <td>
                            <button class="btn btn-primary">Edit</button>
                            <button class="btn btn-danger">Delete</button>
                        </td>
                    </tr>
                `;
            });

            table += `
                </tbody>
                </table>
            `;

            document.getElementById('idShowContacts').innerHTML = table;


        }).catch(error=>{
            console.error('Error:', error);
        });

}

showContacts();