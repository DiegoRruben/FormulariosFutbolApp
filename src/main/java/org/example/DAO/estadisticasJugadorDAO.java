package org.example.DAO;

import org.example.modelo.estadisticasJugador;

import java.util.List;

public interface estadisticasJugadorDAO{

estadisticasJugador obtenerId (long id);

List<estadisticasJugador> obtenerTodo();

void guardar (estadisticasJugador estadisticasJugador);

void actualizar(estadisticasJugador estadisticasJugador);

void eliminar (long id);

}
