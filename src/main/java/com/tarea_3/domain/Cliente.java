package com.tarea_3.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name="cliente")

public class Cliente implements Serializable
{
    private static final long serialVersionUID= 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Long idcliente;
    private String nombre;
    private String apellidos;
    private String destino;
    private String fecha;

     public Cliente() {}
     
    public Cliente(String nombre, String apellidos, String destino, String fecha)
    {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.destino = destino;
        this.fecha = fecha;
    }

   
    
    
}
