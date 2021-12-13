package curso.java.curso.repository;

import curso.java.curso.Model.Usuario;

import java.util.List;

public interface UsuarioDB {

    List<Usuario> getUsuarios();
    Usuario getUsuario(Long id);
    void deleteUsuario(Long id);
    void updateUsuario(Usuario usuario);
    void saveUsuario(Usuario usuario);
}
