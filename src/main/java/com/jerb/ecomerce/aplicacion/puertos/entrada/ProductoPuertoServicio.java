package com.jerb.ecomerce.aplicacion.puertos.entrada;

import com.jerb.ecomerce.dominio.Producto;

import java.util.ArrayList;

public interface ProductoPuertoServicio {
    Producto crearProducto(String nombre,String categoria, Double valor);
    Producto productoPorId(String idProducto);
    ArrayList<Producto> productosPorNombre(String nombre);
    ArrayList<Producto> productosPorPrecio(String criterio, Double precio);
    ArrayList<Producto> productosPorCategoria(String categoria);
    ArrayList<Producto> retornarProductos();
    Producto actualizarProducto(String idProducto);
    Boolean eliminarProducto(String idProducto);
}
