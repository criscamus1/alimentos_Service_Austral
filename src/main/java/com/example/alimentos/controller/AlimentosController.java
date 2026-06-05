package com.example.alimentos.controller;

import com.example.alimentos.model.Alimentos;
import com.example.alimentos.service.AlimentosService;
import com.example.dto.CreateDTO;

import  org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.validation.Valid;

import  org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;




@RestController
@RequestMapping("/api/v1/alimentos")
public class AlimentosController {
@Autowired
private AlimentosService service;
    @GetMapping
    public List<Alimentos> obtenerAlimentos(){
        return service.getAllRecursos();
    }
    @GetMapping("/{id}")
    public Alimentos buscarAlimento(@PathVariable Integer id){
     return service.buscarAlimento(id);
    }
    @PostMapping
    public Alimentos guardarAlimentos(@Valid @RequestBody CreateDTO dto){
        return service.guardarAlimentos(dto);
    }

    @PutMapping("/{id}")
    public Alimentos actualizarAlimentos(@PathVariable Integer id,@Valid @RequestBody CreateDTO dto){
        return service.actualizarAlimentos(id,dto);
    }


}
