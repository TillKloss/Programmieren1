package Lektion5.ÜB4;

public class Main {
    public static double customSqrt(double number, double epsilon) {
        if (number < 0) {
            throw new IllegalArgumentException("Die Quadratwurzel von negativen Zahlen ist undefiniert.");
        }

        double guess = number / 2.0;
        double previousGuess = 0.0;
        double abs = guess;
        while (previousGuess != guess && abs > epsilon) {
            previousGuess = guess;
            guess = 0.5 * ( guess + number / guess);
            if (previousGuess - guess < 0) {
                abs = -(previousGuess - guess);
            }else{
                abs = previousGuess - guess;
            }
        }
        return guess;
    }

    public static void main(String[] args) {
        double number = 144;
        double epsilon = 1e-6;

        double squareRoot = customSqrt(number, epsilon);
        System.out.printf("Die Quadratwurzel von %s ist etwa %s.", number, squareRoot);
    }
}
