package pe.edu.uandina.demoSpring.modelo;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "restaurante")
public class Restaurante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "nomPlato")
    private String nomPlato;
    @Column(name = "precioPlato")
    private float precioPlato;
    @Column(name = "foto")
    private String foto;

    //    pertenece a un detalleReserva
    @OneToMany(mappedBy = "tieneRestaurante")
    private List<DetalleReserva> detalleReservas;

    public Restaurante() {
    }

    public Restaurante(String nomPlato, float precioPlato) {
        this.nomPlato = nomPlato;
        this.precioPlato = precioPlato;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNomPlato() {
        return nomPlato;
    }

    public void setNomPlato(String nomPlato) {
        this.nomPlato = nomPlato;
    }

    public float getPrecioPlato() {
        return precioPlato;
    }

    public void setPrecioPlato(float precioPlato) {
        this.precioPlato = precioPlato;
    }
}