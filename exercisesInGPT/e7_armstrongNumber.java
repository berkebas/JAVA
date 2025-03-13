package exercisesInGPT;

import java.util.Scanner;

public class e7_armstrongNumber {
    public static void main(String[] args) {
        // Bir sayının armstrong sayı olup olmadığını kontrol eden uygulama
        // Bir n basamaklı sayı, basamaklarının n. kuvvetleri toplamına eşitse, Armstrong sayısı olarak adlandırılır.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin : ");
        int number = scanner.nextInt();
        int numberLength = String.valueOf(number).length(); // Sayıyı String'e çeviriyoruz ve String'in uzunluğunu alıyoruz.
        int newNumber=0, temp = number;

        while(temp>0){
            int basamak = temp%10;
            newNumber = newNumber + (int)Math.pow(basamak, numberLength);
            temp = temp/10;
        }

        if(newNumber == number){
            System.out.println("Girdiğiniz " + number +" sayısı bir Armstrong sayıdır.");
        }else {System.out.println("Girdiğiniz " + number +" sayısı bir Armstrong sayı değildir.");}


        scanner.close();
    }
}
