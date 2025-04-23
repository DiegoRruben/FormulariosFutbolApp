package org.example.vista;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class equipo extends JFrame{
    private JTextField nombreEquipoTextField;
    private JPanel panel1;
    private JTextField nombreCiudadTextField;
    private JTextField entrenadorTextField;
    private JTextField categoriaTextField;
    private JButton guardarButton;

public equipo (List<equipo> equipo) {

    setTitle("Formulario equipo - Futbol");
    setSize(400,300);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    setLayout(new GridLayout(6,2));

    panel1 = new JPanel(new GridLayout(6,2));
    nombreCiudadTextField= new JTextField();
    nombreEquipoTextField = new JTextField();
    entrenadorTextField = new JTextField();
    categoriaTextField = new JTextField();
    guardarButton = new JButton("Guardar");

    panel1.add(new JLabel("Ciudad:"));
    panel1.add(nombreCiudadTextField);
    panel1.add(new JLabel("Equipo:"));
    panel1.add(nombreEquipoTextField);
    panel1.add(new JLabel("entrenador:"));
    panel1.add(entrenadorTextField);
    panel1.add(new JLabel("categoria"));
    panel1.add(categoriaTextField);
    guardarButton = new JButton("Guardar");
    panel1.add(new JLabel(""));
    panel1.add(guardarButton);

    add(panel1);

    guardarButton.addActionListener(e -> {
        String ciudad = nombreCiudadTextField.getText();
        String entrenador = entrenadorTextField.getText();
        String categoria = categoriaTextField.getText();
        String Equipo =  nombreEquipoTextField.getText();



        System.out.println("Datos guardados Equipos:");
        System.out.println("ciudad: " + ciudad);
        System.out.println("entrenador: " + entrenador);
        System.out.println("categorias: " + categoria);
        System.out.println("equipo: " + Equipo);


    });

    setVisible(true);


}

}
