package com.jerb.ecomerce.application.service;

import com.jerb.ecomerce.application.ports.input.ReportePuertoServicio;
import com.jerb.ecomerce.application.ports.output.ReportePuertoPersistencia;
import com.jerb.ecomerce.domain.Cliente;
import com.jerb.ecomerce.domain.Producto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class ServicioReporte implements ReportePuertoServicio {
    private final ReportePuertoPersistencia puertopersistencia;

    public ServicioReporte(ReportePuertoPersistencia puertopersistencia) {
        this.puertopersistencia = puertopersistencia;
    }

    @Override
    public ArrayList<Producto> top5Vendido() {
        return puertopersistencia.consultarT5Vendidos();
    }

    @Override
    public ArrayList<Cliente> top5Clientes() {
        return puertopersistencia.consultarT5Clientes();
    }
}
