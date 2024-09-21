package com.jerb.ecomerce.application.service;

import com.jerb.ecomerce.application.ports.input.ProductoPuertoServicio;
import com.jerb.ecomerce.application.ports.output.ProductoPuertoPersistencia;
import com.jerb.ecomerce.domain.Producto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class ServicioProducto implements ProductoPuertoServicio {

    private final ProductoPuertoPersistencia puertopersistencia;

    public ServicioProducto(ProductoPuertoPersistencia puertopersistencia) {
        this.puertopersistencia = puertopersistencia;
    }

    @Override
    public Producto crearProducto(Producto producto,int cantidad) {
        producto.setIdProducto("PRT"+producto.generarcadena(10));
        return puertopersistencia.crearProductobd(producto,cantidad);
    }

    @Override
    public Producto productoPorId(String idProducto) {
        return puertopersistencia.consultarProductoPorId(idProducto);
    }

    @Override
    public ArrayList<Producto> productosPorNombre(String nombre) {
        return puertopersistencia.consultarProductoPorNombre(nombre);
    }

    @Override
    public ArrayList<Producto> productosPorPrecio(String criterio, Double precio) {
        return puertopersistencia.consultaProductoPorPrecio(criterio,precio);
    }

    @Override
    public ArrayList<Producto> productosPorCategoria(String categoria) {
        return puertopersistencia.consultaProductoPorCategoria(categoria);
    }

    @Override
    public ArrayList<Producto> retornarProductos() {
        return puertopersistencia.consultarProductos();
    }

    @Override
    public Producto actualizarProducto(String idProducto) {
        return puertopersistencia.actualizarProductobd(idProducto);
    }

    @Override
    public Boolean eliminarProducto(String idProducto) {
        return puertopersistencia.eliminarProductobd(idProducto);
    }
}
