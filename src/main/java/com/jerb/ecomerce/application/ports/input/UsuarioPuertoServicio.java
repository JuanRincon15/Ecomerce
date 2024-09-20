package com.jerb.ecomerce.application.ports.input;

import com.jerb.ecomerce.domain.Administrador;
import com.jerb.ecomerce.domain.Cliente;

import java.util.ArrayList;

public interface UsuarioPuertoServicio {
    Boolean login(String correo, String clave);
    Administrador CrearAdministrador(Administrador admin);
    Cliente CrearCliente(Cliente cliente);
    Cliente ClientePorId(String idCliente);
    ArrayList<Cliente> traerClientes();
    Cliente actualizarCliente(String idCliente,String correo, String clave, String nombre, String direccion, String telefono);
    Boolean borrarCliente(String idCliente);

}
