package Lektion4.ÜB3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number = getUserInput();
        if (number == 1) {
            System.out.printf("Die von Ihnen eingegebene Zahl '%s', ist keine Primzahl.", number);
            return;
        }
        for (int i = 2; i < number-1; i++) {
            if (number % i != 0) {
            } else {
                System.out.printf("Die von Ihnen eingegebene Zahl '%s', ist keine Primzahl.", number);
                return;
            }
        }
        System.out.printf("Die von Ihnen eingegebene Zahl '%s', ist eine Primzahl.", number);
    }

    public static Integer getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Eingabe einer ganzen Zahl:");
        try {
            return scanner.nextInt();
        } catch (Exception exception) {
            throw new RuntimeException("\nUngültige Eingabe");
        }
    }

}
