package exercisesInGPT;

import java.util.Scanner;

public class e2_primesCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen bir sayı girin asal olup olmadığını kontrol edelim :) ");
        int sayi = scanner.nextInt();
        boolean asalMi = true;

        if (sayi < 2) {
            asalMi = false; // 1 ve negatif sayılar asal değildir.
        } else {
            for (int i = 2; i <= Math.sqrt(sayi); i++) {
                if (sayi % i == 0) {
                    asalMi = false;
                    break; // asal olmadığı belirlendiyse döngüyü bitir. yoksa çalışmaya devam edip yanlış
                           // sonuç verir
                }
            }
        }

        if (asalMi) {
            System.out.printf("Girdiğiniz %d sayisi asaldır", sayi);
        } else {
            System.out.printf("Girdiğiniz %d sayisi asal değildir", sayi);
        }

        scanner.close();

    }
}
