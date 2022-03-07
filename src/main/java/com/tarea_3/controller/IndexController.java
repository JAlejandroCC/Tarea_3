package com.tarea_3.controller;


import com.tarea_3.domain.Cliente;
import com.tarea_3.service.ClienteService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
@Controller
@Slf4j

public class IndexController
{
   @Autowired
   public ClienteService clienteService;
   @GetMapping("/")
   public String inicio(Model model)
   {
       log.info("Estamos usando una arquitectura mvc");
      
       var clientes=clienteService.getClientes();
       model.addAttribute("clientes",clientes);
       return "Index";
   }
   
   @GetMapping("/nuevoCliente")
   public String nuevoCliente(Cliente cliente){
       return "modificarCliente";
   }
   
   @PostMapping("/guardarCliente")
   public String guardarCliente(Cliente cliente)
   {
       clienteService.save(cliente);
       return "redirect:/";
   }
   
   @GetMapping("/modificarCliente/{idcliente}")
   public String modificarCliente(Cliente cliente, Model model)
   {
       cliente = clienteService.getCliente(cliente);
       model.addAttribute("cliente",cliente);
       return "modificarCliente";
   }
   
   @GetMapping("/eliminarCliente/{idcliente}")
   public String eliminarCliente(Cliente cliente, Model model)
   {
       
       clienteService.delete(cliente);
       return "redirect:/";
   }
   
}
