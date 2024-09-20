package com.jerb.ecomerce.infrastructure.adapters.output.persistence;

import com.jerb.ecomerce.application.ports.output.UsuarioPuertoPersistencia;
import com.jerb.ecomerce.domain.Administrador;
import com.jerb.ecomerce.domain.Cliente;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class AdaptadorUsuarioPersistencia implements UsuarioPuertoPersistencia {
    @Override
    public Boolean validarCredencialesUsuario(String correo, String clave) {
        return null;
    }

    @Override
    public Administrador crearAdminbd(Administrador admin) {
        System.out.println(admin.toString());
        return admin;
    }

    @Override
    public Cliente crearClientebd(Cliente cliente) {
        System.out.println(cliente.toString());
        return cliente;
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
