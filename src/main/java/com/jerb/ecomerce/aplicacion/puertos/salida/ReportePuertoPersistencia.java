package com.jerb.ecomerce.aplicacion.puertos.salida;

import com.jerb.ecomerce.dominio.Cliente;
import com.jerb.ecomerce.dominio.Producto;

import java.util.ArrayList;

public interface ReportePuertoPersistencia {
    ArrayList<Producto> consultarT5Vendidos();
    ArrayList<Cliente> consultarT5Clientes();
}
