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
  let index=0;
for(var aux in usuarios){
  index+=1;
  usuario+= "<tr class=\"text-center\">\n" +
      "               <td>"+aux.id+"</td>\n" +
      "               <td>"+aux.email+"</td>\n" +
      "               <td>"+aux.password+"</td>\n" +
      "               <td>61</td>\n" +
      "               <td class=\"d-flex justify-content-around\">" +
      "                     <buton class=\"btn btn-danger\">Borrar</buton>" +
      "                     <buton class=\"btn btn-warning\">Actualizar</buton>" +
      "               </td>\n" +
      "          </tr>";
}


  document.querySelector("#usuarios tbody").outerHTML=usuario;
  console.log(usuarios);
}