package pd2ferdihoca;

import javax.swing.*;

public class Demo {

    JFrame f;

    Demo() {
        f = new JFrame(); // creating instance of JFrame
        JButton b = new JButton("click"); // creating instance of JButton
        b.setBounds(100, 100, 90, 50); // setting position of button
        f.add(b); // adding button to JFrame
        f.setSize(300, 300); // setting size of JFrame 300 width and 300 height
        f.setLayout(null); // using no layout managers
        f.setVisible(true); // making the frame visible

    }

    public static void main(String[] args) {
        new Demo();
    }
}
