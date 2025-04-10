package parcial.api.dominio.entidades;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "tipo")
public class Tipo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descripcion;

    @OneToMany(mappedBy = "tipo", cascade = CascadeType.ALL)
    private List<Festivo> festivos;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Festivo> getFestivos() {
        return festivos;
    }

    public void setFestivos(List<Festivo> festivos) {
        this.festivos = festivos;
    }

    
}
