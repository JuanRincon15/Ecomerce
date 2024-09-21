package com.jerb.ecomerce.infrastructure.adapters.output.persistence;

import com.jerb.ecomerce.application.ports.output.ProductoPuertoPersistencia;
import com.jerb.ecomerce.domain.Producto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class AdaptadorProductoPersistencia implements ProductoPuertoPersistencia {
    @Override
    public Producto crearProductobd(Producto producto) {
        return null;
    }

    @Override
    public Producto consultarProductoPorId(String idProducto) {
        return null;
    }

    @Override
    public ArrayList<Producto> consultarProductoPorNombre(String nombreProducto) {
        return null;
    }

    @Override
    public ArrayList<Producto> consultaProductoPorPrecio(String criterio, Double precio) {
        return null;
    }

    @Override
    public ArrayList<Producto> consultaProductoPorCategoria(String categoria) {
        return null;
    }

    @Override
    public ArrayList<Producto> consultarProductos() {
        return null;
    }

    @Override
    public Producto actualizarProductobd(String idProducto) {
        return null;
    }

    @Override
    public Boolean eliminarProductobd(String idProducto) {
        return null;
    }
}
