package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.service.MateoCliente;

import java.util.Optional;

public interface MateoClienteRepository extends JpaRepository<MateoCliente, Long> {
    void deleteByDescripcion(String descripcion);
    Optional<MateoCliente> findByDescripcion(String descripcion);
}