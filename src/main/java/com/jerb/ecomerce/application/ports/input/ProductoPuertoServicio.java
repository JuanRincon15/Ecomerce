package com.jerb.ecomerce.application.ports.input;

import com.jerb.ecomerce.domain.Producto;

import java.util.ArrayList;
import java.util.List;

public interface ProductoPuertoServicio {
    Producto crearProducto(Producto producto,int cantidad);
    Producto productoPorId(String idProducto);
    ArrayList<Producto> productosPorNombre(String nombre);
    ArrayList<Producto> productosPorPrecio(String criterio, Double precio);
    ArrayList<Producto> productosPorCategoria(String categoria);
    List<Producto> retornarProductos();
    Producto actualizarProducto(String idProducto);
    Boolean eliminarProducto(String idProducto);
}
