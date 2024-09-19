package com.jerb.ecomerce.infraestructura.adaptadores.salida;

import com.jerb.ecomerce.aplicacion.puertos.salida.ProductoPuertoPersistencia;
import com.jerb.ecomerce.dominio.Producto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class AdaptadorProductoPersistencia implements ProductoPuertoPersistencia {
    @Override
    public Producto crearProductobd(String nombre, String categoria, Double valor) {
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
