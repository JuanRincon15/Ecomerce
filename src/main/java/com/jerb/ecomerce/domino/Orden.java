package com.jerb.ecomerce.domino;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Orden {
    private String idOrden;
    private Double valorOrden;

}
