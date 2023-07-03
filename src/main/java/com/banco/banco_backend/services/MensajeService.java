package com.banco.banco_backend.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banco.banco_backend.model.Mensaje;
import com.banco.banco_backend.repository.MensajeRepository;



@Service
public class MensajeService {
	
	
	@Autowired
	MensajeRepository mensajeRepository;

	public ArrayList<Mensaje> leerMensaje(){
		return (ArrayList<Mensaje>) this.mensajeRepository.findAll();
	}
	
	public Mensaje guardarMensaje(Mensaje mensaje){
		return this.mensajeRepository.save(mensaje);
	}
	
	public Optional<Mensaje> leerMensajePorId(Integer id){
		return this.mensajeRepository.findById(id);
	}
	
	public void borrarMensajePorId(Integer id) {
		this.mensajeRepository.deleteById(id);
	}
	
	
}
