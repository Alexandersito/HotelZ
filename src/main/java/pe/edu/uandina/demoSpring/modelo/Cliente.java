package pe.edu.uandina.demoSpring.modelo;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "foto")
    private String foto;
    @Column(name = "modo")
    private String modo;
    @Column(name = "telefono")
    private String telefono;
    @Column(name = "email")
    private String email;
    @Column(name = "pais")
    private String pais;
    @Column(name = "dni")
    private String dni;

    @OneToMany(mappedBy = "tieneTestimonio")
//    @JsonManagedReference
    private List<Testimonio> testimonios;

    @OneToMany(mappedBy = "tieneDetalleReserva")
//    @JsonManagedReference
    private List<DetalleReserva> detalleReservas;

    public Cliente() {
    }

    public Cliente(String nombre, String modo, String telefono, String email, String pais, String dni) {
        this.nombre = nombre;
        this.modo = modo;
        this.telefono = telefono;
        this.email = email;
        this.pais = pais;
        this.dni = dni;
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
    public String getModo() {
        return modo;
    }

    public void setModo(String modo) {
        this.modo = modo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public List<Testimonio> getTestimonios() {
        return testimonios;
    }

    public void setTestimonios(List<Testimonio> testimonios) {
        this.testimonios = testimonios;
    }

    public List<DetalleReserva> getDetalleReservas() {
        return detalleReservas;
    }

    public void setDetalleReservas(List<DetalleReserva> detalleReservas) {
        this.detalleReservas = detalleReservas;
    }
}
