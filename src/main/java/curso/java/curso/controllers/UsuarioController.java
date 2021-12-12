package curso.java.curso.controllers;

import curso.java.curso.Model.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "usuario")
public class UsuarioController {

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
    @RequestMapping (value = "usuario-delete")
    public Usuario deleteUsuario(){
        Usuario usuario=new Usuario();
        usuario.setNombre("Marcelo");
        usuario.setApellido("ZELAYA");
        usuario.setEmail("marcelozelaya95@gmail.com");
        usuario.setPassword("123456789");
        return usuario;
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
        List<Usuario> usuarios= new ArrayList<Usuario>();
        Usuario usuario=new Usuario();
        usuario.setId(1l);
        usuario.setNombre("Marcelo");
        usuario.setApellido("ZELAYA");
        usuario.setEmail("marcelo@gmail.com");
        usuario.setPassword("123456789");
        Usuario usuario2=new Usuario();
        usuario2.setId(2l);
        usuario2.setNombre("Andres");
        usuario2.setApellido("ZELAYA");
        usuario2.setEmail("andres@gmail.com");
        usuario2.setPassword("abcdefghi");
        Usuario usuario3=new Usuario();
        usuario3.setId(3l);
        usuario3.setNombre("Zelaya");
        usuario3.setApellido("ZELAYA");
        usuario3.setEmail("zelaya95@gmail.com");
        usuario3.setPassword("zxcvbnm");

        usuarios.add(usuario);
        usuarios.add(usuario2);
        usuarios.add(usuario3);
        return usuarios;
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
