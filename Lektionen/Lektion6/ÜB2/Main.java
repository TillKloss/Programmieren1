package Lektion6.ÜB2;

import java.util.Scanner;

public class Main {
    public static long berechneFakultaet(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Die Fakultät ist für negative Zahlen nicht definiert.");
        }
        if (n == 0 || n == 1) {
            return 1;
        } else {
            long fakultaet = 1;
            for (int i = 2; i <= n; i++) {
                fakultaet *= i;
            }
            return fakultaet;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Geben Sie eine Zahl ein: ");
            int num = scanner.nextInt();

            long result = berechneFakultaet(num);
            System.out.println("Die Fakultät von " + num + " ist: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Fehlerhafte Eingabe.");
        } catch (ArithmeticException e) {
            System.out.println("Fehler: Die Fakultät ist zu groß, um als ganze Zahl dargestellt zu werden.");
        } catch (Exception e) {
            System.out.println("Ein unerwarteter Fehler ist aufgetreten");
        }
        scanner.close();
    }
}
