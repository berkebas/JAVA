package exercisesInGPT;

import java.util.Scanner;

public class e1_largestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kaç adet sayı girmek istiyorsunuz ");
        int adet = scanner.nextInt();
        int[] sayi = new int[adet];

        System.out.println("Lütfen sayılarınızı girin ");
        for (int i = 0; i < adet; i++) {
            sayi[i] = scanner.nextInt();
        }

        int enBuyukSayi = sayi[0];
        for (int i = 0; i < adet; i++) {
            if (sayi[i] > enBuyukSayi) {
                enBuyukSayi = sayi[i];
            }
        }

        System.out.println("Girdiğiniz sayılardan en büyüğü : " + enBuyukSayi);

        scanner.close();
    }
}
