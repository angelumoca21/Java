import javax.swing.*;

public class CRUDtoDOlist {

    public static void main(String[] args){

        JFrame v = new JFrame("To-Do List");
        v.setSize(400, 500);
        v.setLayout(null);
        v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField txtNombre = new JTextField();
        txtNombre.setBounds(120, 20, 200, 20);

        JTextArea txtDesc = new JTextArea();
        JScrollPane spDesc = new JScrollPane(txtDesc);
        spDesc.setBounds(120, 60, 200, 80);

        String[] p = {"Alta","Media","Baja"};
        JComboBox<String> combo = new JComboBox<>(p);
        combo.setBounds(120, 150, 200, 20);

        DefaultListModel<String> modelo = new DefaultListModel<>();
        JList<String> lista = new JList<>(modelo);

        for(Tarea t : Operaciones.obtenerTodas()){
            modelo.addElement(t.getNombre() + " - " + t.getPrioridad() + " | " + t.getDescripcion());
        }

        JScrollPane spLista = new JScrollPane(lista);
        spLista.setBounds(20, 250, 350, 150);

        JButton btnGuardar = new JButton("Guardar");
        btnGuardar.setBounds(20, 200, 90, 30);

        JButton btnBuscar = new JButton("Buscar");
        btnBuscar.setBounds(120, 200, 90, 30);

        JButton btnEliminar = new JButton("Eliminar");
        btnEliminar.setBounds(220, 200, 100, 30);

        JButton btnActualizar = new JButton("Actualizar");
        btnActualizar.setBounds(20, 410, 120, 30);

        JButton btnLimpiar = new JButton("Limpiar");
        btnLimpiar.setBounds(200, 410, 120, 30);

        btnGuardar.addActionListener(e -> {
            Tarea t = new Tarea(
                    txtNombre.getText(),
                    txtDesc.getText(),
                    combo.getSelectedItem().toString()
            );
            Operaciones.guardar(t);
            modelo.addElement(t.getNombre() + " - " + t.getPrioridad() + " | " + t.getDescripcion());
        });

        btnBuscar.addActionListener(e -> {
            modelo.clear();
            for(Tarea t : Operaciones.buscar(txtNombre.getText())){
                modelo.addElement(t.getNombre() + " - " + t.getPrioridad() + " | " + t.getDescripcion());
            }
        });

        btnEliminar.addActionListener(e -> {
            String nombre = txtNombre.getText();
            Operaciones.eliminar(nombre);
            modelo.clear();
            for(Tarea t2 : Operaciones.obtenerTodas()){
                modelo.addElement(t2.getNombre() + " - " + t2.getPrioridad() + " | " + t2.getDescripcion());
            }
        });

        btnActualizar.addActionListener(e -> {
            Tarea t = new Tarea(
                    txtNombre.getText(),
                    txtDesc.getText(),
                    combo.getSelectedItem().toString()
            );
            Operaciones.actualizar(t);
            modelo.clear();
            for(Tarea t2 : Operaciones.obtenerTodas()){
                modelo.addElement(t2.getNombre() + " - " + t2.getPrioridad() + " | " + t2.getDescripcion());
            }
        });

        btnLimpiar.addActionListener(e -> {
            txtNombre.setText("");
            txtDesc.setText("");
            combo.setSelectedIndex(0);
            modelo.clear();
            for(Tarea t3 : Operaciones.obtenerTodas()){
                modelo.addElement(t3.getNombre() + " - " + t3.getPrioridad() + " | " + t3.getDescripcion());
            }
        });

        v.add(new JLabel("Nombre:")).setBounds(20,20,100,20);
        v.add(txtNombre);
        v.add(new JLabel("Descripción:")).setBounds(20,60,100,20);
        v.add(spDesc);
        v.add(new JLabel("Prioridad:")).setBounds(20,150,100,20);
        v.add(combo);
        v.add(btnGuardar);
        v.add(btnBuscar);
        v.add(btnEliminar);
        v.add(btnActualizar);
        v.add(btnLimpiar);
        v.add(spLista);

        v.setVisible(true);
    }
}