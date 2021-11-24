package pe.edu.uandina.demoSpring.modelo.services;

import pe.edu.uandina.demoSpring.modelo.Habitacion;
import pe.edu.uandina.demoSpring.modelo.Restaurante;

import java.util.List;

public interface IRestauranteService {
    public List<Restaurante> findAll();
    public Restaurante findById(Long id);
    public Restaurante save(Restaurante restaurante);
    public void delete(Long id);
}
