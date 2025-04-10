package parcial.api.dominio.entidades;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "pais")
public class Pais {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    @OneToMany(mappedBy = "pais", cascade = CascadeType.ALL)
    private List<Festivo> festivos;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Festivo> getFestivos() {
        return festivos;
    }

    public void setFestivos(List<Festivo> festivos) {
        this.festivos = festivos;
    }

    
}

