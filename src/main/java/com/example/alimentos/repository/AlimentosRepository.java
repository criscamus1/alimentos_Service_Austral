package com.example.alimentos.repository;

import com.example.alimentos.model.Alimentos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface AlimentosRepository extends JpaRepository<Alimentos,Integer> {
}
