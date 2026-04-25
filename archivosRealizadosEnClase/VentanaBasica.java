import javax.swing.*;

public class VentanaBasica {

    public static void main(String[] args){

        JFrame ventana = new JFrame("Ejemplo GUI");
        ventana.setSize(300, 200);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ventana.setLayout(null);

        JLabel etiqueta = new JLabel("Nombre:");
        etiqueta.setBounds(20, 20, 100, 20);

        JTextField campoTexto = new JTextField();
        campoTexto.setBounds(100, 20, 150, 20);

        JButton boton = new JButton("Aceptar");
        boton.setBounds(100, 60, 100, 30);

        ventana.add(etiqueta);
        ventana.add(campoTexto);
        ventana.add(boton);

        ventana.setVisible(true);
    }
}