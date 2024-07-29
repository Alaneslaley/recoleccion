package mx.com.farmanimals.recoleccion.recoleccion.repository;

import mx.com.farmanimals.recoleccion.recoleccion.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByEmail(String email);
}
