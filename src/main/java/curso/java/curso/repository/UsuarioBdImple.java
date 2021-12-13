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
        return em.find(Usuario.class, id);
    }

    @Override
    public void deleteUsuario(Long id) {
        Usuario usuario=em.find(Usuario.class, id);
        em.remove(usuario);
    }
    @Override
    public void updateUsuario(Usuario usuario) {

    }
    @Override
    public void saveUsuario(Usuario usuario) {
        em.merge(usuario);
    }

    @Override
    public boolean verificarUsuarioLogin(Usuario usuario) {
        String query="FROM Usuario u WHERE u.email=:email AND u.password=:password";
        List <Usuario> usuarios= em.createQuery(query)
                .setParameter("email",usuario.getEmail())
                .setParameter("password",usuario.getPassword())
                .getResultList();

        return !usuarios.isEmpty();
    }
}
