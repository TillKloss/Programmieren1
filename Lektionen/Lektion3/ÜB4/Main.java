package Lektion3.ÜB4;

public class Main {
    public static void main(String[] args) {
        int sides = 6;
        int roll = (int) (Math.random() * sides) + 1;
        switch (roll) {
            case 1:
                System.out.println("Eins Gewürfelt");
                break;
            case 2:
                System.out.println("Zwei Gewürfelt");
                break;
            case 3:
                System.out.println("Drei Gewürfelt");
                break;
            case 4:
                System.out.println("Vier Gewürfelt");
                break;
            case 5:
                System.out.println("Fünf Gewürfelt");
                break;
            case 6:
                System.out.println("Sechs Gewürfelt");
                break;
        }
    }
}