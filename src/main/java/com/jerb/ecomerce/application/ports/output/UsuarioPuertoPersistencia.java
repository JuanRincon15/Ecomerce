package com.jerb.ecomerce.application.ports.output;

import com.jerb.ecomerce.domain.Administrador;
import com.jerb.ecomerce.domain.Cliente;

import java.util.ArrayList;

public interface UsuarioPuertoPersistencia {
    Boolean validarCredencialesUsuario(String correo, String clave);
    Administrador crearAdminbd(Administrador admin);
    Cliente crearClientebd(Cliente cliente);
    Cliente consultarClientePoridbd(String idCliente);
    ArrayList<Cliente> consultarClientesbd();
    Cliente actualizarClientebd(String correo, String clave, String nombre, String direccion, String telefono);
    Boolean eliminarClientebd(String idCliente);
}
