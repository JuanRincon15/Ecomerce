package com.jerb.ecomerce.infrastructure.adapters.input.rest.model.request;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdministradorCreacionSolicitud {
    @NotBlank(message = "campo correo no puede ser vacio")
    private String correo;
    @NotBlank(message = "campo clave no puede ser vacio")
    private String clave;
}
