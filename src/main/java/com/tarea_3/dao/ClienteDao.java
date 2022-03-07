package com.tarea_3.dao;

import com.tarea_3.domain.Cliente;
import org.springframework.data.repository.CrudRepository;


public interface ClienteDao extends CrudRepository<Cliente, Long> 
{
    
}
