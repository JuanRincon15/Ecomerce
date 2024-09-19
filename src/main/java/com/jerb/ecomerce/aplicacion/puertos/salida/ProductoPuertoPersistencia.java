package com.jerb.ecomerce.aplicacion.puertos.salida;

import com.jerb.ecomerce.dominio.Producto;

import java.util.ArrayList;

public interface ProductoPuertoPersistencia {
    Producto crearProductobd(String nombre,String categoria, Double valor);
    Producto consultarProductoPorId(String idProducto);
    ArrayList<Producto> consultarProductoPorNombre(String nombreProducto);
    ArrayList<Producto> consultaProductoPorPrecio(String criterio, Double precio);
    ArrayList<Producto> consultaProductoPorCategoria(String categoria);
    ArrayList<Producto> consultarProductos();
    Producto actualizarProductobd(String idProducto);
    Boolean eliminarProductobd(String idProducto);
}
