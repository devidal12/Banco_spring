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
import org.springframework.web.bind.annotation.RestController;

import com.banco.banco_backend.model.Cliente;
import com.banco.banco_backend.model.Transferencia;
import com.banco.banco_backend.services.TransferenciaService;


@RestController
@RequestMapping("/transferencia")
@CrossOrigin(origins = "http://localhost:4200")
public class TransferenciaController {

	@Autowired
    TransferenciaService transferenciaService;
	
	
	@GetMapping()
	   public ArrayList<Transferencia> obtenerTransferencias(){
		   return this.transferenciaService.leerTransferencia();
	   }

@GetMapping(path = "/{id}")
public  Optional<Transferencia> obtenerTransferencia(@PathVariable("id")  Integer id){
	   return this.transferenciaService.leerTransferenciaPorId(id);
}


@PostMapping()
public Transferencia guardarTransferencia(@RequestBody Transferencia transferencia) {
	   return this.transferenciaService.guardarTransferencia(transferencia);
	   }

@DeleteMapping(path = "/{id}")
public void borrarTransferencia(@PathVariable("id")  Integer id){
	   this.transferenciaService.borrarTransferenciaPorId(id);
}

@GetMapping(path = "/beneficiario/{beneficiario_id}")
public ArrayList<Transferencia> buscarTransferenciaPorBeneficiarioId(@PathVariable ("beneficiario_id") Integer id){
	   return this.transferenciaService.buscarTransferenciaPorBeneficiarioId(id);
}

@GetMapping(path = "/ordenante/{ordenante_id}")
public ArrayList<Transferencia> buscarTransferenciaPorOrdenanteId(@PathVariable ("ordenante_id") Integer id){
	   return this.transferenciaService.buscarTransferenciaPorOrdenanteId(id);

}
}
