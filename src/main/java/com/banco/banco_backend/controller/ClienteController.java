package com.banco.banco_backend.controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.banco.banco_backend.model.Cliente;
import com.banco.banco_backend.services.ClienteService;


@RestController
@RequestMapping("/cliente")
@CrossOrigin(origins = "http://localhost:4200")
public class ClienteController {

	   @Autowired
	   ClienteService clienteService;
	   
	   @GetMapping()
		   public ArrayList<Cliente> obtenerClientes(){
			   return this.clienteService.leerClientes();
		   }
	   
	   @GetMapping(path = "/gestor/{idGestor}")
	   public ArrayList<Cliente> buscarClientePorGestor(@PathVariable ("idGestor") Integer id){
		   return this.clienteService.buscarClientePorGestor(id);
	   }
	   
	   @GetMapping(path = "/{id}")
	   public  Optional<Cliente> obtenerCliente(@PathVariable("id")  Integer id){
		   return this.clienteService.leerClientePorId(id);
	   }
	   
	   
	   @PostMapping()
	   public Cliente guardarCliente(@RequestBody Cliente cliente) {
		   return this.clienteService.guardarCliente(cliente);
		   }
	   
	   @DeleteMapping(path = "/{id}")
	   public void borrarCliente(@PathVariable("id")  Integer id){
		   this.clienteService.borrarClientePorId(id);
	   }
	   
	   
	   @GetMapping(path = "/correo/{correo}")
	   public  Optional<Cliente> obtenerCliente(@PathVariable("correo") String correo){
		   return this.clienteService.buscarClientePorCorreo(correo);
	   }
	   
	   @GetMapping(path = "/login")
	   public  Optional<Cliente> logearCliente(@RequestParam("correo") String correo, @RequestParam("pass") String password){
		   return this.clienteService.buscarClientePorCorreoYPass(correo, password);
	   }
	   

}
