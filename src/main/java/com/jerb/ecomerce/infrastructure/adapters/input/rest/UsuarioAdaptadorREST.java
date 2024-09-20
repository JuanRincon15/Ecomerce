package com.jerb.ecomerce.infrastructure.adapters.input.rest;

import com.jerb.ecomerce.application.ports.input.UsuarioPuertoServicio;
import com.jerb.ecomerce.infrastructure.adapters.input.rest.mapper.UsuarioRestMapper;
import com.jerb.ecomerce.infrastructure.adapters.input.rest.model.request.AdministradorCreacionSolicitud;
import com.jerb.ecomerce.infrastructure.adapters.input.rest.model.request.ClienteCreacionSolicitud;
import com.jerb.ecomerce.infrastructure.adapters.input.rest.model.response.AdministradorRespuesta;
import com.jerb.ecomerce.infrastructure.adapters.input.rest.model.response.ClienteRespuesta;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UsuarioAdaptadorREST {
    private final UsuarioPuertoServicio puertousuario;
    private final UsuarioRestMapper restMapper;

    public UsuarioAdaptadorREST(UsuarioPuertoServicio puertousuario, UsuarioRestMapper restMapper) {
        this.puertousuario = puertousuario;
        this.restMapper = restMapper;
    }
    @PostMapping("V1/api/admin")
    public ResponseEntity<AdministradorRespuesta> guardarAdministrador(@Valid @RequestBody AdministradorCreacionSolicitud request){
        return ResponseEntity.status(HttpStatus.CREATED).body(restMapper.toAdministradorRespuesta(puertousuario.CrearAdministrador(restMapper.toAdministrador(request))));
    }
    @PostMapping("V1/api/client")
    public ResponseEntity<ClienteRespuesta> guardarCliente(@Valid @RequestBody ClienteCreacionSolicitud request){
        System.out.println("endpoint: "+request.toString());
        return ResponseEntity.status(HttpStatus.CREATED).body(restMapper.toClienteRespuesta(puertousuario.CrearCliente(restMapper.toCliente(request))));
    }

}
