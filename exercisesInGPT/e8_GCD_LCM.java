package exercisesInGPT;

import java.util.Scanner;

public class e8_GCD_LCM {
    public static void main(String[] args) {
        // EBOB (GCD - Greatest Common Divisor) (İki sayının en büyük ortak bölenini) ve 
        // EKOK (LCM - Least Common Multiple) (İki sayının en küçük ortak katını) Hesaplayan uygulama
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("EBOB hesaplamak için 1, EKOK hesaplamak için 2 girin : ");
        int secim = scanner.nextInt();

        System.out.print("Birinci sayıyı girin : ");
        int number1 = scanner.nextInt();
        System.out.print("İkinci sayıyı girin : ");
        int number2 = scanner.nextInt();
        scanner.close();

        if (secim==1){
            System.out.println("EBOB " + EBOB(number1, number2));
        }else if(secim==2){
            int ebobSonucu = EBOB(number1, number2);
            int ekokSonucu = (number1*number2)/ebobSonucu;
            System.out.println("EKOK : "+ekokSonucu);
        }else{
            System.out.println("Geçersiz seçim! ");
        }
        
    }

    public static int EBOB (int a, int b){
        while (b!=0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
