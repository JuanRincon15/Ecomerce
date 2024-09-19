package com.jerb.ecomerce.aplicacion.puertos.entrada;

import com.jerb.ecomerce.dominio.Cliente;
import com.jerb.ecomerce.dominio.Producto;

import java.util.ArrayList;

public interface ReportePuertoServicio {
    ArrayList<Producto> top5Vendido();
    ArrayList<Cliente> top5Clientes();

}
