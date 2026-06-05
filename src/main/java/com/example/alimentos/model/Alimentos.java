package com.example.alimentos.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name="alimentos")
public class Alimentos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "jaula_id", nullable = false)
    private int jaulaId;

    @Column(name = "tipo_alimento", nullable = false, length = 100)
    private String tipoAlimento;

    @Column(name = "cantidad_kg", nullable = false)
    private double cantidadKg;

    @Column(name = "fecha_alimentacion", nullable = false,length = 40)
    private String fechaAlimentacion;

    @Column(name = "estado", nullable = false, length = 30)
    private String estado;
}
