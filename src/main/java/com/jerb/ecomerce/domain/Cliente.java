package com.jerb.ecomerce.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cliente extends Usuario{
    private String idCliente;
    private String nombre;
    private String direccion;
    private String telefono;
    private List<Orden> ordenes;
}
