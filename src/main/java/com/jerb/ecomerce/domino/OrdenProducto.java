package com.jerb.ecomerce.domino;

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
