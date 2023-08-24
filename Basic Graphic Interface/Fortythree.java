import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Fortythree extends JFrame implements ActionListener, ChangeListener {
    private JLabel label1, label2;
    private JCheckBox box;
    private JScrollPane pane;
    private JTextArea text;
    private JButton boton1, boton2;
    String u_name = "";

    public Fortythree() {
        setLayout(null);
        setTitle("Licencia de uso");
        getContentPane().setBackground(new Color(38, 41, 46));
        Fortyone user_name = new Fortyone();
        u_name = user_name.texto;

        label1 = new JLabel("TÉRMINOS Y CONDICIONES");
        label1.setBounds(215, 5, 300, 30);
        label1.setFont(new Font("Andale Mono", 1, 15));
        label1.setForeground(new Color(171, 178, 185));
        add(label1);

        JLabel label3 = new JLabel("Yo " + ", " + "'" + u_name + "'" + ", " + " acepto");
        label3.setBounds(376, 281, 200, 30);
        label3.setFont(new Font("Andale Mono", 1, 15));
        label3.setForeground(new Color(213, 245, 227));
        add(label3);

        text = new JTextArea();
        text.setEditable(false);
        text.setFont(new Font("Andale Mono", 0, 12));
        text.setText("terminos y condiciones");
        pane = new JScrollPane(text);
        pane.setBounds(10, 40, 650, 200);
        text.setBackground(new Color(171, 178, 185));
        add(pane);

        box = new JCheckBox();
        box.setBounds(350, 290, 19, 13);
        box.setBackground(new Color(38, 41, 46));
        box.addChangeListener(this);
        add(box);

        boton1 = new JButton("Acepto");
        boton1.setEnabled(false);
        boton1.setBounds(350, 350, 100, 30);
        boton1.addActionListener(this);
        boton1.setBackground(new Color(249, 235, 234));
        add(boton1);

        boton2 = new JButton("No acepto");
        boton2.setEnabled(true);
        boton2.setBounds(470, 350, 100, 30);
        boton2.addActionListener(this);
        boton2.setBackground(new Color(249, 235, 234));
        add(boton2);

        ImageIcon imagen = new ImageIcon("images/Iconnes.png");
        label2 = new JLabel(imagen);
        label2.setBounds(5, 258, 300, 300);
        add(label2);

    }

    public void stateChanged(ChangeEvent e) {
        if (box.isSelected()) {
            boton1.setEnabled(true);
            boton2.setEnabled(false);
        } else {
            boton1.setEnabled(false);
            boton2.setEnabled(true);
        }
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton1) {
            Fortyfour formulario = new Fortyfour();
            formulario.setBounds(0, 0, 640, 760);
            formulario.setVisible(true);
            formulario.setResizable(false);
            formulario.setLocationRelativeTo(null);
            this.setVisible(false);
        } else if (e.getSource() == boton2) {
            Fortyone formulario = new Fortyone();
            formulario.setBounds(0, 0, 600, 700);
            formulario.setVisible(true);
            formulario.setResizable(false);
            formulario.setLocationRelativeTo(null);
            this.setVisible(false);
        }
    }

    public static void main(String args[]) {
        Fortythree formulario = new Fortythree();
        formulario.setBounds(0, 0, 685, 600);
        formulario.setVisible(true);
        formulario.setResizable(false);
        formulario.setLocationRelativeTo(null);
    }

}
