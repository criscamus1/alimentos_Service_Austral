package com.example.alimentos.controller;

import com.example.alimentos.model.Alimentos;
import com.example.alimentos.service.AlimentosService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import  org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
@RequestMapping("/alimentos")
public class AlimentosController {
@Autowired
private AlimentosService service;

@GetMapping
public List<Alimentos>listarAlimentos(){
    return service.obtenerAlimentos();
}
@GetMapping("/{id}")
public Alimentos buscarAlimentos(@PathVariable int id){
    return service.buscarAlimentos(id);
}
@PostMapping
public Alimentos guardarAlimentos(@RequestBody Alimentos alim){
    return service.guardarAlimentos(alim);
}

@PutMapping
public Alimentos actualizarAlimentos(@RequestBody Alimentos alim){
    return service.actualizarAlimentos(alim);
}
@DeleteMapping("/{id}")
public void eliminarAlimentos(@PathVariable int id){
     service.eliminarAlimento(id);
}


}
