public class d18_methods {
    public static void main(String[] args) {

        String name = "Bro";
        int age = 23;
        hello(name, age);

        int x = 3;
        int y=4;
        int z = add(x, y);
        System.out.println(z);
        System.out.println(add(x, y));
    }

    static void hello(String asdasdasdasd, int ageeee) {
        System.out.println("Hello " + asdasdasdasd);
        System.out.println("You are " + ageeee);
    }

    static int add (int x, int y){
        
        int z = x +y;   // sadece retun x+y; satırı yazarak da kullanılabilir
        return z;

    }
}
