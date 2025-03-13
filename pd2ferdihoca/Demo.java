package pd2ferdihoca;

import javax.swing.*;

public class Demo {

    JFrame f;

    Demo() {
        f = new JFrame();
        JButton b = new JButton("click");
        b.setBounds(100, 100, 90, 50);
        f.add(b);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);

    }

    public static void main(String[] args) {
        new Demo();
    }
}
