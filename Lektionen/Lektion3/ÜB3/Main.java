package Lektion3.ÜB3;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Geben Sie ein Einzelzeichen ein:");
            String userInput = scanner.nextLine();
            scanner.close();
            if (userInput.length() != 1) {
                System.out.println("Ungültige Eingabe!");
                return;
            }
            char character = userInput.charAt(0);
            String isCap = isCapitalLetter(character);
            String isHex = isHexDec(character);
            String isBin = isBinary(character);
            String isOct = isOctale(character);
            if (isCap.isEmpty() && isHex.isEmpty() && isOct.isEmpty() && isBin.isEmpty()) {
                System.out.println("Unbekannt!");
                return;
            }
            if (!(isCap.isEmpty()))
                System.out.println(isCap);
            if (!(isHex.isEmpty()))
                System.out.println(isHex);
            if (!(isBin.isEmpty()))
                System.out.println(isBin);
            if (!(isOct.isEmpty()))
                System.out.println(isOct);
        } catch (Exception exception) {
            System.out.println("Überprüfen Sie Ihre Eingabe.");
        }
    }

    public static String isOctale(char character) {
        boolean isOct = character >= '0' && character <= '7';
        if (isOct)
            return "oktale Ziffer";
        else
            return "";
    }

    public static String isBinary(char character) {
        if (character == '0' || character == '1')
            return "Binäre Ziffer";
        else
            return "";
    }

    public static String isHexDec(char character) {
        boolean isHex = character >= 'A' && character <= 'F' ||
                character >= 'a' && character <= 'f' ||
                character >= '0' && character <= '9';
        if (isHex)
            return "Hexadezimale Ziffer";
        else
            return "";
    }

    public static String isCapitalLetter(char character){
        boolean isUpper = Character.isUpperCase(character);
        if (isUpper)
            return "Großbuchstabe";
        else
            return "";
    }
}
