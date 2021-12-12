package curso.java.curso.repository;

import curso.java.curso.Model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public class UsuarioBdImple implements UsuarioDB{
    @Override
    public List<Usuario> getUsuarios() {
        return null;
    }

    @Override
    public Usuario getUsuario(Long id) {
        return null;
    }

    @Override
    public void deleteUsuario(Long id) {

    }

    @Override
    public void updateUsuario(Usuario usuario) {

    }
}
