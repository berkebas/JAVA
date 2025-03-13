public class d14_string_methods {
    public static void main(String[] args) {
        // String = a reference data type that can store one or more characters
        //          reference data types have access to useful methods
        // String = bir veya daha fazla karakteri saklayabilen referans veri türü
        //          referans veri türlerinin yararlı yöntemlere erişimi vardır

        String name = "Bro";

        //boolean result = name.equals("Bro");              // iki string eşitmi kontrol eder
        //boolean result = name.equalsIgnoreCase("bro");    // büyük/küçük harf göz ardı edilir 
        //int result = name.length();                       // uzunluk
        //char result = name.charAt(0);                     // 0. karakter ne
        //int result = name.indexof("o");                   // yazılan harf kaçıncı sırada
        //boolean result = name.isEmpty();                  // boş mu değil mi kontrol 
        //String result = name.toUpperCase();               // büyük harf yapar
        //String result= name.toLowerCase();                // küçük harf yapar
        //String result = name.trim();                      // boşlukları siler
        String result = name.replace('o', 'a');             // belirlenen harfi başka harfe dönüştürür

        System.out.println(result);
    }
}
