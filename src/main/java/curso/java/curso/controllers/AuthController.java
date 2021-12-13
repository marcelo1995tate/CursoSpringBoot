package curso.java.curso.controllers;

import curso.java.curso.Model.Usuario;
import curso.java.curso.repository.UsuarioDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import util.Hash;

@RestController
@RequestMapping(value = "login")
public class AuthController {
    @Autowired
    private UsuarioDB usuarioDB;

    @RequestMapping(value = "usuario-login",method = RequestMethod.POST)
    public String loginUsuario(@RequestBody Usuario usuario){
        usuario.setPassword(Hash.MD5(usuario.getPassword()));
        if(usuarioDB.verificarUsuarioLogin(usuario)){
            return "OK";
        }
        else {
            return "FAIL";
        }
    }
}
