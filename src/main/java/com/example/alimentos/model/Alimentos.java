package com.example.alimentos.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Alimentos {
private int id;
private String tipoAlimento;
private double cantidadKg;
private String fecha;
private String estado;
}
