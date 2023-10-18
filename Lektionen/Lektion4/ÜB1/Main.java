package Lektion4.ÜB1;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 15; i >= 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }
    }
}
