package Lektion3.ÜB7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder tempString = new StringBuilder();
        int[] numbers = new int[3];

        for (int i=0; i<3; i++) {
            System.out.println("Ganze Zahl eingeben:");
            numbers[i] = Integer.parseInt(scanner.nextLine());

            if (1 <= numbers[i] && 9>= numbers[i]) {
                tempString.append("0");
            }
            tempString.append(numbers[i]);

            if (i < 2)
                tempString.append(":");
        }
        String result = tempString.toString();
        System.out.printf("Uhrzeit: %s", result);
    }
}
