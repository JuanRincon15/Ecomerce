package com.jerb.ecomerce.aplicacion.servicio;

import com.jerb.ecomerce.aplicacion.puertos.entrada.ReportePuertoServicio;
import com.jerb.ecomerce.aplicacion.puertos.salida.ReportePuertoPersistencia;
import com.jerb.ecomerce.dominio.Cliente;
import com.jerb.ecomerce.dominio.Producto;
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
