package com.jerb.ecomerce.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Evento {
    private LocalDateTime fechaInicio;
    private LocalDateTime fechaFin;
    private String nombre;
    private Float porcentajeDescuento;
    private Boolean aleatorio;
}
