package com.jerb.ecomerce.application.ports.output;

import com.jerb.ecomerce.domain.Orden;
import com.jerb.ecomerce.domain.OrdenProducto;

import java.util.List;

public interface OrdenPuertoPersistencia {
    Orden crearOrdenbd(List<OrdenProducto> productos,Orden orden);
}
