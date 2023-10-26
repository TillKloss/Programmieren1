package Lektion3.ÜB7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*try {
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
         */
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Stunde eingeben:");
            int stunden = scanner.nextInt();
            System.out.println("Minute eingeben:");
            int minuten = scanner.nextInt();
            System.out.println("Sekunde eingeben");
            int sekunden = scanner.nextInt();
            if (sekunden >= 60) {
                sekunden %= 60;
                minuten++;
            }
            if (minuten >= 60) {
                minuten %= 60;
                stunden++;
            }
            if (stunden == 24) {
                stunden = 0;
            } else if (stunden > 23) {
                System.out.println("Ungültige Eingabe.");
                return;
            }
            System.out.printf("%02d:%02d:%02d\n", stunden, minuten, sekunden);
        } catch (Exception exception) {
            System.out.println("Ungültige Eingabe.");
        }
    }
}