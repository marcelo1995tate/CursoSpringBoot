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
for(let aux of usuarios)
{
  usuario+= "<tr class=\"text-center\">\n" +
      "               <td>"+aux.id+"</td>\n" +
      "               <td>"+aux.nombre+"</td>\n" +
      "               <td>"+aux.apellido+"</td>\n" +
      "               <td>"+aux.email+"</td>\n" +
      "               <td class=\"d-flex justify-content-around\">" +
      "                     <buton class=\"btn btn-danger\">Borrar</buton>" +
      "                     <buton class=\"btn btn-warning\">Actualizar</buton>" +
      "               </td>\n" +
      "          </tr>";
}
  document.querySelector("#usuarios tbody").outerHTML=usuario;
  console.log(usuarios);
}