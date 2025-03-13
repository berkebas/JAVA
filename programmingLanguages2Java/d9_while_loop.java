import java.util.Scanner;

public class d9_while_loop {
    public static void main(String[] args) {
        // while loop = executes a block of code as long as a it is condition remains true

        Scanner scanner = new Scanner(System.in);
        String name = "";

        do{
            System.out.println("Enter your name: ");
            name = scanner.nextLine();
        }while(name.isBlank());
        // isBlank ifadenin içi boşsa veya sadece boşlukdan oluşuyorsa true döndürür 
        // do-while değil de sadece while olarak da kullanabiliriz.

        System.out.println("Hello " + name);
        scanner.close();
        
    }
}
