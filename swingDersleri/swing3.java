package swingDersleri;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class swing3 {
    public static void main(String[] args) {

        JFrame jf = new JFrame();
        jf.setTitle("İlk Pencerem");
        jf.setSize(500, 600); // pencerenin boyutu (genişlik, yükseklik)
        jf.setLocation(400, 300); // pencerenin açılış konumu

        jf.getContentPane().setLayout(new FlowLayout()); // içerik alanının düzenini akış düzeni olarak ayarlar

        JTextField text1 = new JTextField(10); // 10 karakter genişliğinde bir metin alanı oluşturur
        JButton button1 = new JButton("Gönder"); // bir buton oluşturur
        JLabel label1 = new JLabel(); // bir etiket oluşturur
        label1.setText("Buraya isminizi girin"); // etikete metin ekledik

        jf.getContentPane().add(label1); // etiketi pencereye ekledik
        jf.getContentPane().add(text1); // metin alanını pencereye ekledik
        jf.getContentPane().add(button1); // butonu pencereye ekledik

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label1.setText("Merhabalar " + text1.getText() + " programa hosgeldin..."); // butona tıklandığında
                                                                                            // metin alanındaki yazıyı
                                                                                            // alır ve etikete ekler
            }
        });

        JButton button2 = new JButton("Tıkla"); // bir buton oluşturur
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane panelimiz = new JOptionPane(); // bir onay paneli oluşturur
                panelimiz.showMessageDialog(null, "Merhabalar panele hoşgeldiniz..."); // paneli açar ve mesajı gösterir
            }
        });
        jf.getContentPane().add(button2); // ikinci butonu pencereye ekledik

        JButton button3 = new JButton("Giris"); // bir buton oluşturur
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String isim = JOptionPane.showInputDialog("Lütfen isminizi girin: "); // kullanıcıdan text girmesini
                                                                                      // ister
                if (isim != null && !isim.trim().isEmpty()) { // eğer kullanıcı bir isim girdiyse
                    JOptionPane.showMessageDialog(null, "Merhaba " + isim + ", programa hoş geldin!"); // mesajı
                                                                                                       // gösterir
                } else {
                    JOptionPane.showMessageDialog(null, "Lütfen geçerli bir isim girin."); // geçersiz giriş için mesaj
                }
            }
        });
        jf.getContentPane().add(button3); // üçüncü butonu pencereye ekledik

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // pencere kapatıldığında programı kapatır
        jf.setResizable(false); // pencerenin boyutunu değiştirmeyi engeller
        jf.setVisible(true); // pencereyi görünür yapar
    }
}
