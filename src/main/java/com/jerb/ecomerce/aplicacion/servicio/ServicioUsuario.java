package com.jerb.ecomerce.aplicacion.servicio;

import com.jerb.ecomerce.aplicacion.puertos.entrada.UsuarioPuertoServicio;
import com.jerb.ecomerce.domino.Administrador;
import com.jerb.ecomerce.domino.Cliente;
import org.springframework.stereotype.Service;

@Service
public class ServicioUsuario implements UsuarioPuertoServicio {
    @Override
    public Boolean login(String correo, String clave) {
        return null;
    }

    @Override
    public Administrador CrearAdministrador(String correo, String clave) {
        return null;
    }

    @Override
    public Cliente CrearCliente(String correo, String clave, String nombre, String direccion, String telefono) {
        return null;
    }
}
