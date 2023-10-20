package Lektion3.ÜB7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            StringBuilder tempString = new StringBuilder();
            int[] numbers = new int[3];

            for (int i = 0; i < 3; i++) {
                System.out.println("Ganze Zahl eingeben:");
                numbers[i] = scanner.nextInt();

                if (1 <= numbers[i] && 9 >= numbers[i]) {
                    tempString.append("0");
                }
                tempString.append(numbers[i]);

                if (i < 2)
                    tempString.append(":");
            }
            String result = tempString.toString();
            System.out.printf("Uhrzeit: %s", result);
        } catch (Exception exception) {
            System.out.println("Überprüfen Sie Ihre Eingabe.");
        }
    }
}
