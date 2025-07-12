package pd2ferdihoca;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// chatten yazdım bunu hoca yazmadı

public class JListExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JList Example");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] cities = { "Istanbul", "Ankara", "Izmir", "Bursa", "Antalya" };

        JList<String> cityList = new JList<>(cities);

        JScrollPane scrollPane = new JScrollPane(cityList);

        // Buton oluşturuluyor
        JButton button = new JButton("Seçimi Göster");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedCity = cityList.getSelectedValue();
                if (selectedCity != null) {
                    JOptionPane.showMessageDialog(frame, "Seçilen Şehir: " + selectedCity);
                } else {
                    JOptionPane.showMessageDialog(frame, "Lütfen bir şehir seçin.");
                }
            }
        });

        // Frame düzeni
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        frame.add(scrollPane);
        frame.add(button);

        frame.setVisible(true);
    }
}