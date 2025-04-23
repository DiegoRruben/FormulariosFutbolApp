package org.example.vista;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class estadisticaJugador extends JFrame {
    private JPanel panel1;

    private JTextField golesTextField;
    private JTextField asistenciasTextField;
    private JTextField tarjetasAmarrillasTextField;
    private JTextField tarjetasRojasTextField;
    private JTextField partidosJugadosTextField;
    private JButton guardarButton;


    public estadisticaJugador (List<estadisticaJugador> estadisticaJugador) {
        setTitle("Formulario estadisticasJugador - Futbol");
        setSize(400,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(6,2));

        panel1 = new JPanel(new GridLayout(6,2));
        asistenciasTextField = new JTextField();
        golesTextField = new JTextField();
        tarjetasAmarrillasTextField = new JTextField();
        tarjetasRojasTextField = new JTextField();
        partidosJugadosTextField = new JTextField();
        guardarButton = new JButton("Guardar");



        panel1.add(new JLabel("asistencias:"));
        panel1.add(asistenciasTextField);
        panel1.add(new JLabel("goles:"));
        panel1.add( golesTextField);
        panel1.add(new JLabel("partidosJugados:"));
        panel1.add( partidosJugadosTextField);
        panel1.add(new JLabel("tarjetasAmarillas:"));
        panel1.add(tarjetasAmarrillasTextField);
        panel1.add(new JLabel("tarjetasRojas"));
        panel1.add( tarjetasRojasTextField);
        panel1.add(new JLabel(""));
        panel1.add(guardarButton);



        add(panel1);

        guardarButton.addActionListener(e -> {

            String goles = golesTextField.getText();
            String tarjetasAmarillas = tarjetasAmarrillasTextField.getText();
            String tarjetasRojas = tarjetasRojasTextField.getText();
            String  asistencias= asistenciasTextField.getText();
            String partidosJugados = partidosJugadosTextField.getText();


            System.out.println("Datos guardados estadisticasJugador:");
            System.out.println("golesJugador: " + goles);
            System.out.println("tarjetasAmarillas: " + tarjetasAmarillas);
            System.out.println("tarjetasRojas: " + tarjetasRojas);
            System.out.println("asistenciasJugador: " + asistencias);
            System.out.println("partidosJugados: " + partidosJugados);

        });

        setVisible(true);


    }




}
