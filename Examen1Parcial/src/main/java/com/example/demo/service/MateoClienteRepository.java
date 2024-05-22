package com.example.demo.service;

import java.util.List;

public class MateoClienteRepository {

    public List<MateoCliente> findAll() {
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    public MateoCliente save(com.example.demo.entity.MateoCliente cliente) {
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    public void deleteByName(String descripcion) {
        throw new UnsupportedOperationException("Unimplemented method 'deleteByName'");
    }

    public com.example.demo.entity.MateoCliente saveMateoCliente(com.example.demo.entity.MateoCliente cliente) {
        return cliente;
    }

}
