package com.jerb.ecomerce.aplicacion.servicio;

import com.jerb.ecomerce.aplicacion.puertos.entrada.EventoPuertoServicio;
import com.jerb.ecomerce.aplicacion.puertos.salida.EventoPuertoPersistencia;
import com.jerb.ecomerce.dominio.Evento;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;

@Service
public class ServicioEvento implements EventoPuertoServicio {
    private final EventoPuertoPersistencia puertopersistencia;

    public ServicioEvento(EventoPuertoPersistencia puertopersistencia) {
        this.puertopersistencia = puertopersistencia;
    }

    @Override
    public Evento crearEvento(LocalDateTime fechaInicio, LocalDateTime fechaFin, String nombre, float porcentajeDescuento, Boolean aleatorio) {
        return puertopersistencia.crearEventobd(fechaInicio,fechaFin,nombre,porcentajeDescuento,aleatorio);
    }

    @Override
    public ArrayList<Evento> retornarEventos() {
        return puertopersistencia.retornarEventosbd();
    }

    @Override
    public Evento modificarEvento(String nombreEvento) {
        return puertopersistencia.modificarEvento(nombreEvento);
    }

    @Override
    public Boolean eliminarEvento(String nombreEvento) {
        return puertopersistencia.eliminarEvento(nombreEvento);
    }
}
