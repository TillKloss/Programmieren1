package Lektion5.ÜB1;

public class Main {
    public static void main(String[] args) {
        int k = 1;
        double calc = 0;
        double prevoiousCalc = 0;
        do {
            prevoiousCalc = calc;
            calc += 6 * ((double) 1 /(k*k));
            System.out.println(calc);
            k++;
            System.out.println(k);
        } while (Math.abs(calc - prevoiousCalc) >= 1e-5);
        System.out.println(calc);
    }
}
