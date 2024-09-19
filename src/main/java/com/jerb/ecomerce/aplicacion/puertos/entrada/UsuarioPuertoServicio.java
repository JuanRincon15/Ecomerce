package com.jerb.ecomerce.aplicacion.puertos.entrada;

import com.jerb.ecomerce.dominio.Administrador;
import com.jerb.ecomerce.dominio.Cliente;

import java.util.ArrayList;

public interface UsuarioPuertoServicio {
    Boolean login(String correo, String clave);
    Administrador CrearAdministrador(String correo, String clave);
    Cliente CrearCliente(String correo, String clave, String nombre, String direccion, String telefono);
    Cliente ClientePorId(String idCliente);
    ArrayList<Cliente> traerClientes();
    Cliente actualizarCliente(String idCliente,String correo, String clave, String nombre, String direccion, String telefono);
    Boolean borrarCliente(String idCliente);

}
