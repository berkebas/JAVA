package exercisesInGPT;

import java.util.Scanner;

public class e5_inverseOfNumber {
    public static void main(String[] args) {
        // Bir sayıjnın terisini yazdıran uygulama

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayı girin : ");
        int sayi = scanner.nextInt();
        int yeniSayi = 0;

        while(sayi>0){
            yeniSayi = yeniSayi*10 + (sayi % 10);
            sayi = sayi /10;

        }

        System.out.println("Girdiğiniz sayının tersi : " + yeniSayi);

        scanner.close();
    }
}
