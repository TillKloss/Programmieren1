package Lektion5.ÜB2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Bitte geben Sie die Basis an:");
            double b = scanner.nextDouble();
            System.out.println("Bitte geben Sie die Potenz an:");
            int n = scanner.nextInt();

            scanner.close();

            if (n == 0) {
                System.out.println(1);
            } else if (n > 0) {
                double calc = 1;
                for (int i = 1; i <= n; i++) {
                    calc *= b;
                }
                System.out.println(calc);
            } else {
                double calc = 1;
                for (int i = -1; i >= n; i--) {
                    calc *= 1 / b;
                }
                System.out.println(calc);
            }

        } catch (Exception exception) {
            throw new RuntimeException("Ungültige Eingabe!");
        }
    }
}
