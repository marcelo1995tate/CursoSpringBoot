package curso.java.curso.repository;

import curso.java.curso.Model.Usuario;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class UsuarioBdImple implements UsuarioDB{

    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional
    public List<Usuario> getUsuarios() {
        String query="FROM Usuario";
         return em.createQuery(query).getResultList();
    }

    @Override
    public Usuario getUsuario(Long id) {
        return null;
    }

    @Override
    public void deleteUsuario(Long id) {
        Usuario usuario=em.find(Usuario.class, id);
        em.remove(usuario);
    }

    @Override
    public void updateUsuario(Usuario usuario) {

    }
}
