package pe.edu.uandina.demoSpring.modelo.services;

import pe.edu.uandina.demoSpring.modelo.Administrador;
import pe.edu.uandina.demoSpring.modelo.DetalleReserva;

import java.util.List;

public interface IDetalleReservaService {
    public List<DetalleReserva> findAll();
    public DetalleReserva findById(Long id);
    public DetalleReserva save(DetalleReserva detalleReserva);
    public void delete(Long id);
}
