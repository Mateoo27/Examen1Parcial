package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MateoClienteService {

    @Autowired
    private MateoClienteRepository repository;

    public List<MateoCliente> getAll() {
        return repository.findAll();
    }

    public MateoCliente save(com.example.demo.entity.MateoCliente cliente) {
        return repository.save(cliente);
    }

    public void deleteByName(String descripcion) {
        repository.deleteByName(descripcion);
    }
}