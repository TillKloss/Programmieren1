package Lektion4.ÜB2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        double number = getUserInput();
        for (int i = 1; number >= i; i++) {
            System.out.printf("\nZeit: %s Sekunden: Zurückgelegte Strecke: %.6f m",
                    i, 0.5 * 9.80665 * i * i);
            Thread.sleep(1000);
        }
    }

    public static Integer getUserInput() throws InterruptedException {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Einabe einer beliebigen Ganzzahl:");
            return scanner.nextInt();
        } catch (Exception exception) {
            System.out.println("Ungültige Eingabe!");
            Thread.sleep(2000);
            getUserInput();
        }
        return 0;
    }

}
