package com.banco.banco_backend.repository;


import java.util.ArrayList;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.banco.banco_backend.model.Cliente;



public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

	public Optional<Cliente> findFirstByCorreo(String correo);
	public Optional<Cliente> findFirstByCorreoAndPassword(String correo, String password);
	public ArrayList <Cliente> findByGestorId(Integer id);
	
}