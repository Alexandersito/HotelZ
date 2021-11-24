package pe.edu.uandina.demoSpring.modelo.services;

import pe.edu.uandina.demoSpring.modelo.Administrador;
import pe.edu.uandina.demoSpring.modelo.Cliente;
import pe.edu.uandina.demoSpring.modelo.Administrador;

import java.util.List;

public interface IAdministradorService {
    public List<Administrador> findAll();
    public Administrador findById(Long id);
    public Administrador save(Administrador administrador);
    public void delete(Long id);
}
