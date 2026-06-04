package com.example.alimentos.service;

import org.springframework.stereotype.Service;
import com.example.alimentos.model.Alimentos;
import com.example.alimentos.repository.AlimentosRepository;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class AlimentosService {
@Autowired
private AlimentosRepository repository;

public List<Alimentos>obtenerAlimentos(){
    return repository.obtenerAlimentos();
}
public Alimentos buscarAlimentos(int id){
    return repository.buscarAlimentosId(id);
}
public Alimentos guardarAlimentos(Alimentos alim){
    return repository.guardar(alim);
}
public Alimentos actualizarAlimentos(Alimentos alim){
    return repository.actualizar(alim);
}
public String eliminarAlimento(int id){
    repository.eliminar(id);
    return "el alimento ha sido borrado";
}
}
