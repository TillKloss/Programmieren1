package Lektion5.ÜB5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Anzahl der Rechtecke");
        int n = scanner.nextInt();

        double piApproximation = calculatePi(n);
        System.out.println("Approximation von π: " + piApproximation);
    }

    public static double calculatePi(int n) {
        double sum = 0.0;
        double width = 1.0 / n;
        for (int i = 0; i < n; i++) {
            double x = (i + 0.5) * width; // x-Koordinate des Mittelpunkts des Rechtecks
            double height = 4.0 / (1.0 + x * x); // Höhe des Rechtecks
            sum += height;
            System.out.printf("x: %s; height: %s; sum: %s; return: %s\n",x,height,sum, sum * width);
        }
        return sum * width;
    }
}
