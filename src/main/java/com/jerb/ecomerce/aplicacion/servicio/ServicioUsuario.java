package com.jerb.ecomerce.aplicacion.servicio;

import com.jerb.ecomerce.aplicacion.puertos.entrada.UsuarioPuertoServicio;
import com.jerb.ecomerce.aplicacion.puertos.salida.UsuarioPuertoPersistencia;
import com.jerb.ecomerce.dominio.Administrador;
import com.jerb.ecomerce.dominio.Cliente;
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
    public Administrador CrearAdministrador(String correo, String clave) {
        return puertopersistencia.crearAdminbd( correo, clave);
    }

    @Override
    public Cliente CrearCliente(String correo, String clave, String nombre, String direccion, String telefono) {
        return puertopersistencia.crearClientebd(correo,clave,nombre,direccion,telefono);
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
