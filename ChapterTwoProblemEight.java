package chaptertwo;

import java.util.Scanner;

/**
 *
 * @author LIFONAR LIFA
 */
public class ChapterTwoProblemEight {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long totalMiliseconds = System.currentTimeMillis();
        long totalSeconds = totalMiliseconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;
        System.out.println("Enter the time zone offset to GMT: ");
        long gmt = sc.nextLong();
        long gmtHour;
        if (currentHour + gmt >= 0) {
            gmtHour = currentHour + gmt;
        } else {
            gmtHour = currentHour + gmt;
            gmtHour = Math.abs(gmtHour) + (Math.abs(gmt) * 2);
        }
        System.out.println("Current time is " + gmtHour + ":" + currentMinute + ":" + currentSecond);
    }
}
