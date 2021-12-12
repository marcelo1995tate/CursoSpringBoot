package curso.java.curso.controllers;

import curso.java.curso.Model.Usuario;
import curso.java.curso.repository.UsuarioDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "usuario")
public class UsuarioController {
    @Autowired
    private UsuarioDB usuarioDB;

    @RequestMapping(value = "prueba")
    public String prueba(){
        return "PRUEBA DEL PRIMER CONTROLLER CON ACTION";
    }

    @RequestMapping(value = "prueba-lista")
    public List<String> pruebaLista(){
        return List.of("perro","gato","pez");
    }

    @RequestMapping (value = "usuario")
    public Usuario getUsuario(){
        Usuario usuario=new Usuario();
        usuario.setNombre("Marcelo");
        usuario.setApellido("ZELAYA");
        usuario.setEmail("marcelozelaya95@gmail.com");
        usuario.setPassword("123456789");
        return usuario;
    }
    @RequestMapping (value = "usuario-delete/{id}",method = RequestMethod.DELETE)
    public void deleteUsuario(@PathVariable Long id){
        usuarioDB.deleteUsuario(id);
    }
    @RequestMapping (value = "usuario-update")
    public Usuario updateUsuario(){
        Usuario usuario=new Usuario();
        usuario.setNombre("Marcelo");
        usuario.setApellido("ZELAYA");
        usuario.setEmail("marcelozelaya95@gmail.com");
        usuario.setPassword("123456789");
        return usuario;
    }
    @RequestMapping (value = "usuario-find-all")
    public List<Usuario> findAllUsuario(){
        return usuarioDB.getUsuarios();
    }
    @RequestMapping (value = "usuario-find/{id}")
    public Usuario findUsuario(@PathVariable Long id){
        Usuario usuario=new Usuario();
        usuario.setId(id);
        usuario.setNombre("Marcelo");
        usuario.setApellido("ZELAYA");
        usuario.setEmail("marcelozelaya95@gmail.com");
        usuario.setPassword("123456789");
        return usuario;
    }
}
