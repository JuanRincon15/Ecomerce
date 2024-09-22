package com.jerb.ecomerce.infrastructure.adapters.input.rest;

import com.jerb.ecomerce.application.ports.input.ProductoPuertoServicio;
import com.jerb.ecomerce.domain.Inventario;
import com.jerb.ecomerce.infrastructure.adapters.input.rest.mapper.ProductoRestMapper;
import com.jerb.ecomerce.infrastructure.adapters.input.rest.model.request.ProductoCreacionSolicitud;
import com.jerb.ecomerce.infrastructure.adapters.input.rest.model.response.ProductoRespuesta;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/product")
public class ProductoAdaptadorREST {
    private final ProductoPuertoServicio puertoproducto;
    private final ProductoRestMapper restMapperM;

    public ProductoAdaptadorREST(ProductoPuertoServicio puertoproducto, ProductoRestMapper restMapperM) {
        this.puertoproducto = puertoproducto;
        this.restMapperM = restMapperM;
    }
    @PostMapping("V1/api/create")
    public ResponseEntity<ProductoRespuesta> guardarproducto(@Valid @RequestBody ProductoCreacionSolicitud request){
        Inventario inv = restMapperM.toInventario(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(restMapperM.toProductoRespuesta(puertoproducto.crearProducto(restMapperM.toProducto(request),inv.getCantProducto())));
    }
}
