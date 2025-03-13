package pd2ferdihoca;

import java.awt.event.*; // imported to use java ActionListener event handlers
import javax.swing.*;

public class ButtonExample {
    public static void main(String[] args) {

        JFrame f = new JFrame("Button Example"); // creating a JFrame object with the title
        final JTextField tf = new JTextField(); // question why final keyword is used? is this necessary?
        tf.setBounds(45, 75, 220, 20);
        JButton b = new JButton("Click here");
        b.setBounds(100, 100, 100, 50);
        b.addActionListener((ActionEvent e) -> {
            tf.setText("You have just clicked the button!");
        });
        f.add(b);
        f.add(tf); // button and text added to frame
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
}
