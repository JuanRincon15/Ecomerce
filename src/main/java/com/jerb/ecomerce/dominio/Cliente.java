package com.jerb.ecomerce.dominio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {
    private String idCliente;
    private String nombre;
    private String direccion;
    private String telefono;
    private ArrayList<Orden> ordenes;
}
