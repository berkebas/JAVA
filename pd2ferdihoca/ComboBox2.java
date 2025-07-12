package pd2ferdihoca;

import java.awt.FlowLayout;

import javax.swing.*;

public class ComboBox2 {

    JFrame frame;

    ComboBox2() {
        frame = new JFrame("Course Selection");

        JLabel label = new JLabel("", JLabel.CENTER);
        label.setBounds(50, 30, 300, 30);

        String[] courses = { "Programing Languages", "Data Structures", "English", "Web Applications" };

        JComboBox<String> comboBox = new JComboBox<>(courses);
        comboBox.setBounds(50, 80, 150, 25);

        JButton button = new JButton("Show Selection");
        button.setBounds(220, 80, 130, 25);

        button.addActionListener(e -> {
            String selected = (String) comboBox.getSelectedItem();
            label.setText("Selected Course: " + selected);
        });

        frame.add(label);
        frame.add(comboBox);
        frame.add(button);

        frame.setSize(420, 200);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new ComboBox2();
    }
}
