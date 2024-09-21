package com.jerb.ecomerce.infrastructure.adapters.input.rest.model.request;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductoCreacionSolicitud {
    @NotBlank(message = "campo nombre no puede ser vacio")
    private String nombre;
    @NotBlank(message = "campo categoria no puede ser vacio")
    private String categoria;
    @NotBlank(message = "campo valor no puede ser vacio")
    private Double valor;
    @NotBlank(message = "campo cantProducto no puede ser vacio")
    private int cantProducto;
}
