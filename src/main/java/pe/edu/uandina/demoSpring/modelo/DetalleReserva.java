package pe.edu.uandina.demoSpring.modelo;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "DetalleReserva")
public class DetalleReserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "ingreso")
    private String ingreso;
    @Column(name = "salida")
    private String salida;
    @Column(name = "precio")
    private float precio;
    @Column(name = "adelanto")
    private float adelanto;
    @Column(name = "dias")
    private int dias;

    //    pertenece a un cliente
    @OneToMany(mappedBy = "tieneDetalleReserva")
    private List<Cliente> clientes;

    //referencia de muchos a uno para tieneRestaurante
    @ManyToOne
    @JoinColumn(name = "tieneRestaurante", referencedColumnName = "id")
    private Testimonio tieneRestaurante;

    //referencia de muchos a uno para tieneHabitacion
    @ManyToOne
    @JoinColumn(name = "tieneHabitacion", referencedColumnName = "id")
    private Testimonio tieneHabitacion;

    public DetalleReserva() {
    }

    public DetalleReserva(String ingreso, String salida, float precio, float adelanto, Integer dias) {
        this.ingreso = ingreso;
        this.salida = salida;
        this.precio = precio;
        this.adelanto = adelanto;
        this.dias = dias;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIngreso() {
        return ingreso;
    }

    public void setIngreso(String ingreso) {
        this.ingreso = ingreso;
    }

    public String getSalida() {
        return salida;
    }

    public void setSalida(String salida) {
        this.salida = salida;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getAdelanto() {
        return adelanto;
    }

    public void setAdelanto(float adelanto) {
        this.adelanto = adelanto;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public Testimonio getTieneRestaurante() {
        return tieneRestaurante;
    }

    public void setTieneRestaurante(Testimonio tieneRestaurante) {
        this.tieneRestaurante = tieneRestaurante;
    }

    public Testimonio getTieneHabitacion() {
        return tieneHabitacion;
    }

    public void setTieneHabitacion(Testimonio tieneHabitacion) {
        this.tieneHabitacion = tieneHabitacion;
    }
}
