package Lektion2.ÜB1;
public class Main {
    public static void main(String[] args) {
        double radius = 5.0;  // radius in cm
        double pi = 3.14;
        calculateCircleArea(radius, pi);
        calculateCircleVolume(radius, pi);
    }
    public static void calculateCircleArea(double radius, double pi) {
        double result = pi*(radius*radius);
        System.out.printf("Die Kreisfläche beträgt %s Quadratzentimeter.%n", result);
    }

    public static void calculateCircleVolume(double radius, double pi) {
        double result = ((double) 4 /3)*pi*(radius*radius*radius);
        System.out.printf("Das Volumen beträgt %s Kubikzentimeter.", result);
    }
}
