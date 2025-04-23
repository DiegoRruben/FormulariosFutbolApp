package org.example.DAO;

import org.example.modelo.equipo;

import java.util.List;

public interface equipoDAO {

equipo obtenerId (long id);
List<equipo>obtenerTodo();
    void guardar(equipo equipo);
    void actualizar(equipo equipo);
    void eliminar(Long id);
}
