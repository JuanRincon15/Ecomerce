package com.jerb.ecomerce.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cliente extends Usuario{
    private String idCliente;
    private String nombre;
    private String direccion;
    private String telefono;
    private ArrayList<Orden> ordenes;
}
