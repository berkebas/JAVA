public class d12_arrays {
    public static void main(String[] args) {
        // array = used to store multiple values in a single variable
        // dizi = birden fazla değeri tek bir değişkende saklamak için kullanılır

        String[] cars ={"Camaro", "Corvette", "Tesla", "BMW"};

        String[] car = new String[3];
        car[0] = "Camaro";
        car[1] = "Corvette";
        car[2] = "Tesla";
        car[3] ="BMW";

        System.out.println(cars[0]);

        for(int i=0; i<car.length; i++){
            System.out.println(car[i]);
        }


    }
}
