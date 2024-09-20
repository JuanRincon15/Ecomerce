package com.jerb.ecomerce.infrastructure.adapters.input.rest.model.response;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClienteRespuesta {
    private String idCliente;
    private String correo;
    private String clave;
    private String nombre;
    private String direccion;
    private String telefono;
}
