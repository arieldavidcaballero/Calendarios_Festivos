package parcial.api.core.servicios;

import parcial.api.dominio.entidades.Festivo;

import java.util.List;

public interface FestivoService {
    List<Festivo> obtenerTodos();
    Festivo obtenerPorId(Long id);
    Festivo guardarFestivo(Festivo festivo);
    void eliminarFestivo(Long id);
}
