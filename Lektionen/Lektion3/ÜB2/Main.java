package Lektion3.ÜB2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Pizzagröße 26cm, 28cm, 30cm:");
            int pizza1 = scanner.nextInt();
            System.out.println("Pizzapreis:");
            double price1 = scanner.nextDouble();

            System.out.println("Pizzagröße 26cm, 28cm, 30cm:");
            int pizza2 = scanner.nextInt();
            System.out.println("Pizzapreis:");
            double price2 = scanner.nextDouble();

            //double pizzaArea1 = (Math.PI * ((double) pizza1 / 2) * (Math.PI * ((double) pizza1 / 2)));
            //double pizzaArea2 = (Math.PI * ((double) pizza2 / 2) * (Math.PI * ((double) pizza2 / 2)));

            double pizzaArea1 = Math.PI * (((double) pizza1 / 2) * ((double) pizza1 / 2));
            double pizzaArea2 = Math.PI * (((double) pizza2 / 2) * ((double) pizza2 / 2));

            double ratio1 = (pizzaArea1 / price1);
            double ratio2 = (pizzaArea2 / price2);


            if (ratio1 > ratio2)
                System.out.println("Pizza 1 hat das bessere Größe zu Preis Verhältnis.");
            else
                System.out.println("Pizza 2 hat das bessere Größe zu Preis Verhältnis.");

        } catch (Exception exception) {
            System.out.println("Überprüfen Sie Ihre Eingabe.");
        }
    }
}
