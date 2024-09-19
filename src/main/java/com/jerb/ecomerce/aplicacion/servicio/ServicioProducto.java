package com.jerb.ecomerce.aplicacion.servicio;

import com.jerb.ecomerce.aplicacion.puertos.entrada.ProductoPuertoServicio;
import com.jerb.ecomerce.aplicacion.puertos.salida.ProductoPuertoPersistencia;
import com.jerb.ecomerce.dominio.Producto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class ServicioProducto implements ProductoPuertoServicio {

    private final ProductoPuertoPersistencia puertopersistencia;

    public ServicioProducto(ProductoPuertoPersistencia puertopersistencia) {
        this.puertopersistencia = puertopersistencia;
    }

    @Override
    public Producto crearProducto(String nombre, String categoria, Double valor) {
        return puertopersistencia.crearProductobd(nombre,categoria,valor);
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
