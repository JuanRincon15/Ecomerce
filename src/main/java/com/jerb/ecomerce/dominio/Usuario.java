package com.jerb.ecomerce.dominio;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Usuario  extends  Cliente{
    private String correo;
    private String clave;


}
