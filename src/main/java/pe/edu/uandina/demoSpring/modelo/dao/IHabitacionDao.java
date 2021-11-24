package pe.edu.uandina.demoSpring.modelo.dao;

import org.springframework.data.repository.CrudRepository;
import pe.edu.uandina.demoSpring.modelo.Habitacion;


public interface IHabitacionDao extends CrudRepository<Habitacion, Long> {
}
