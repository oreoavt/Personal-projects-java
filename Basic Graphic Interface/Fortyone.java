import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Fortyone extends JFrame implements ActionListener {
    private JLabel label1, label2, label3, label4;
    private JButton boton;
    private JTextField text;
    private ImageIcon imagen;
    public static String texto = "";

    public Fortyone() {
        setLayout(null);
        setTitle("Hola, soy Bryan");
        getContentPane().setBackground(new Color(38, 41, 46));

        imagen = new ImageIcon("images/Logones.png");
        label1 = new JLabel(imagen);
        label1.setBounds(35, 30, 508, 513);
        add(label1);

        label2 = new JLabel("Hola, te doy la bienvenida a esta interfaz de prueba Java");
        label2.setBounds(47, 2, 550, 30);
        label2.setFont(new Font("Andale Mono", 3, 18));
        label2.setForeground(new Color(208, 236, 231));
        add(label2);

        label3 = new JLabel("Ingresa tu nombre");
        label3.setBounds(10, 558, 200, 30);
        label3.setFont(new Font("Andale Mono", 3, 17));
        label3.setForeground(new Color(208, 236, 231));
        add(label3);

        label4 = new JLabel("Creado el 22 de octubre del 2023");
        label4.setBounds(198, 635, 200, 30);
        label4.setFont(new Font("Andale Mono", 3, 12));
        label4.setForeground(new Color(208, 236, 231));
        add(label4);

        text = new JTextField();
        text.setBounds(170, 550, 255, 45);
        text.setBackground(new Color(128, 139, 150));
        text.setFont(new Font("Andale Mono", 3, 14));
        text.setForeground(new Color(255, 255, 255));
        add(text);

        boton = new JButton("Ingresar");
        boton.setBounds(250, 600, 100, 30);
        boton.setBackground(new Color(210, 180, 222));
        boton.setFont(new Font("Andale Mono", 3, 14));
        boton.setForeground(new Color(244, 236, 247));
        boton.addActionListener(this);
        add(boton);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton) {
            texto = text.getText().trim();
            if (texto.equals("")) {
                JOptionPane.showMessageDialog(null, "Hola!!, ingresa tu nombre");
            } else {
                Fortythree formulario = new Fortythree();
                formulario.setBounds(0, 0, 685, 600);
                formulario.setVisible(true);
                formulario.setResizable(false);
                formulario.setLocationRelativeTo(null);
                this.setVisible(false);
            }
        }
    }

    public static void main(String args[]) {
        Fortyone formulario = new Fortyone();
        formulario.setBounds(0, 0, 600, 700);
        formulario.setVisible(true);
        formulario.setResizable(false);
        formulario.setLocationRelativeTo(null);
    }
}
