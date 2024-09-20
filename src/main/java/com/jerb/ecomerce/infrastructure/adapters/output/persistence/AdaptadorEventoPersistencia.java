package com.jerb.ecomerce.infrastructure.adapters.output.persistence;

import com.jerb.ecomerce.application.ports.output.EventoPuertoPersistencia;
import com.jerb.ecomerce.domain.Evento;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;

@Component
public class AdaptadorEventoPersistencia implements EventoPuertoPersistencia {
    @Override
    public Evento crearEventobd(LocalDateTime fechaInicio, LocalDateTime fechaFin, String nombre, float porcentajeDescuento, Boolean aleatorio) {
        return null;
    }

    @Override
    public ArrayList<Evento> retornarEventosbd() {
        return null;
    }

    @Override
    public Evento modificarEvento(String nombreEvento) {
        return null;
    }

    @Override
    public Boolean eliminarEvento(String nombreEvento) {
        return null;
    }
}
