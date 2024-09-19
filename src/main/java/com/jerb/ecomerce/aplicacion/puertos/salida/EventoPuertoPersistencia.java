package com.jerb.ecomerce.aplicacion.puertos.salida;

import com.jerb.ecomerce.dominio.Evento;

import java.time.LocalDateTime;
import java.util.ArrayList;

public interface EventoPuertoPersistencia {
    Evento crearEventobd(LocalDateTime fechaInicio, LocalDateTime fechaFin, String nombre, float porcentajeDescuento, Boolean aleatorio);
    ArrayList<Evento> retornarEventosbd();
    Evento modificarEvento(String nombreEvento);
    Boolean eliminarEvento(String nombreEvento);
}
