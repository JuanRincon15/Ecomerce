package com.jerb.ecomerce.infrastructure.adapters.input.rest.model.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrdenRespuesta {
    private String idOrden;
    private Double valorOrden;
}
