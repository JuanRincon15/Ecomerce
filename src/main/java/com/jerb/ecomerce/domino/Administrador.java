package com.jerb.ecomerce.domino;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Administrador extends Cliente{
    private String idAdministrado;
}
