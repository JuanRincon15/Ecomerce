package com.jerb.ecomerce.domain;
import java.util.Random;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {
    private String correo;
    private String clave;

    public String generarcadena(int longitud){
        Random random = new Random();
        StringBuilder sb = new StringBuilder(longitud);

        for (int i = 0; i < longitud; i++) {
            sb.append(random.nextInt(10)); // genera un número entre 0 y 9
        }

        return sb.toString();
    }
}
