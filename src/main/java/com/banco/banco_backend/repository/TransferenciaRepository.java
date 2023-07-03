package com.banco.banco_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.banco.banco_backend.model.Transferencia;

public interface TransferenciaRepository extends JpaRepository<Transferencia, Integer>{

}
