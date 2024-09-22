package com.jerb.ecomerce.application.service;

import com.jerb.ecomerce.application.ports.input.UsuarioPuertoServicio;
import com.jerb.ecomerce.application.ports.output.UsuarioPuertoPersistencia;
import com.jerb.ecomerce.domain.Administrador;
import com.jerb.ecomerce.domain.Cliente;
import com.jerb.ecomerce.domain.Usuario;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ServicioUsuario implements UsuarioPuertoServicio {

    private final UsuarioPuertoPersistencia puertopersistencia;

    public ServicioUsuario(UsuarioPuertoPersistencia puertopersistencia) {
        this.puertopersistencia = puertopersistencia;
    }

    @Override
    public Boolean login(Usuario usuario) {
        return puertopersistencia.validarCredencialesUsuario(usuario);
    }

    @Override
    public Administrador CrearAdministrador(Administrador admin) {
        admin.setIdAdministrador("ADM"+admin.generarcadena(6));
        return puertopersistencia.crearAdminbd( admin);
    }

    @Override
    public Cliente CrearCliente(Cliente cliente) {
        System.out.println("mapeo cliente: "+cliente.toString());
        cliente.setIdCliente("CLN"+cliente.generarcadena(6));
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
