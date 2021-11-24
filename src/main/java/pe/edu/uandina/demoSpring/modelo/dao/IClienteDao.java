package pe.edu.uandina.demoSpring.modelo.dao;

import org.springframework.data.repository.CrudRepository;
import pe.edu.uandina.demoSpring.modelo.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long> {
}
