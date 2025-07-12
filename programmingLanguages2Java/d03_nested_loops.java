import java.util.Scanner;

public class d11_nested_loops {
    public static void main(String[] args) {
        // nested loops = a loop inside of a loop
        // iç içe geçmiş döngüler = döngünün içindeki döngü

        Scanner scanner= new Scanner(System.in);
        int rows; // row = satır
        int columns;  // column = sütun
        String symbol = "";

        System.out.println("Enter # of rows: ");
        rows = scanner.nextInt();
        System.out.println("Enter # of columns: ");
        columns =scanner.nextInt();
        System.out.println("Enter symbol to use: ");
        symbol =scanner.next();

        for (int i=1; i<=rows; i++){
            
            for(int j=1; j<=columns; j++){
                System.out.print(symbol);
            }

            System.out.println();
        }


        scanner.close();
    }
}
