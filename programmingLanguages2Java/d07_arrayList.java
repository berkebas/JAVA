import java.util.ArrayList;

public class d15_arrayList {
    public static void main(String[] args) {

        // ArrayList = a resizable array.
        // Elements can be added and removed after compilation phase
        // store reference data types

        ArrayList<String> food = new ArrayList<String>();

        food.add("pizza");
        food.add("hamburger");
        food.add("hotdog");

        food.set(0, "sushi"); // food[0]'ı sushi olarak değiştirir
        food.remove(2); // sadece 2 tanesini yazar
        food.clear(); // foodu temizler
        for (int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));
        }
    }
}
