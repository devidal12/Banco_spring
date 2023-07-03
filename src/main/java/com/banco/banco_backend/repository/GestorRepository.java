package com.banco.banco_backend.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.banco.banco_backend.model.Gestor;


public interface GestorRepository extends JpaRepository<Gestor, Integer>{

	public Optional<Gestor> findFirstByCorreo(String correo);
	public Optional<Gestor> findFirstByCorreoAndPassword(String correo, String password);
	
}



