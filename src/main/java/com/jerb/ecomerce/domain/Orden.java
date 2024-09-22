package com.jerb.ecomerce.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Random;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Orden {
    private String idClienteOrden;
    private String idOrden;
    private Double valorOrden;
    public String generarcadena(int longitud){
        Random random = new Random();
        StringBuilder sb = new StringBuilder(longitud);

        for (int i = 0; i < longitud; i++) {
            sb.append(random.nextInt(10)); // genera un número entre 0 y 9
        }

        return sb.toString();
    }
}
