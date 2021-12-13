// Call the dataTables jQuery plugin
$(document).ready(function() {

});

async function saveUsuarios() {
    let datos={};
    let nombre=document.getElementById('nombre').value;
    let apellido=document.getElementById('apellido').value;
    let telefono=document.getElementById('telefono').value;
    let email=document.getElementById('email').value;
    let password=document.getElementById('password').value;
    let repitePassword=document.getElementById('repetirPassword').value;

    if(password==null ||password==""|| repitePassword==null ||repitePassword==""){
        alert("Password invalido")
        return
    }
    if(password!=repitePassword ){
        alert("Password distintos")
        return
    }
    if(nombre==null ||nombre==""){
        alert("Nombre invalido")
    return
    }
    if(apellido==null ||apellido==""){
        alert("Apellido invalido")
        return
    }
    if(telefono==null ||telefono==""){
        alert("Telefono invalido")
        return
    }
    if(email==null ||email==""){
        alert("Email invalido")
        return
    }
    datos.nombre=nombre;
    datos.apellido=apellido;
    datos.email=email;
    datos.telefono=telefono;
    datos.password=password
    alert(JSON.stringify(datos))
    const request = await fetch('http://localhost:8080/usuario/usuario-save', {
        method: 'POST',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(datos)
    });
}