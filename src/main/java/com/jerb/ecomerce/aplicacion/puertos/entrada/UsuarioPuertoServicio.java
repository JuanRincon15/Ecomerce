package com.jerb.ecomerce.aplicacion.puertos.entrada;

import com.jerb.ecomerce.domino.Administrador;
import com.jerb.ecomerce.domino.Cliente;
import com.jerb.ecomerce.domino.Usuario;

public interface UsuarioPuertoServicio {
    Boolean login(String correo, String clave);
    Administrador CrearAdministrador(String correo, String clave);
    Cliente CrearCliente(String correo, String clave, String nombre, String direccion, String telefono);


}
