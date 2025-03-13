package exercisesInGPT;

import java.util.HashMap;
import java.util.Scanner;

public class e9_repeatingNumber {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç elemanlı bir dizi gireceksiniz : ");
        int n = scanner.nextInt();
        int[] dizi = new int[n];

        System.out.println("Dizinin elemanlarını girin ");
        for(int i=0; i<n; i++){
            dizi[i]=scanner.nextInt();
        }
        scanner.close();

        HashMap<Integer, Integer> frekans = new HashMap<>();

        for (int num : dizi){
            frekans.put(num, frekans.getOrDefault(num, 0)+1);
        }

        System.out.print("Tekrar eden elemanlar : ");
        boolean tekrarVarMi = false;

        for(int key : frekans.keySet()){
            if(frekans.get(key)>1){
                System.out.print(key + " ");
                tekrarVarMi = true;
            }
        }
        
        if(!tekrarVarMi){
            System.err.println("Yok");
        }else System.out.println();

        System.out.println(frekans.size());
        System.out.println(frekans.values());
        
    }
}
