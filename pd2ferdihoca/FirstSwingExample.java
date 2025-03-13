package pd2ferdihoca;

import javax.swing.JButton;
import javax.swing.JFrame;


public class FirstSwingExample {
    public static void main(String[] args) {
        
        JFrame fr = new JFrame();           // creating şnstance of JFrame

        JButton but = new JButton("click");     // creating instance of JButton
        but.setBounds(100, 90, 100, 50);        // x axis, y axis, width, height

        fr.add(but);                // adding button in JFrame

        fr.setSize(300,300);        // 300 width and 300 height
        fr.setLayout(null);         // no layout managers
        fr.setVisible(true);        // making the frame visible

        // Swingde bir uygulamanın ana penceresini temsil eden en üst düzey konteyner hangi sınıftır ? -jFrame (ana pencere)
        
    }
}
