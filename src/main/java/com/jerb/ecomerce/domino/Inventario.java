package com.jerb.ecomerce.domino;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Inventario {
    private String idProducto;
    private int cantProducto;
}
