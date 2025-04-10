package parcial.api.core.servicios;

import parcial.api.dominio.entidades.Festivo;
import java.util.List;

public class FestivoServiceImpl implements FestivoService {

    private final FestivoPort festivoPort;

    public FestivoServiceImpl(FestivoPort festivoPort) {
        this.festivoPort = festivoPort;
    }

    @Override
    public List<Festivo> obtenerTodos() {
        return festivoPort.obtenerTodos();
    }

    @Override
    public Festivo obtenerPorId(Long id) {
        return festivoPort.obtenerPorId(id);
    }

    @Override
    public Festivo guardarFestivo(Festivo festivo) {
        return festivoPort.guardar(festivo);
    }

    @Override
    public void eliminarFestivo(Long id) {
        festivoPort.eliminar(id);
    }
}
