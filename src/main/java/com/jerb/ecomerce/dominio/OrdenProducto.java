package com.jerb.ecomerce.dominio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrdenProducto {
    private String idOrden;
    private String idProducto;
}
