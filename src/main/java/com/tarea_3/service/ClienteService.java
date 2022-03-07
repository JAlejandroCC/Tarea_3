
package com.tarea_3.service;
import com.tarea_3.domain.Cliente;
import java.util.List;


public interface ClienteService
{
    public List<Cliente> getClientes();
    
    public void save(Cliente cliente);
    
    public void delete(Cliente cliente);
    
    public Cliente getCliente(Cliente cliente);
}
