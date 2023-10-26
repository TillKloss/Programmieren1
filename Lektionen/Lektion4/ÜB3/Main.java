package Lektion4.ÜB3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number = getUserInput();
        if (number <= 1) {
            System.out.printf("\nDie von Ihnen eingegebene Zahl '%s', ist keine Primzahl.", number);
            return;
        }
        boolean fTemp = true;
        System.out.print("1 ist keine Primzahl.");
        for (int i = 2; i < number - 1; i++) {
            boolean temp = true;
            for (int j = 2; j < i - 1; j++) {
                if (i % j != 0) {
                } else {
                    System.out.printf("\n%s ist keine Primzahl.", i);
                    temp = false;
                }
            }
            if (temp)
                System.out.printf("\n%s ist eine Primzahl.", i);

            if (i + 2 == number) {
                if (number % i != 0) {
                    System.out.printf("\n%s ist keine Primzahl.", i+1);
                } else {
                    System.out.printf("\n%s ist eine Primzahl.", i+1);
                }
            }
            if (number % i != 0) {
            } else {
                System.out.printf("\nDie von Ihnen eingegebene Zahl '%s', ist keine Primzahl.", number);
                fTemp = false;
            }
        }
        if (fTemp) {
            System.out.printf("\nDie von Ihnen eingegebene Zahl '%s', ist eine Primzahl.", number);
        }
    }

    public static Integer getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Eingabe einer ganzen Zahl:");
        try {
            return scanner.nextInt();
        } catch (Exception exception) {
            throw new RuntimeException("\nUngültige Eingabe"); //
        }
    }

}
