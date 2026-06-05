package com.example.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class RequestDTO {
private Integer id;
private Integer jaulaId;
private String tipoAlimento;
private double cantidadKg;
private String FechaAlimentacion;
private String estado  ; 
}
