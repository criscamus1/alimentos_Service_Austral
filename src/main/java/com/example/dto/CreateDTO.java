package com.example.dto;

import java.time.LocalDate;

import jakarta.validation.constraints.*;


public record CreateDTO (
   @NotNull(message = "La jaula es obligatoria")
    Integer jaulaId,

    @NotBlank(message = " indicar el tipo de alimento")
    String tipoAlimento,

    @Positive(message = "La cantidad no puede ser menor de 0")
    Double cantidadKg,

    @NotNull(message = "La fecha es obligatoria")
    String fechaAlimentacion,

    @NotBlank(message = "El estado es obligatorio")
    String estado

) {}


