import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Fortyfour extends JFrame implements ActionListener {
    private JMenuBar mb;
    private JMenu opt, calc, about, bg;
    private JMenuItem calculo, orange, violet, green, creater, back, New;
    private JLabel logo, welcome, title, name, s_maternal, s_paternal, depart, anti, result, labelfooter;
    private JTextField worker, maternal, paternal;
    private JComboBox department, old;
    private JScrollPane spane;
    private JTextArea area;
    private ImageIcon img;

    public Fortyfour() {
        setLayout(null);
        setTitle("Pantalla pricipal");
        getContentPane().setBackground(new Color(245, 183, 177));

        mb = new JMenuBar();
        mb.setBackground(new Color(241, 148, 138));
        setJMenuBar(mb);

        opt = new JMenu("Options");
        opt.setBackground(new Color(241, 148, 138));
        opt.setFont(new Font("Andale mono", 3, 14));
        opt.setForeground(new Color(253, 237, 236));
        mb.add(opt);

        calc = new JMenu("Calculate");
        calc.setBackground(new Color(241, 148, 138));
        calc.setFont(new Font("Andale mono", 3, 14));
        calc.setForeground(new Color(253, 237, 236));
        mb.add(calc);

        about = new JMenu("About");
        about.setBackground(new Color(241, 148, 138));
        about.setFont(new Font("Andale mono", 3, 14));
        about.setForeground(new Color(253, 237, 236));
        mb.add(about);

        bg = new JMenu("Color");
        bg.setFont(new Font("Andale mono", 3, 14));
        bg.setForeground(new Color(39, 55, 70));
        opt.add(bg);

        calculo = new JMenuItem("Vacations");
        calculo.setFont(new Font("Andale mono", 3, 14));
        calculo.setForeground(new Color(39, 55, 70));
        calc.add(calculo);
        calculo.addActionListener(this);

        orange = new JMenuItem("Orange");
        orange.setFont(new Font("Andale mono", 3, 14));
        orange.setForeground(new Color(39, 55, 70));
        bg.add(orange);
        orange.addActionListener(this);

        violet = new JMenuItem("violet");
        violet.setFont(new Font("Andale mono", 3, 14));
        violet.setForeground(new Color(39, 55, 70));
        bg.add(violet);
        violet.addActionListener(this);

        green = new JMenuItem("green");
        green.setFont(new Font("Andale mono", 3, 14));
        green.setForeground(new Color(39, 55, 70));
        bg.add(green);
        green.addActionListener(this);

        New = new JMenuItem("Nuevo");
        New.setFont(new Font("Andale mono", 3, 14));
        New.setForeground(new Color(39, 55, 70));
        opt.add(New);
        New.addActionListener(this);

        creater = new JMenuItem("About the author");
        creater.setFont(new Font("Andale mono", 3, 14));
        creater.setForeground(new Color(39, 55, 70));
        about.add(creater);
        creater.addActionListener(this);

        back = new JMenuItem("Cerrar");
        back.setFont(new Font("Andale mono", 3, 14));
        back.setForeground(new Color(39, 55, 70));
        opt.add(back);
        back.addActionListener(this);

        img = new ImageIcon("images/logo.png");
        logo = new JLabel(img);
        logo.setBounds(60, 0, 512, 512);
        add(logo);

        welcome = new JLabel("Welcome to my practice profile");
        welcome.setFont(new Font("Andale mono", 1, 20));
        welcome.setForeground(new Color(253, 237, 236));
        add(welcome);
        welcome.setBounds(150, 10, 400, 50);

        title = new JLabel("Data to know the designer of this page");
        title.setFont(new Font("Andale mono", 3, 14));
        title.setForeground(new Color(253, 237, 236));
        add(title);
        title.setBounds(160, 50, 900, 25);

        name = new JLabel("Enter your name");
        name.setFont(new Font("Andale mono", 3, 14));
        name.setForeground(new Color(253, 237, 236));
        add(name);
        name.setBounds(25, 430, 250, 25);

        worker = new JTextField();
        worker.setBackground(new Color(244, 236, 247));
        worker.setFont(new Font("Andale mono", 3, 14));
        worker.setForeground(new Color(253, 237, 236));
        worker.setBounds(25, 460, 150, 25);
        add(worker);

        s_paternal = new JLabel("Enter your father's last name");
        s_paternal.setFont(new Font("Andale mono", 3, 14));
        s_paternal.setForeground(new Color(253, 237, 236));
        add(s_paternal);
        s_paternal.setBounds(25, 510, 250, 25);

        paternal = new JTextField();
        paternal.setBackground(new Color(244, 236, 247));
        paternal.setFont(new Font("Andale mono", 3, 14));
        paternal.setForeground(new Color(253, 237, 236));
        paternal.setBounds(25, 540, 150, 25);
        add(paternal);

        s_maternal = new JLabel("Enter your mother's last name");
        s_maternal.setFont(new Font("Andale mono", 3, 14));
        s_maternal.setForeground(new Color(253, 237, 236));
        add(s_maternal);
        s_maternal.setBounds(25, 580, 250, 25);

        maternal = new JTextField();
        maternal.setBackground(new Color(244, 236, 247));
        maternal.setFont(new Font("Andale mono", 3, 14));
        maternal.setForeground(new Color(253, 237, 236));
        maternal.setBounds(25, 610, 150, 25);
        add(maternal);

        depart = new JLabel("Enter your favorite hobby");
        depart.setFont(new Font("Andale mono", 3, 14));
        depart.setForeground(new Color(253, 237, 236));
        add(depart);
        depart.setBounds(300, 430, 180, 25);

        department = new JComboBox();
        department.setBackground(new Color(244, 236, 247));
        department.setFont(new Font("Andale mono", 3, 14));
        department.setForeground(new Color(253, 237, 236));
        department.setBounds(300, 460, 220, 25);
        add(department);
        department.addItem("");
        department.addItem("Listening to music");
        department.addItem("Take a walk with your dog");
        department.addItem("Learn the best programming language in the world (JAVA)");

        anti = new JLabel("Enter what you'd like to learn");
        anti.setFont(new Font("Andale mono", 3, 14));
        anti.setForeground(new Color(253, 237, 236));
        add(anti);
        anti.setBounds(300, 510, 180, 25);

        old = new JComboBox();
        old.setBackground(new Color(244, 236, 247));
        old.setFont(new Font("Andale mono", 3, 14));
        old.setForeground(new Color(253, 237, 236));
        old.setBounds(300, 540, 220, 25);
        add(old);
        old.addItem("");
        old.addItem("Continue practicing JAVA");
        old.addItem("Learn backlog");
        old.addItem("Learn how to play chess");

        result = new JLabel("S");
        result.setFont(new Font("Andale mono", 3, 14));
        result.setForeground(new Color(253, 237, 236));
        add(result);
        result.setBounds(220, 307, 250, 25);

        area = new JTextArea();
        area.setEditable(false);
        area.setBackground(new Color(244, 236, 247));
        area.setFont(new Font("Andale mono", 3, 14));
        area.setForeground(new Color(253, 237, 236));
        area.setText("\n Here's your result");
        spane = new JScrollPane(area);
        spane.setBounds(300, 580, 300, 90);
        add(spane);

        labelfooter = new JLabel("I'm still practicing to improve it, I love you");
        labelfooter.setBounds(180, 670, 500, 30);
        area.setForeground(new Color(253, 237, 236));
        add(labelfooter);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == result) {

        }
        if (e.getSource() == orange) {

        }
        if (e.getSource() == violet) {

        }
        if (e.getSource() == green) {

        }
        if (e.getSource() == back) {

        }
        if (e.getSource() == New) {

        }
        if (e.getSource() == creater) {

        }
    }

    public static void main(String args[]) {
        Fortyfour formulario = new Fortyfour();
        formulario.setBounds(0, 0, 640, 760);
        formulario.setVisible(true);
        formulario.setResizable(false);
        formulario.setLocationRelativeTo(null);
    }
}
