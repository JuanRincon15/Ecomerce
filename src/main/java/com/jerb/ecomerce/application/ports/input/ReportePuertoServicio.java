package com.jerb.ecomerce.application.ports.input;

import com.jerb.ecomerce.domain.Cliente;
import com.jerb.ecomerce.domain.Producto;

import java.util.ArrayList;

public interface ReportePuertoServicio {
    ArrayList<Producto> top5Vendido();
    ArrayList<Cliente> top5Clientes();

}
