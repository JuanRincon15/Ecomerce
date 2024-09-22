package com.jerb.ecomerce.application.ports.input;

import com.jerb.ecomerce.domain.Orden;
import com.jerb.ecomerce.domain.OrdenProducto;

import java.util.List;

public interface OrdenPuertoServicio {
    Orden crearOrden(List<OrdenProducto> productos,String idCliente);
}
