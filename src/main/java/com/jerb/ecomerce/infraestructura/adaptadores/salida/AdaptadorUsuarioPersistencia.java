package com.jerb.ecomerce.infraestructura.adaptadores.salida;

import com.jerb.ecomerce.aplicacion.puertos.salida.UsuarioPuertoPersistencia;
import com.jerb.ecomerce.dominio.Administrador;
import com.jerb.ecomerce.dominio.Cliente;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class AdaptadorUsuarioPersistencia implements UsuarioPuertoPersistencia {
    @Override
    public Boolean validarCredencialesUsuario(String correo, String clave) {
        return null;
    }

    @Override
    public Administrador crearAdminbd(String correo, String clave) {
        return null;
    }

    @Override
    public Cliente crearClientebd(String correo, String clave, String nombre, String direccion, String telefono) {
        return null;
    }

    @Override
    public Cliente consultarClientePoridbd(String idCliente) {
        return null;
    }

    @Override
    public ArrayList<Cliente> consultarClientesbd() {
        return null;
    }

    @Override
    public Cliente actualizarClientebd(String correo, String clave, String nombre, String direccion, String telefono) {
        return null;
    }

    @Override
    public Boolean eliminarClientebd(String idCliente) {
        return null;
    }
}
