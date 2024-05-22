package com.example.demo.controller;

import com.example.demo.entity.MateoCliente;
import com.example.demo.service.MateoClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/mateo-clientes")
public class MateoClienteController {

    @Autowired
    private MateoClienteService service;

    @ApiOperation("Obtener todos los clientes")
    @GetMapping
    public List<com.example.demo.service.MateoCliente> getAll() {
        return service.getAll();
    }

    @ApiOperation("Guardar un nuevo cliente")
    @PostMapping
    public com.example.demo.service.MateoCliente save(@RequestBody MateoCliente cliente) {
        return service.save(cliente);
    }

    @ApiOperation("Borrar un cliente por el nombre")
    @DeleteMapping("/{nombre}")
    public void deleteByName(@PathVariable String nombre) {
        service.deleteByName(nombre);
    }
}