package com.jerb.ecomerce.infrastructure.adapters.input.rest;

import com.jerb.ecomerce.application.ports.input.OrdenPuertoServicio;
import com.jerb.ecomerce.domain.OrdenProducto;
import com.jerb.ecomerce.infrastructure.adapters.input.rest.mapper.OrdenRestMapper;
import com.jerb.ecomerce.infrastructure.adapters.input.rest.model.request.OrdenCreacionSolicitud;
import com.jerb.ecomerce.infrastructure.adapters.input.rest.model.response.OrdenRespuesta;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin()
@RequestMapping("/order")
public class OrdenAdaptadorREST {
    private final OrdenPuertoServicio puertorden;
    private final OrdenRestMapper restMapper;

    public OrdenAdaptadorREST(OrdenPuertoServicio puertorden, OrdenRestMapper restMapper) {
        this.puertorden = puertorden;
        this.restMapper = restMapper;
    }

    @PostMapping("V1/api/create")
    public ResponseEntity<OrdenRespuesta> guardarOrden(@Valid @RequestBody OrdenCreacionSolicitud request){
        return ResponseEntity.status(HttpStatus.CREATED).body(restMapper.ordenAresorden(puertorden.crearOrden(request.getProductos(), request.getIdClienteOrden())));
    }
}
