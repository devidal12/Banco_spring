package com.banco.banco_backend.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import com.banco.banco_backend.model.Cliente;
import com.banco.banco_backend.model.Transferencia;

public interface TransferenciaRepository extends JpaRepository<Transferencia, Integer>{
	public ArrayList <Transferencia> findByBeneficiarioId(Integer id);
	public ArrayList <Transferencia> findByOrdenanteId(Integer id);
}
