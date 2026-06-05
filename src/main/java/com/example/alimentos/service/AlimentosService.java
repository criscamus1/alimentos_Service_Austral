package com.example.alimentos.service;

import org.springframework.stereotype.Service;
import com.example.alimentos.model.Alimentos;
import com.example.alimentos.repository.AlimentosRepository;
import com.example.dto.CreateDTO;
import com.example.dto.RequestDTO;
import com.example.exception.exception;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class AlimentosService {
@Autowired
private AlimentosRepository repository;

 public List<Alimentos> getAllRecursos(){
   return repository.findAll();
 }
 public Alimentos buscarAlimento(int id){
   return repository.findById(id).orElseThrow(() -> new exception("El registro de alimentacion no fue encontado"));
 }


 public Alimentos getById(Integer id){
   return repository.findById(id).orElse(null);
 }
 public void setById(Alimentos alim){
   repository.save(alim);
 }

public Alimentos guardarAlimentos( CreateDTO dto){
    Alimentos alim=new Alimentos();
   alim.setJaulaId(dto.jaulaId());
   alim.setTipoAlimento(dto.tipoAlimento());
   alim.setCantidadKg(dto.cantidadKg());
   alim.setFechaAlimentacion(dto.fechaAlimentacion());
   alim.setEstado(dto.estado());
   return repository.save(alim);
}
public Alimentos actualizarAlimentos(Integer id, CreateDTO dto){
   Alimentos alim=buscarAlimento(id);
   alim.setJaulaId(dto.jaulaId());
   alim.setTipoAlimento(dto.tipoAlimento());
   alim.setFechaAlimentacion(dto.fechaAlimentacion());
   alim.setEstado(dto.estado());
   return repository.save(alim);
}



}
