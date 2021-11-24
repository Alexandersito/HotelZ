package pe.edu.uandina.demoSpring.modelo.services;

import pe.edu.uandina.demoSpring.modelo.Restaurante;
import pe.edu.uandina.demoSpring.modelo.Testimonio;

import java.util.List;

public interface ITestimonioService {
    public List<Testimonio> findAll();
    public Testimonio findById(Long id);
    public Testimonio save(Testimonio testimonio);
    public void delete(Long id);
}
