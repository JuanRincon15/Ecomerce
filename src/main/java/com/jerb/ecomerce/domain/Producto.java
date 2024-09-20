package com.jerb.ecomerce.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Producto {
    private String idProducto;
    private String nombre;
    private String categoria;
    private Double valor;
}
