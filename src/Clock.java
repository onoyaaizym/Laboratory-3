import java.util.Scanner;

public class Clock {

    // Instance variables to store hours, minutes, and seconds
    int hours;
    int minutes;
    int seconds;

    // Constructor that will initialize the time
    public Clock(int hours, int minutes, int seconds) {
        this.hours = (hours % 24 + 24) % 24; // Get hours between 0 and 23
        this.minutes = (minutes % 60 + 60) % 60; // Get minutes between 0 and 59
        this.seconds = (seconds % 60 + 60) % 60; // Get seconds between 0 and 59
        normalizeTime();
    }

    // Normalize the time so that seconds and minutes are within their limits
    private void normalizeTime() {
        if (seconds >= 60) {
            minutes += seconds / 60;
            seconds %= 60;
        } else if (seconds < 0) {
            minutes += (seconds / 60) - 1;
            seconds = 60 + (seconds % 60);
        }

        if (minutes >= 60) {
            hours += minutes / 60;
            minutes %= 60;
        } else if (minutes < 0) {
            hours += (minutes / 60) - 1;
            minutes = 60 + (minutes % 60);
        }

        hours %= 24;
    }

    // Main method that demonstrate the usage of the class Clock and conversions
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueConversion = true;

        while (continueConversion) {
            System.out.println("1) Seconds to Minutes");
            System.out.println("2) Seconds to Hours");
            System.out.println("3) Minutes to Seconds");
            System.out.println("4) Minutes to Hours");
            System.out.println("5) Hours to Seconds");
            System.out.println("6) Hours to Minutes");
            System.out.println("Choose the conversion: ");
            int choice = scanner.nextInt();
        }
    }
}