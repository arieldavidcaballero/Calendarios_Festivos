package parcial.api.infraestructura.repositorios;

import parcial.api.dominio.entidades.Festivo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FestivoRepository extends JpaRepository<Festivo, Long> {
}
