public class d7_switches {
    public static void main(String[] args) {
        // switches (anahtarlar)
        // switch = statement that allows a variable to be tested for equality against a list of value
        // Bir değişkenin bir değer listesine göre eşitlik açısından test edilmesine olanak tanıyan ifade

        String day = "Friday";
        switch(day) {
            case "Sunday": System.out.println("It is Sunday!");
            break;
            case "Monday": System.out.println("It is Monday!");
            break;
            case "Tuesday": System.out.println("It is Tuesday!");
            break;
            case "Wednesday": System.out.println("It is Wednesday!");
            break;
            case "Thursday": System.out.println("It is Thursday!");
            break;
            case "Friday": System.out.println("It is Friday!");
            break;
            case "Saturday": System.out.println("It is Saturday!");
            break;
            default: System.out.println("That is not a day!");
        }
        // default, switch'in hiçbir case'ine girmezse default çalışır.
        // break'leri silersek girdiği case'den sonrasını çalıştırır öncesi çalışmaz.

        
    }
}
