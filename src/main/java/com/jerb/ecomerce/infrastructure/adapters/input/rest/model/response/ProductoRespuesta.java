package com.jerb.ecomerce.infrastructure.adapters.input.rest.model.response;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductoRespuesta {
    private String idProducto;
    private String nombre;
    private String categoria;
    private Double valor;
}
