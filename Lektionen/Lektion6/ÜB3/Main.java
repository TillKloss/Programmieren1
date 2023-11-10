package Lektion6.ÜB3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Geben Sie die Anzahl der Zeilen für das Dreieck ein: ");
            int numberOfRows = scanner.nextInt();

            printStarTriangle(numberOfRows);
        } catch (Exception e) {
            System.out.println("Ein Fehler ist aufgetreten.");
        }
        scanner.close();
    }

    public static void printStarTriangle(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print("*");
                if (k < i * 2 - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
