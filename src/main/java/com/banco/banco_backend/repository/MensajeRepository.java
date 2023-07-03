package com.banco.banco_backend.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import com.banco.banco_backend.model.Mensaje;

public interface MensajeRepository extends JpaRepository<Mensaje, Integer>{

	
	

}
