package Lektion2.ÜB2;

public class Main {
    public static void main(String[] args) {
        double p = .0;
        double q = .0;
        pqFormula(p, q);
    }
    public static void pqFormula(double p, double q) {
        double first = -(p/2);
        double discriminant = Math.pow(p/2, 2) - q;
        double x1 = first + Math.sqrt(discriminant);  //immer berechnen oder erst wenn erfordert?
        double x2 = first - Math.sqrt(discriminant);
        if (discriminant > 0)
            System.out.printf("x1: %s\nx2: %s", x1, x2);
        else if (discriminant == 0)
            System.out.printf("x1: %s", x1);
        else
            System.out.println("Keine reale Lösung.");
    }
}
