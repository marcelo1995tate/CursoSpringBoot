package curso.java.curso.controllers;

import curso.java.curso.Model.Usuario;
import curso.java.curso.repository.UsuarioDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping(value = "usuario")
public class UsuarioController {
    @Autowired
    private UsuarioDB usuarioDB;

    @RequestMapping (value = "usuario-save",method = RequestMethod.POST)
    public void saveUsuario(@RequestBody Usuario usuario){
        usuarioDB.saveUsuario(usuario);
    }

    @RequestMapping (value = "usuario-delete/{id}",method = RequestMethod.DELETE)
    public void deleteUsuario(@PathVariable Long id){
        usuarioDB.deleteUsuario(id);
    }
    @RequestMapping (value = "usuario-update", method = RequestMethod.PUT)
    public void updateUsuario(@RequestBody Usuario usuario){
        usuarioDB.updateUsuario(usuario);
    }
    @RequestMapping (value = "usuario-find-all", method = RequestMethod.GET)
    public List<Usuario> findAllUsuario(){
        return usuarioDB.getUsuarios();
    }
    @RequestMapping (value = "usuario-find/{id}", method = RequestMethod.GET)
    public Usuario findUsuario(@PathVariable Long id){
        return usuarioDB.getUsuario(id);
    }
}
