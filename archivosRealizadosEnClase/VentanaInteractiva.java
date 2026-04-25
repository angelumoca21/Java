import javax.swing.*;
import java.awt.event.*;

public class VentanaInteractiva {

    public static void main(String[] args){

        JFrame ventana = new JFrame("Formulario");
        ventana.setSize(300, 200);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocation(300,300);
        ventana.setLayout(null);

        // Componentes
        JLabel etiqueta = new JLabel("Nombre:");
        etiqueta.setBounds(20, 20, 100, 20);

        JLabel etiqueta2 = new JLabel("");
        etiqueta2.setBounds(20, 100, 100, 20);

        JTextField campoTexto = new JTextField();
        campoTexto.setBounds(100, 20, 150, 20);

        JButton boton = new JButton("Saludar");
        boton.setBounds(100, 60, 100, 30);

        // Evento del botón
        boton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){

                String nombre = campoTexto.getText();

                //JOptionPane.showMessageDialog(null, "Hola " + nombre);
                etiqueta2.setText("Hola " + nombre);
            }
        });

        // Agregar componentes
        ventana.add(etiqueta);
        ventana.add(campoTexto);
        ventana.add(boton);
        ventana.add(etiqueta2);

        ventana.setVisible(true);
    }
}