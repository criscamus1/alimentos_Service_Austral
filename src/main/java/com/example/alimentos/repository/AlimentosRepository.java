package com.example.alimentos.repository;

import com.example.alimentos.model.Alimentos;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AlimentosRepository {
private List<Alimentos>listaAlimentos=new ArrayList<>();

public List<Alimentos> obtenerAlimentos(){
    return listaAlimentos;
}
public Alimentos buscarAlimentosId(int id){
    for(Alimentos alim:listaAlimentos){
        if(alim.getId()==id){
            return alim;
        }
    }
    return null;
}
public Alimentos actualizar(Alimentos alim){
    int id=0;
    int idPosicion=0;

    for(int i=0;i<listaAlimentos.size();i++){
        if(listaAlimentos.get(i).getId()==alim.getId()){
            id=alim.getId();
            idPosicion=1;
        }
    }
    Alimentos alim1=new Alimentos();
    alim1.setId(id);
    alim1.setTipoAlimento(alim1.getTipoAlimento());
    alim1.setCantidadKg(alim1.getCantidadKg());
    alim1.setFecha(alim1.getFecha());
    alim1.setEstado(alim1.getEstado());
    listaAlimentos.add(idPosicion, alim1);
    return alim1;
}
public Alimentos guardar(Alimentos alim){
    listaAlimentos.add(alim);
    return alim;
}
public void eliminar(int id){
    Alimentos alim=buscarAlimentosId(id);
    if(alim!=null){
        listaAlimentos.remove(id);
    }
}
}
