package pd2ferdihoca;

import javax.swing.*;

public class CheckBox2 {

    CheckBox2() {
        JFrame frame = new JFrame("CheckBox Example");

        JCheckBox checkbox = new JCheckBox("No");
        checkbox.setBounds(120, 200, 80, 25);

        JCheckBox checkbox1 = new JCheckBox("Yes", true);
        checkbox1.setBounds(180, 200, 80, 25);

        frame.add(checkbox);
        frame.add(checkbox1);

        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new CheckBox2();
    }
}
