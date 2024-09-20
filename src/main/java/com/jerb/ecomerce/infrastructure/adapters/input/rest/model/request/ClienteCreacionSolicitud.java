package com.jerb.ecomerce.infrastructure.adapters.input.rest.model.request;

import com.jerb.ecomerce.domain.Orden;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClienteCreacionSolicitud {
    @NotBlank(message = "campo correo no puede ser vacio")
    private String correo;
    @NotBlank(message = "campo clave no puede ser vacio")
    private String clave;
    @NotBlank(message = "campo nombre no puede ser vacio")
    private String nombre;
    @NotBlank(message = "campo direccion no puede ser vacio")
    private String direccion;
    @NotBlank(message = "campo telefono no puede ser vacio")
    private String telefono;
}
