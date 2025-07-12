package swingDersleri;

import javax.swing.*;

public class swing2 {
    public static void main(String[] args) {
        
        int vize1, vize2, final1;

        String svize1 = JOptionPane.showInputDialog("Lütfen 1.vize notunuzu giriniz: ");  // JOptionPane ile kullanıcıdan bilgi alıyoruz
        vize1 = Integer.parseInt(svize1); // String'i int'e çeviriyoruz

        while(vize1<0 || vize1>100){
            svize1=JOptionPane.showInputDialog(null, "Lütfen 1.vize notunuzu giriniz: ","Vize1",JOptionPane.WARNING_MESSAGE); // JOptionPane ile kullanıcıdan bilgi alıyoruz
            vize1 = Integer.parseInt(svize1); // String'i int'e çeviriyoruz
        }

        String svize2 = JOptionPane.showInputDialog("Lütfen 1.vize notunuzu giriniz: ");  // JOptionPane ile kullanıcıdan bilgi alıyoruz
        vize2 = Integer.parseInt(svize2); // String'i int'e çeviriyoruz

        while(vize2<0 || vize2>100){
            svize2=JOptionPane.showInputDialog(null, "Lütfen 1.vize notunuzu giriniz: ","Vize1",JOptionPane.WARNING_MESSAGE); // JOptionPane ile kullanıcıdan bilgi alıyoruz
            vize2 = Integer.parseInt(svize2); // String'i int'e çeviriyoruz
        }

        String sfinal = JOptionPane.showInputDialog("Lütfen 1.vize notunuzu giriniz: ");  // JOptionPane ile kullanıcıdan bilgi alıyoruz
        final1 = Integer.parseInt(sfinal); // String'i int'e çeviriyoruz

        while(final1<0 || final1>100){
            sfinal=JOptionPane.showInputDialog(null, "Lütfen 1.vize notunuzu giriniz: ","Vize1",JOptionPane.WARNING_MESSAGE); // JOptionPane ile kullanıcıdan bilgi alıyoruz
            final1 = Integer.parseInt(sfinal); // String'i int'e çeviriyoruz
        }


        double result = vize1*0.2 + vize2*0.2 + final1*0.6; //not hesaplama işlemi
        String mesaj = "";
        if(result>50){
            mesaj += "Tebrikler, dersten geçtiniz ";  // mesaj değişkenine ekleme yapıyoruz
        }
        else{
            mesaj += "Not ortalaanız 50!nin altında, kaldınız!"; // mesaj değişkenine ekleme yapıyoruz
        }

        JOptionPane.showMessageDialog(null, mesaj, "Sonuc Acıklama, ", JOptionPane.INFORMATION_MESSAGE);  // JOptionPane ile mesaj kutusu açıyoruz


    }
}
