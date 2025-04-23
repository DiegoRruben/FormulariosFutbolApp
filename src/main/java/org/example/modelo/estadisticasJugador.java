package org.example.modelo;

import java.util.List;

public class estadisticasJugador {

    private String nombreJugador;
    private int goles;
    private int asistencias;
    private int tarjetasAmarillas;
    private int tarjetasRojas;
    private int partidosJugados;


    public estadisticasJugador() {
    }

    @Override
    public String toString() {
        return "estadisticasJugador{" +
                "nombreJugador='" + nombreJugador + '\'' +
                ", goles=" + goles +
                ", asistencias=" + asistencias +
                ", tarjetasAmarillas=" + tarjetasAmarillas +
                ", tarjetasRojas=" + tarjetasRojas +
                ", partidosJugados=" + partidosJugados +
                '}';
    }



    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public int getPartidosJugados() {
        return partidosJugados;
    }

    public void setPartidosJugados(int partidosJugados) {
        this.partidosJugados = partidosJugados;
    }

    public int getTarjetasRojas() {
        return tarjetasRojas;
    }

    public void setTarjetasRojas(int tarjetasRojas) {
        this.tarjetasRojas = tarjetasRojas;
    }

    public int getTarjetasAmarillas() {
        return tarjetasAmarillas;
    }

    public void setTarjetasAmarillas(int tarjetasAmarillas) {
        this.tarjetasAmarillas = tarjetasAmarillas;
    }

    public int getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(int asistencias) {
        this.asistencias = asistencias;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    public estadisticasJugador(String nombreJugador, int goles, int asistencias, int tarjetasAmarillas, int tarjetasRojas, int partidosJugados) {
        this.nombreJugador = nombreJugador;
        this.goles = goles;
        this.asistencias = asistencias;
        this.tarjetasAmarillas = tarjetasAmarillas;
        this.tarjetasRojas = tarjetasRojas;
        this.partidosJugados = partidosJugados;




    }
}
