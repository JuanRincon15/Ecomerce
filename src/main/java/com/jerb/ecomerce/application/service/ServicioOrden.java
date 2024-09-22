package com.jerb.ecomerce.application.service;

import com.jerb.ecomerce.application.ports.input.OrdenPuertoServicio;
import com.jerb.ecomerce.application.ports.output.OrdenPuertoPersistencia;
import com.jerb.ecomerce.domain.Orden;
import com.jerb.ecomerce.domain.OrdenProducto;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServicioOrden implements OrdenPuertoServicio {

    private final OrdenPuertoPersistencia puertopersistencia;

    public ServicioOrden(OrdenPuertoPersistencia puertopersistencia) {
        this.puertopersistencia = puertopersistencia;
    }

    @Override
    public Orden crearOrden(List<OrdenProducto> productos,String idCliente) {
        Orden orden = new Orden();
        orden.setIdOrden("ODN"+orden.generarcadena(10));
        orden.setIdClienteOrden(idCliente);
        for(OrdenProducto prod: productos){
            prod.setIdOrden(orden.getIdOrden());
        }
        return puertopersistencia.crearOrdenbd(productos,orden);
    }
}
