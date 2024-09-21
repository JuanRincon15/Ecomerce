package com.jerb.ecomerce.infrastructure.adapters.output.persistence;

import com.jerb.ecomerce.application.ports.output.UsuarioPuertoPersistencia;
import com.jerb.ecomerce.domain.Administrador;
import com.jerb.ecomerce.domain.Cliente;
import com.jerb.ecomerce.domain.Usuario;
import com.jerb.ecomerce.infrastructure.adapters.output.persistence.entity.EntidadUsuario;
import com.jerb.ecomerce.infrastructure.adapters.output.persistence.mapper.UsuarioPersistenceMapper;
import com.jerb.ecomerce.infrastructure.adapters.output.persistence.repository.RepositorioUsuario;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class AdaptadorUsuarioPersistencia implements UsuarioPuertoPersistencia {

    private final RepositorioUsuario repoadmin;
    private final UsuarioPersistenceMapper mapperuser;

    public AdaptadorUsuarioPersistencia(RepositorioUsuario repoadmin, UsuarioPersistenceMapper mapperadmin, UsuarioPersistenceMapper mapperuser) {
        this.repoadmin = repoadmin;
        this.mapperuser = mapperuser;
    }

    @Override
    public Boolean validarCredencialesUsuario(Usuario usuario) {
        Usuario usuarioval = mapperuser.toUsuario(repoadmin.findBycorreo(usuario.getCorreo()).orElse(new EntidadUsuario()));
        System.out.println(usuarioval.toString());
        return usuario.equals(usuarioval);
    }

    @Override
    public Administrador crearAdminbd(Administrador admin) {
        return mapperuser.usuarioAdministrador(repoadmin.save(mapperuser.administradorAUsuariobd(admin)));
    }

    @Override
    public Cliente crearClientebd(Cliente cliente) {
        return mapperuser.usuarioACliente(repoadmin.save(mapperuser.clienteAUsuariobd(cliente)));
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
