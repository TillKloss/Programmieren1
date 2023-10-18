package Lektion3.ÜB8;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Character[] userInput = getUserInput();
        char characterOne = userInput[0];
        char characterTwo = userInput[1];

        if (characterOne == 'f' && characterTwo == 'f') {
            System.out.printf("Deine Eingabe: %s/%s\nAusgabewert: %s",
                    characterOne, characterTwo, 0);
            return;
        } else if (characterOne == 'f' && characterTwo == 't') {
            System.out.printf("Deine Eingabe: %s/%s\nAusgabewert: %s",
                    characterOne, characterTwo, 1);
            return;
        } else if (characterOne == 't' && characterTwo == 'f') {
            System.out.printf("Deine Eingabe: %s/%s\nAusgabewert: %s",
                    characterOne, characterTwo, 2);
            return;

        } else if (characterOne == 't' && characterTwo == 't') {
            System.out.printf("Deine Eingabe: %s/%s\nAusgabewert: %s",
                    characterOne, characterTwo, 3);
            return;
        }
        else {
            String msg = String.format("\nDeine Eingabe: %s/%s\nDeine Eingabe ist ungültig und besitzt " +
                            "kein Ausgabewert.\n",
                            characterOne, characterTwo);
            throw new RuntimeException(msg);
        }
    }

    public static Character[] getUserInput() {
        Character[] character = new Character[2];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Erste Eingabe: (t/f)");
        String firstInput = scanner.nextLine();
        System.out.println("Zweite Eingabe: (t/f)");
        String secondInput = scanner.nextLine();

        character[0] = firstInput.charAt(0);
        character[1] = secondInput.charAt(0);

        return character;
    }

}
