package pd2ferdihoca;

public class SplitExample {
    public static void main(String[] args) {
        String text = "Hello             world! This is a test.";
        String[] words = text.split("\\s+");

        System.out.println("Kelime Sayısı : " + words.length);
        for (String word : words) {
            System.out.println(word);
        }
    }
}
