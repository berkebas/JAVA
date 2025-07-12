package pd2ferdihoca;

import javax.swing.*;

public class RadioButton1 {
    public static void main(String[] args) {

        JFrame frame = new JFrame("JRadioButton Example");

        JRadioButton r1 = new JRadioButton("1.Öğretim");
        JRadioButton r2 = new JRadioButton("2.Öğretim");

        r1.setBounds(100, 50, 100, 30);
        r2.setBounds(100, 100, 100, 30);

        ButtonGroup group = new ButtonGroup();
        group.add(r1);
        group.add(r2);

        frame.add(r1);
        frame.add(r2);

        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
