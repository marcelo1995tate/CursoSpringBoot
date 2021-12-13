// Call the dataTables jQuery plugin
$(document).ready(function() {
cargarUsuarios();
  $('#usuarios').DataTable();
});
function recargar(){
  cargarUsuarios()
  $('#usuarios').DataTable();
}
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
  let botonEliminar="<buton class=\"btn btn-danger\"onclick=' eliminarUsuario("+aux.id+")'>Borrar</buton>"

  usuario+= "<tr class=\"text-center\">\n" +
      "               <td>"+aux.id+"</td>\n" +
      "               <td>"+aux.nombre+"</td>\n" +
      "               <td>"+aux.apellido+"</td>\n" +
      "               <td>"+aux.email+"</td>\n" +
      "               <td>"+aux.telefono+"</td>\n" +
      "               <td class=\"d-flex justify-content-around\">" +
                                botonEliminar +
      "                     <buton class=\"btn btn-warning\">Actualizar</buton>" +
      "               </td>\n" +
      "          </tr>";
}
  document.querySelector("#usuarios tbody").outerHTML=usuario;
}
async function eliminarUsuario(id) {
  if(confirm('¿Desea eliminar este usuario?')){
    await fetch('http://localhost:8080/usuario/usuario-delete/'+id, {
      method: 'DELETE',
      headers: {
        'Accept': 'application/json',
        'Content-Type': 'application/json'
      },
    })
    location.reload()
  }

}