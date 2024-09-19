package com.jerb.ecomerce.aplicacion.puertos.entrada;

import com.jerb.ecomerce.dominio.Evento;

import java.time.LocalDateTime;
import java.util.ArrayList;

public interface EventoPuertoServicio {
    Evento crearEvento(LocalDateTime fechaInicio, LocalDateTime fechaFin, String nombre,float porcentajeDescuento,Boolean aleatorio);
    ArrayList<Evento> retornarEventos();
    Evento modificarEvento(String nombreEvento);
    Boolean eliminarEvento(String nombreEvento);

}
