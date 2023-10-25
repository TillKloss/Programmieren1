package Lektion4.ÜB4;

public class Main {
    public static void main(String[] args) {
        System.out.println("Fahrenheit\tCelsius");
        for (int i = 0; i < 301; i++) {
            System.out.printf("\n%s\t%.2f", i, i-32 * ((float) 5/9));
        }
    }
}
