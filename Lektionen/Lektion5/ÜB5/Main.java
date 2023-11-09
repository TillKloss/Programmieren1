package Lektion5.ÜB5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Anzahl der Rechtecke");
        int n = scanner.nextInt();

        scanner.close();

        double piApproximation = calculatePi(n);
        System.out.println("Approximation von pi: " + piApproximation);
    }

    public static double calculatePi(int n) {
        double sum = 0.0;
        double width = 1.0 / n;
        for (int i = 0; i < n; i++) {
            double x = (i + 0.5) * width;
            double height = 4.0 / (1.0 + x * x);
            sum += height;
        }
        return sum * width;
    }
}
