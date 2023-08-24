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
    String adminName = "";

    public Fortyfour() {
        setLayout(null);
        setTitle("Pantalla pricipal");
        getContentPane().setBackground(new Color(245, 183, 177));
        Fortyone getUserName = new Fortyone();
        adminName = getUserName.texto;

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

        welcome = new JLabel("Welcome to my practice profile " + adminName);
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
        worker.setForeground(new Color(39, 55, 70));
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
        paternal.setForeground(new Color(39, 55, 70));
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
        maternal.setForeground(new Color(39, 55, 70));
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
        department.setForeground(new Color(39, 55, 70));
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
        old.setForeground(new Color(39, 55, 70));
        old.setBounds(300, 540, 220, 25);
        add(old);
        old.addItem("");
        old.addItem("Continue practicing JAVA");
        old.addItem("Learn how to implement backlog in your code");
        old.addItem("Learn how to play chess");

        result = new JLabel("S");
        result.setFont(new Font("Andale mono", 3, 14));
        result.setForeground(new Color(253, 237, 236));
        add(result);
        result.setBounds(220, 307, 250, 25);

        area = new JTextArea();
        area.setEditable(false);
        area.setBackground(new Color(91, 44, 111));
        area.setFont(new Font("Andale mono", 3, 14));
        area.setForeground(new Color(39, 55, 70));
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
        if (e.getSource() == calculo) {
            String workerName = worker.getText();
            String AP = paternal.getText();
            String AM = maternal.getText();
            String hobby = department.getSelectedItem().toString();
            String learn = old.getSelectedItem().toString();

            if (workerName.equals("") || workerName.equals("") ||
                    workerName.equals("") || workerName.equals("") ||
                    workerName.equals("")) {
                JOptionPane.showMessageDialog(null, "Debes llenar todos los campos");
            } else {
                if (department.getSelectedItem().toString().equals("Listening to music")) {
                    if (old.getSelectedItem().toString().equals("Continue practicing JAVA")) {
                        area.setText(
                                "\n You, " + workerName + " " + AP + " " + AM + " " + ", seem to like " + hobby
                                        + " while you " + learn +
                                        "\n , I do the same too :)");
                    }
                    if (old.getSelectedItem().toString().equals("Learn how to implement backlog in your code")) {
                        area.setText(
                                "\n You, " + workerName + " " + AP + " " + AM + " " + ", seem to like " + hobby
                                        + " while you " + learn +
                                        "\n , I do the same too :)");
                    }
                    if (old.getSelectedItem().toString().equals("Learn how to play chess")) {
                        area.setText(
                                "\n You, " + workerName + " " + AP + " " + AM + " " + ", seem to like " + hobby
                                        + " while you " + learn +
                                        "\n , I do not the same, it's a little strange, that's good... I think");
                    }

                }
                //
                if (department.getSelectedItem().toString().equals("Take a walk with your dog")) {
                    if (old.getSelectedItem().toString().equals("Continue practicing JAVA")) {
                        area.setText(
                                "\n You, " + workerName + " " + AP + " " + AM + " " + ", seem to like " + hobby
                                        + " while you " + learn +
                                        "\n , I do it too, but not both at the same time, congratulations if you can... :)");
                    }
                    if (old.getSelectedItem().toString().equals("Learn how to implement backlog in your code")) {
                        area.setText(
                                "\n You, " + workerName + " " + AP + " " + AM + " " + ", seem to like " + hobby
                                        + " while you " + learn
                                        + "." +
                                        "\n , I go for a walk when I get stressed when learning backlog, that's crazy, I know :)");
                    }
                    if (old.getSelectedItem().toString().equals("Learn how to play chess")) {
                        area.setText(
                                "\n You, " + workerName + " " + AP + " " + AM + " " + ", seem to like " + hobby
                                        + " while you " + learn +
                                        "\n , I do not the same, it's a little strange, that's good... I think");
                    }

                }
                //
                if (department.getSelectedItem().toString()
                        .equals("Learn the best programming language in the world (JAVA)")) {
                    if (old.getSelectedItem().toString().equals("Continue practicing JAVA")) {
                        area.setText(
                                "\n You, " + workerName + " " + AP + " " + AM + " " + ", seem to like " + hobby
                                        + " while you " + learn +
                                        "\n , It's good to learn new thinks everyday, I try to improve my knowledge in Java :)"
                                        +
                                        "\n as much as I can");
                    }
                    if (old.getSelectedItem().toString().equals("Learn how to implement backlog in your code")) {
                        area.setText(
                                "\n You, " + workerName + " " + AP + " " + AM + " " + ", seem to like " + hobby
                                        + " while you " + learn
                                        + "." +
                                        "\n What do you recommend? I want to use a diferent language :)");
                    }
                    if (old.getSelectedItem().toString().equals("Learn how to play chess")) {
                        area.setText(
                                "\n You, " + workerName + " " + AP + " " + AM + " " + ", seem to like " + hobby
                                        + " while you " + learn +
                                        "\n , I knew how to play it two years ago, that's an interesting game,I recommend it");
                    }

                }
            }
        }
        if (e.getSource() == orange) {
            getContentPane().setBackground(new Color(236, 112, 99));
        }
        if (e.getSource() == violet) {
            getContentPane().setBackground(new Color(175, 122, 197));
        }
        if (e.getSource() == green) {
            getContentPane().setBackground(new Color(82, 190, 128));
        }
        if (e.getSource() == back) {
            Fortyone formulario = new Fortyone();
            formulario.setBounds(0, 0, 600, 700);
            formulario.setVisible(true);
            formulario.setResizable(false);
            formulario.setLocationRelativeTo(null);
            this.setVisible(false);
        }
        if (e.getSource() == New) {
            worker.setText("");
            paternal.setText("");
            maternal.setText("");
            department.setSelectedIndex(0);
            old.setSelectedIndex(0);
        }
        if (e.getSource() == creater) {
            JOptionPane.showMessageDialog(null, "I hope you to have enjoyed my practice, " +
                    "\n I'll be doing more complex stuff to show you.");
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
