package pe.edu.uandina.demoSpring.modelo.services;

import pe.edu.uandina.demoSpring.modelo.Cliente;

import java.util.List;

public interface IClienteService {
    public List<Cliente> findAll();
    public Cliente findById(Long id);
    public Cliente save(Cliente cliente);
    public void delete(Long id);
}
