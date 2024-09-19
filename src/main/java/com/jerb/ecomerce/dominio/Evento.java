package com.jerb.ecomerce.dominio;

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
    private Float porcentajeDescuento;
}
