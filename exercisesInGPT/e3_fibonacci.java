package exercisesInGPT;

import java.util.Scanner;

public class e3_fibonacci {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Fibonacci serisinde kaç terim görmek istediğinizi yazınız : ");
        int piece = scanner.nextInt();
        
        int x1 = 0, x2=1;
        int toplam = x1+x2;

        System.out.print("Fibonaci seriniz : " +x1+" "+x2);
        for (int i = 2; i<=piece;i++){
            int x3 = x1 + x2;
            System.out.print(" "+ x3);
            toplam = toplam + x3;
            x1=x2; x2=x3;

        }
        System.out.println();
        System.out.println("Fibonacci serinizin terimler toplamı : " + toplam);

        scanner.close();
        

    }
}
