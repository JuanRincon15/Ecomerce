package com.jerb.ecomerce.infraestructura.adaptadores.salida;


import com.jerb.ecomerce.aplicacion.puertos.salida.ReportePuertoPersistencia;
import com.jerb.ecomerce.dominio.Cliente;
import com.jerb.ecomerce.dominio.Producto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class AdaptadorReportePersistencia implements ReportePuertoPersistencia {
    @Override
    public ArrayList<Producto> consultarT5Vendidos() {
        return null;
    }

    @Override
    public ArrayList<Cliente> consultarT5Clientes() {
        return null;
    }
}
