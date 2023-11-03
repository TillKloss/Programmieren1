package Lektion5.ÜB6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie ganze Zahlen ein. 0 zum abbrechen.");
        int input = 0;
        int sum = 0;
        try {
            do {
                System.out.println("Zahl eingeben:");
                input = scanner.nextInt();
                sum += input;
            } while (input != 0);
            System.out.printf("Summe: %s", sum);
        } catch (Exception exception) {
            throw new RuntimeException("Ungültige Eingabe!");
        }
    }
}
