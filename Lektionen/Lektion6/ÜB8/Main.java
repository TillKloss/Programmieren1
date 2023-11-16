package Lektion6.ÜB8;

import java.util.Scanner;

public class Main {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            while (true) {

                System.out.println("""
                        
                        Wählen Sie eine Option:
                        1: Fibonacci-Zahl berechnen
                        2: Fibonacci-Reihe erstellen
                        0: Abbruch""");
                int choice = scanner.nextInt();

                if (choice == 0) {
                    System.out.println("Abbruch");
                    break;
                } else if (choice == 1) {
                    System.out.println("Geben Sie die Position in der Fibonacci-Folge ein: ");
                    int n = scanner.nextInt();
                    int result = fibonacci(n);
                    System.out.printf("Die Fibonacci-Zahl an der Position %s ist: %s\n", n, result);

                } else if (choice == 2) {
                    for (int i = 0; i <= 25; i++) {
                        int result = fibonacci(i);
                        System.out.print(result + " ");
                    }
                } else {
                    System.out.println("Fehlerhafte Eingabe. Bitte wählen Sie erneut.");
                }
            }


        } catch (Exception e) {
            System.out.println("Fehlerhafte Eingabe");
        }
    }
}
