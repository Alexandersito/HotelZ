package pe.edu.uandina.demoSpring.modelo.dao;

import org.springframework.data.repository.CrudRepository;
import pe.edu.uandina.demoSpring.modelo.DetalleReserva;

public interface IDetalleReservaDao extends CrudRepository<DetalleReserva,Long> {
}
