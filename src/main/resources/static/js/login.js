// Call the dataTables jQuery plugin
$(document).ready(function() {

});

async function loginUsuarios() {
    let datos={};
    let email=document.getElementById('email').value;
    let password=document.getElementById('password').value;

    if(password==null ||password==""){
        alert("Password invalido")
        return
    }

    if(email==null ||email==""){
        alert("Email invalido")
        return
    }
    datos.email=email;
    datos.password=password
    const request = await fetch('http://localhost:8080/login/usuario-login', {
        method: 'POST',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(datos)
    });
   const respuesta= await request.text()
if(respuesta=="OK")
    window.location.href="usuarios.html";
else
    alert("Credenciales no validas");
}