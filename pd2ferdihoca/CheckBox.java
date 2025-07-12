package pd2ferdihoca;

import javax.swing.*;
import java.awt.event.*;

public class CheckBox {

    CheckBox() {
        JFrame frame = new JFrame("CheckBox");
        JLabel label = new JLabel();
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(50, 20, 300, 30);

        JCheckBox checkbox1 = new JCheckBox("No");
        checkbox1.setBounds(160, 100, 80, 25);

        JCheckBox checkbox2 = new JCheckBox("Yes");
        checkbox2.setBounds(160, 120, 100, 30);

        checkbox1.addItemListener(e -> {
            label.setText("No Checkbox: " + (e.getStateChange() == ItemEvent.SELECTED ? "checked" : "unchecked"));
        });
        checkbox2.addItemListener(e -> {
            label.setText("Yes Checkbox: " + (e.getStateChange() == ItemEvent.SELECTED ? "checked" : "unchecked"));
        });

        frame.add(checkbox1);
        frame.add(checkbox2);
        frame.add(label);
        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new CheckBox();
    }

}
