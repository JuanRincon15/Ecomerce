package com.jerb.ecomerce.aplicacion.puertos.salida;

import ch.qos.logback.core.net.server.Client;
import com.jerb.ecomerce.dominio.Administrador;
import com.jerb.ecomerce.dominio.Cliente;

import java.util.ArrayList;

public interface UsuarioPuertoPersistencia {
    Boolean validarCredencialesUsuario(String correo, String clave);
    Administrador crearAdminbd(String correo, String clave);
    Cliente crearClientebd(String correo, String clave, String nombre, String direccion, String telefono);
    Cliente consultarClientePoridbd(String idCliente);
    ArrayList<Cliente> consultarClientesbd();
    Cliente actualizarClientebd(String correo, String clave, String nombre, String direccion, String telefono);
    Boolean eliminarClientebd(String idCliente);
}
