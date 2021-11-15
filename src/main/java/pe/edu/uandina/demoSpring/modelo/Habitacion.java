package pe.edu.uandina.demoSpring.modelo;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "habitacion")
public class Habitacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "foto")
    private String foto;
    @Column(name = "estado")
    private String estado;
    @Column(name = "tipo")
    private String tipo;
    @Column(name = "precio")
    private float precio;
    @Column(name = "descripcion")
    private String descripcion;

    //    pertenece a un detalleReserva
    @OneToMany(mappedBy = "tieneHabitacion")
    private List<DetalleReserva> detalleReservas;

    public Habitacion() {
    }

    public Habitacion(String nombre, String estado, String tipo, float precio, String descripcion) {
        this.nombre = nombre;
        this.estado = estado;
        this.tipo = tipo;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}