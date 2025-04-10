package parcial.api.core.servicios;

import parcial.api.dominio.entidades.Festivo;
import java.util.List;

public interface FestivoPort {
    List<Festivo> obtenerTodos();
    Festivo obtenerPorId(Long id);
    Festivo guardar(Festivo festivo);
    void eliminar(Long id);

}
