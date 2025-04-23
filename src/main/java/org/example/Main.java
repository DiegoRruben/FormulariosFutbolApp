package org.example;


import org.example.vista.Jugador;
import org.example.vista.equipo;
import org.example.vista.estadisticaJugador;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Jugador> jugador = new ArrayList<>();
        new Jugador(jugador);

        List<estadisticaJugador> estadisticaJugador = new ArrayList<>();
        new estadisticaJugador(estadisticaJugador);


        List<equipo> equipo = new ArrayList<>();
        new equipo(equipo);


    }


}