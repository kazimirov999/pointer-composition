package src;

public class Main {
    public static void main(String[] args) {
        Bus iveco = new Bus();
        Truck daf = new Truck();
        Sportcar astonMartin = new Sportcar();
        iveco.stockekip(" Iveco Daily", "White", 18, "Skin");
        iveco.specialekip(" Allseasons", "Auto", "Diesel");
        daf.stockekip(" Daf 105 XF", "White", 1, " Plastic");
        daf.specialekip(" Allseasons", "Auto", "Diesel");
        astonMartin.stockekip("Aston Martin Vulcan", "Red", 1, "Skin");
        astonMartin.specialekip(" Sport ", "Auto with hand regime ", "Sport gasoline");
        System.out.println(iveco.toString());
        System.out.println(daf.toString());
        System.out.println(astonMartin.toString());


    }
}
