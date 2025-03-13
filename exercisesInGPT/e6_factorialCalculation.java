package exercisesInGPT;

import java.util.Scanner;

public class e6_factorialCalculation {
    public static void main(String[] args) {
        // Girilen sayının faktöriyelini hesaplar 

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin : ");
        int sayi = scanner.nextInt();
        int factorial =1;

        
        System.out.println("Girdiğiniz sayının faktöriyeli : " + faktoriyelIterative(sayi));

        while (sayi>0){
            factorial = factorial * sayi;
            sayi = sayi-1;
        }

        System.out.println("Girdiğiniz sayının faktöriyeli : "+factorial);
        scanner.close();

    }

     // Döngü (Iterative) yöntemiyle faktöriyel hesaplama
     public static long faktoriyelIterative(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Negatif sayıların faktöriyeli hesaplanamaz!");
        }

        long sonuc = 1;
        for (int i = 2; i <= n; i++) {
            sonuc *= i;
        }
        return sonuc;
    }

}
