// Call the dataTables jQuery plugin
$(document).ready(function() {
cargarUsuarios();
  $('#usuarios').DataTable();
});

async function cargarUsuarios() {
  const request = await fetch('http://localhost:8080/usuario/usuario-find-all', {
    method: 'GET',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    },
  });
  const usuarios = await request.json();
  let usuario="";
for(let i = 0;i<usuarios.length;i++)
{
  usuario+= "<tr class=\"text-center\">\n" +
      "               <td>"+usuarios[i].id+"</td>\n" +
      "               <td>"+usuarios[i].nombre+"</td>\n" +
      "               <td>"+usuarios[i].apellido+"</td>\n" +
      "               <td>"+usuarios[i].email+"</td>\n" +
      "               <td class=\"d-flex justify-content-around\">" +
      "                     <buton class=\"btn btn-danger\">Borrar</buton>" +
      "                     <buton class=\"btn btn-warning\">Actualizar</buton>" +
      "               </td>\n" +
      "          </tr>";
}
  document.querySelector("#usuarios tbody").outerHTML=usuario;
  console.log(usuarios);
}