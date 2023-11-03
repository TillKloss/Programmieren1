package Lektion4.ÜB5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number = getUserInput();
        int temp = number;
        int produkt = 1;
        while (number != 0) {
            produkt *= number % 10;
            number /= 10;
        }
        System.out.printf("Das Querprodukt der Zahl %s betraegt %s.", temp, produkt);
    }

    public static Integer getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie bitte eine Zahl ein: ");
        try {
            int number = scanner.nextInt();
            scanner.close();
            if (number > 1000000 || number < 1) {
                System.out.println("FEHLER - Zahl ist ungueltig.");
                getUserInput();
            } else {
                return number;
            }
        } catch (Exception exception) {
            System.out.println("FEHLER - Zahl ist ungueltig.");
            getUserInput();
        }
        throw new RuntimeException("FEHLER - Zahl ist ungueltig.");
    }
}
