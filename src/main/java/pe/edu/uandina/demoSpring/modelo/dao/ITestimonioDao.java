package pe.edu.uandina.demoSpring.modelo.dao;

import org.springframework.data.repository.CrudRepository;
import pe.edu.uandina.demoSpring.modelo.Testimonio;

public interface ITestimonioDao extends CrudRepository<Testimonio, Long> {
}
