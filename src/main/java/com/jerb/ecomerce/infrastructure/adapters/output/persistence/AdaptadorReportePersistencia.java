package com.jerb.ecomerce.infrastructure.adapters.output.persistence;


import com.jerb.ecomerce.application.ports.output.ReportePuertoPersistencia;
import com.jerb.ecomerce.domain.Cliente;
import com.jerb.ecomerce.domain.Producto;
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
