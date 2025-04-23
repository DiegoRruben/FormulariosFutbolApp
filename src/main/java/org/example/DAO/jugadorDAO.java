package org.example.DAO;

import org.example.modelo.jugador;
import java.util.List;

public interface jugadorDAO {

    jugador obtenerId (long id);
     List<jugador>obtenerTodos();

     void guardar (jugador jugador);
     void actualizar (jugador jugador);

     void eliminar(long id);




}
