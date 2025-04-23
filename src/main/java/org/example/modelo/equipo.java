package org.example.modelo;

import javax.swing.*;
import java.util.List;

public class equipo extends JFrame {

    private String nombre;
    private String ciudad;
    private String entrenador;
    private String categoria;

  

    public equipo(List<equipo> equipo) {
    }

    @Override
    public String toString() {
        return "equipo{" +
                "nombre='" + nombre + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", entrenador='" + entrenador + '\'' +
                ", categoria='" + categoria + '\'' +
                '}';
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(String entrenador) {
        this.entrenador = entrenador;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public equipo(String nombre, String ciudad, String entrenador, String categoria) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.entrenador = entrenador;
        this.categoria = categoria;




    }

}
