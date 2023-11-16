package Lektion6.ÜB5;

import java.util.Scanner;

public class Main {
    public static double calculatePower(double base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        else {
            return base * calculatePower(base, exponent - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Geben Sie die Basis ein: ");
            double base = scanner.nextDouble();

            System.out.print("Geben Sie den Exponenten ein: ");
            int exponent = scanner.nextInt();

            double result = calculatePower(base, exponent);
            System.out.println(base + "^" + exponent + " = " + result);
        } catch (Exception e) {
            System.out.println("Fehlerhafte Eingabe.");
        }
        scanner.close();
    }
}
