package Lektion3.ÜB5;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Matrikelnummer eingeben:");
        String userInput = scanner.nextLine();
        scanner.close();

        if (userInput.length() != 7) {
            System.out.println("Ungültige Matrikelnummer");
            return;
        }

        if (userInput.startsWith("50") || userInput.startsWith("51") || userInput.startsWith("61")) {
            System.out.println("Gültige Matrikelnummer!");
        } else {
            System.out.println("Ungültige Matrikelnummer!");
        }
    }
}
