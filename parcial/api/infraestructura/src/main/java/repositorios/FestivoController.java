package campeonatosfifa.api.infraestructura.repositorios;

import parcial.api.core.servicios.FestivoService;
import parcial.api.dominio.entidades.Festivo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/festivos")
public class FestivoController {

    @Autowired
    private FestivoService festivoService;

    @GetMapping
    public List<Festivo> obtenerTodos() {
        return festivoService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public Festivo obtenerPorId(@PathVariable Long id) {
        return festivoService.obtenerPorId(id);
    }

    @PostMapping
    public Festivo guardar(@RequestBody Festivo festivo) {
        return festivoService.guardarFestivo(festivo);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        festivoService.eliminarFestivo(id);
    }
}
