package pd2ferdihoca;

import java.awt.*;

import javax.swing.*;

public class twoLabelExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame ("JLabel Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Black Label
        JLabel label1 = new JLabel("This is a black label");
        label1.setFont(new Font("Arial", Font.BOLD, 20));
        label1.setForeground(Color.BLACK);

        // Blue label
        JLabel label2 = new JLabel("This is a blue label");
        label2.setFont(new Font("Verdana", Font.PLAIN, 12));
        label2.setForeground(Color.BLUE);

        // Add Labels to the frame
        frame.add(label1);
        frame.add(label2);

        frame.setSize(300,200);
        frame.setVisible(true);
    }
}
