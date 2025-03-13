package exercisesInGPT;

import java.util.Scanner;

public class e4_sumDigitsOfNumber {
    public static void main(String[] args) {
        // Girilen sayının basamaklarının toplamını bulan uygulama
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayı girin: ");
        int sayi = scanner.nextInt();
        int toplam=0;
        sayi = Math.abs(sayi);
        while(sayi>0){
            toplam = toplam + (sayi % 10);
            sayi = sayi /10;
        }

        System.out.println("Girdiğiniz sayının basamaklarının toplamı : " + toplam);

        scanner.close();

    }
}
