package Lektion5.ÜB1;

public class Main {
    public static void main(String[] args) {
        int i = 1;
        double calc;
        do {
            calc = 6 * ((double) 1 /(i*i));
            System.out.println(calc);
            i++;
        } while (calc >= 1e-5);
    }
}
