package Lektion3.ÜB2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pizzagröße 26cm, 28cm, 30cm:");
        String inputPizza1 = scanner.nextLine();
        int pizza1 = Integer.parseInt(inputPizza1);
        System.out.println("Pizzapreis:");
        String inputPrice1 = scanner.nextLine();
        double price1 = Double.parseDouble(inputPrice1);

        System.out.println("Pizzagröße 26cm, 28cm, 30cm:");
        String inputPizza2 = scanner.nextLine();
        int pizza2 = Integer.parseInt(inputPizza2);
        System.out.println("Pizzapreis:");
        String inputPrice2 = scanner.nextLine();
        double price2 = Double.parseDouble(inputPrice2);

        double pizzaArea1 = Math.pow(Math.PI * ((double)pizza1 / 2), 2);
        double pizzaArea2 = Math.pow(Math.PI * ((double)pizza2 / 2), 2);

        double ratio1 = (pizzaArea1 / price1);
        double ratio2 = (pizzaArea2 / price2);



        if (ratio1 > ratio2)
            System.out.println("Pizza 1 hat das bessere Größe zu Preis Verhältnis.");
        else
            System.out.println("Pizza 2 hat das bessere Größe zu Preis Verhältnis.");
        //System.out.println(Math.max(ratio1, ratio2)); erlaubt?
    }
}
