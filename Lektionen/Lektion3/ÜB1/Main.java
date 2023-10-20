package Lektion3.ÜB1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ganze Zahl eingeben:");
            double userInput = scanner.nextDouble();
            double rest = userInput % 7;
            System.out.printf("Der Rest beträgt %s.", rest);
        } catch (Exception exception) {
            System.out.println("Überprüfen Sie Ihre Eingabe. Es sind nur ganze Zahlen erlaubt.");
        }
    }
}

/*/ Wenn man einen negativen Wert modulo nimmt, ist das Ergebnis immer negativ.
    Das Vorzeichen des ersten Wertes bestimmt das Vorzeichen des Ergebnis.
    -17 modulo 7 ergibt -3
     17 modulo 7 ergibt 3
     17 modulo -7 ergibt 3

     Wenn man eine Kommazahl modulo nimmt, behandelt Java den Wert wie eine ganze Zahl auch.
/*/
