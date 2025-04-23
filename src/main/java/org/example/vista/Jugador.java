package org.example.vista;

import org.example.modelo.equipo;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class Jugador extends JFrame {
    private JPanel panel1;
    private JTextField nombreTextField;
    private JTextField edadTextField;
    private JTextField generoTextField;
    private JTextField estaturaTextField;
    private JButton guardarButton;

public Jugador (List<Jugador> jugador){
    setTitle("Formulario Jugador - Futbol");
       setSize(400,300);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       setLocationRelativeTo(null);
           setLayout(new GridLayout(6,2));

          panel1 = new JPanel(new GridLayout(6,2));
          nombreTextField = new JTextField();
        edadTextField = new JTextField();
        generoTextField = new JTextField();
       estaturaTextField = new JTextField();
       guardarButton = new JButton("Guardar");

    panel1.add(new JLabel("Nombre:"));
    panel1.add(nombreTextField);
    panel1.add(new JLabel("Edad:"));
    panel1.add(edadTextField);
    panel1.add(new JLabel("Género:"));
    panel1.add(generoTextField);
    panel1.add(new JLabel("Estatura:"));
    panel1.add(estaturaTextField);
    panel1.add(new JLabel(""));
    panel1.add(guardarButton);


    add(panel1);

    guardarButton.addActionListener(e -> {
        String nombre = nombreTextField.getText();
        String edad = edadTextField.getText();
        String genero = generoTextField.getText();
        String estatura = estaturaTextField.getText();

        System.out.println("Datos guardados del Jugador:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Género: " + genero);
        System.out.println("Estatura: " + estatura);


    });

    setVisible(true);
  }
}




