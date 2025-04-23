package org.example.modelo;

import org.example.vista.Jugador;

import java.util.List;


public class jugador  {

private String nombre;
private int edad;

private String posición;

private int numero;
private  String equipo;

    public jugador(List<Jugador> jugador) {

    }



    @Override
    public String toString() {
        return "jugador{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", posición='" + posición + '\'' +
                ", numero=" + numero +
                ", equipo='" + equipo + '\'' +
                '}';
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public String getPosición() {
        return posición;
    }

    public void setPosición(String posición) {
        this.posición = posición;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public jugador(String nombre, String equipo, int numero, String posición, int edad) {
        this.nombre = nombre;
        this.equipo = equipo;
        this.numero = numero;
        this.posición = posición;
        this.edad = edad;



    }
}
