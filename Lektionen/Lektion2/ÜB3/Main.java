package Lektion2.ÜB3;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        int hour = now.getHour();
        int minute = now.getMinute();
        int second = now.getSecond();
        int secondsMidnight = hour * 3600 + minute * 60 + second;
        int secondsLeft = 86400 - secondsMidnight;
        double percentOfDay = ((double) secondsMidnight / 86400) * 100;
        System.out.printf("""
                Heute sind bereits %s Sekunden vergangen.
                Heute vergehen noch %s Sekunden.
                Der Tag ist zu %s %% vorbei.""", secondsMidnight, secondsLeft, percentOfDay);
    }
}
