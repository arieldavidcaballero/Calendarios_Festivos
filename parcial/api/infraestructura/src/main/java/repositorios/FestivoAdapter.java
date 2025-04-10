package campeonatosfifa.api.infraestructura.repositorios;

import parcial.api.core.servicios.FestivoPort;
import parcial.api.dominio.entidades.Festivo;
import parcial.api.infraestructura.repositorios.FestivoRepository;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FestivoAdapter implements FestivoPort {

    @Autowired
    private FestivoRepository festivoRepository;

    @Override
    public List<Festivo> obtenerTodos() {
        return festivoRepository.findAll();
    }

    @Override
    public Festivo guardar(Festivo festivo) {
        return festivoRepository.save(festivo);
    }

    @Override
    public void eliminar(Long id) {
        festivoRepository.deleteById(id);
    }

    @Override
    public Festivo obtenerPorId(Long id) {
        return festivoRepository.findById(id).orElse(null);
    }
}

