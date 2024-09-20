package com.jerb.ecomerce.application.ports.output;

import com.jerb.ecomerce.domain.Cliente;
import com.jerb.ecomerce.domain.Producto;

import java.util.ArrayList;

public interface ReportePuertoPersistencia {
    ArrayList<Producto> consultarT5Vendidos();
    ArrayList<Cliente> consultarT5Clientes();
}
