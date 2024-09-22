package com.jerb.ecomerce.infrastructure.adapters.input.rest.model.request;

import com.jerb.ecomerce.domain.OrdenProducto;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrdenCreacionSolicitud {
    @NotBlank(message = "campo idCliente no puede ser vacio")
    private String idClienteOrden;
    @NotBlank(message = "campo productos no puede ser vacio")
    private List<OrdenProducto> productos;
}
