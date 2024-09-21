package com.jerb.ecomerce.infrastructure.adapters.input.rest.mapper;

import com.jerb.ecomerce.domain.Administrador;
import com.jerb.ecomerce.domain.Cliente;
import com.jerb.ecomerce.domain.Usuario;
import com.jerb.ecomerce.infrastructure.adapters.input.rest.model.request.AdministradorCreacionSolicitud;
import com.jerb.ecomerce.infrastructure.adapters.input.rest.model.request.ClienteCreacionSolicitud;
import com.jerb.ecomerce.infrastructure.adapters.input.rest.model.request.loginSolicitud;
import com.jerb.ecomerce.infrastructure.adapters.input.rest.model.response.AdministradorRespuesta;
import com.jerb.ecomerce.infrastructure.adapters.input.rest.model.response.ClienteRespuesta;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.springframework.stereotype.Component;


@Mapper(componentModel = "spring")
public interface UsuarioRestMapper {
    Administrador toAdministrador(AdministradorCreacionSolicitud request);
    AdministradorRespuesta toAdministradorRespuesta(Administrador admin);
    @Mapping(source = "correo", target = "correo")
    @Mapping(source = "clave", target = "clave")
    Cliente toCliente(ClienteCreacionSolicitud request);
    ClienteRespuesta toClienteRespuesta(Cliente cliente);
    @Mapping(source = "correo", target = "correo")
    Usuario loginToUsuario(loginSolicitud request);
}
