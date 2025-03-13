import javax.swing.JOptionPane;

public class d3_GUI_into {

    public static void main(String[] args) {
        // GUI = Graphical User Interface (Grafik Kullanıcı Arayüzü)

        String name = JOptionPane.showInputDialog("Enter Your Name ");
        JOptionPane.showMessageDialog(null, "Hello " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter Your Age "));
        JOptionPane.showMessageDialog(null, "You Are " + age + " years old");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter Your Height "));
        JOptionPane.showMessageDialog(null, "You Are  " + height + " cm tall");

    }
}