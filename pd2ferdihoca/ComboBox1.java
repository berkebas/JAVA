package pd2ferdihoca;

import javax.swing.*;
import java.awt.*;

public class ComboBox1 {

    JFrame f;

    ComboBox1() {
        f = new JFrame("ComboBox1");
        String lectures[] = { "Prog 2", "Web Ap5plications", "Data Structures", "English", "Data Science" };
        JComboBox cb = new JComboBox(lectures);
        cb.setBounds(50, 40, 70, 70);
        f.add(cb);
        f.setLayout(new FlowLayout());
        f.setSize(200, 200);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ComboBox1();
    }
}


// yanına bir buton ekleyelim ve bizim yaptıgımız ders secimini butona tıkladıgımızda
// "secşlen ders: data structures" seklinde frame degösterilece