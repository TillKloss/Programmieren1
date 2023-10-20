package Lektion3.ÜB6;
import java.util.Scanner;
//
public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Geben Sie eine Jahreszahl ein: ");
            int year = scanner.nextInt();

            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " ist ein Schaltjahr.");
            } else {
                System.out.println(year + " ist kein Schaltjahr.");
            }
        } catch (Exception exception) {
            System.out.println("Überprüfen Sie Ihre Eingabe.");
        }
    }
}
