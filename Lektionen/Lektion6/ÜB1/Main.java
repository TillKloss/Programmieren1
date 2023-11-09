package Lektion6.ÜB1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Object[] values = getUserInput();
        double number = (double) values[0];
        int decimalPoints = (int) values[1];

        System.out.printf("Gerundete Zahl: %s", roundToNext(number));
        System.out.printf("\nAuf %s Nachkommastellen gerundete Zahl: %s", decimalPoints, roundDouble(number,
                decimalPoints));
    }

    public static double roundToNext(double value) {
        int integerValue = (int) value;
        double up = value - integerValue;
        double down = 1.0 - up;

        return (up < down) ? integerValue : integerValue + 1;
    }

    public static double roundDouble(double value, double decimalPlaces) {
        double factor = 1;
        for (int i = 0; i < decimalPlaces; i++) {
            factor *= 10;
        }

        int temp = (int) (value * factor + 0.5);
        return temp / factor;
    }

    public static Object[] getUserInput() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Gebe eine Kommazahl ein:");
            double number = scanner.nextDouble();
            System.out.println("Gebe die Anzahl der Nachkommastellen auf die gerundet werden soll an.");
            int decimalPoints = scanner.nextInt();

            // Verwenden Sie Object[], um sowohl double als auch int zurückzugeben
            Object[] returnValues = new Object[]{number, decimalPoints};
            return returnValues;
        } catch (Exception exception) {
            throw new IllegalArgumentException("Ungültige Eingabe!");
        }
    }
}
