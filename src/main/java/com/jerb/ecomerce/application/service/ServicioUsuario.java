package com.jerb.ecomerce.application.service;

import com.jerb.ecomerce.application.ports.input.UsuarioPuertoServicio;
import com.jerb.ecomerce.application.ports.output.UsuarioPuertoPersistencia;
import com.jerb.ecomerce.domain.Administrador;
import com.jerb.ecomerce.domain.Cliente;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ServicioUsuario implements UsuarioPuertoServicio {

    private final UsuarioPuertoPersistencia puertopersistencia;

    public ServicioUsuario(UsuarioPuertoPersistencia puertopersistencia) {
        this.puertopersistencia = puertopersistencia;
    }

    @Override
    public Boolean login(String correo, String clave) {
        return puertopersistencia.validarCredencialesUsuario(correo,clave);
    }

    @Override
    public Administrador CrearAdministrador(Administrador admin) {
        return puertopersistencia.crearAdminbd( admin);
    }

    @Override
    public Cliente CrearCliente(Cliente cliente) {
        System.out.println("servicio: "+cliente.toString());
        return puertopersistencia.crearClientebd(cliente);
    }

    @Override
    public Cliente ClientePorId(String idCliente) {
        return puertopersistencia.consultarClientePoridbd(idCliente);
    }

    @Override
    public ArrayList<Cliente> traerClientes() {
        return puertopersistencia.consultarClientesbd();
    }

    @Override
    public Cliente actualizarCliente(String idCliente, String correo, String clave, String nombre, String direccion, String telefono) {
        return puertopersistencia.actualizarClientebd(idCliente,clave,nombre,direccion,telefono);
    }

    @Override
    public Boolean borrarCliente(String idCliente) {
        return puertopersistencia.eliminarClientebd(idCliente);
    }
}
