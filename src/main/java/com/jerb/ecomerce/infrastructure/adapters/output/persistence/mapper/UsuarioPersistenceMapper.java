package com.jerb.ecomerce.infrastructure.adapters.output.persistence.mapper;


import com.jerb.ecomerce.domain.Administrador;
import com.jerb.ecomerce.domain.Cliente;
import com.jerb.ecomerce.domain.Usuario;
import com.jerb.ecomerce.infrastructure.adapters.output.persistence.entity.EntidadUsuario;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UsuarioPersistenceMapper {

    @Mapping(source = "correo", target = "correo")
    EntidadUsuario administradorAUsuariobd(Administrador administrador);

    @Mapping(source = "correo", target = "correo")
    EntidadUsuario clienteAUsuariobd(Cliente cliente);

    @Mapping(source = "correo", target = "correo")
    Usuario toUsuario (EntidadUsuario usuario);

    Administrador usuarioAdministrador(EntidadUsuario usuario);

    Cliente usuarioACliente(EntidadUsuario usuario);

    List<Cliente> listaClientes(List<EntidadUsuario> usuarios);
}
