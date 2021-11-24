package pe.edu.uandina.demoSpring.modelo.dao;

import org.springframework.data.repository.CrudRepository;
import pe.edu.uandina.demoSpring.modelo.Restaurante;

public interface IRestauranteDao extends CrudRepository<Restaurante,Long> {
}
