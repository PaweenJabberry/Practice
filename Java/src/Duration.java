/*
* Duration
* Rahul is a very busy persion he dont wan't to waste his time . He keeps account of duration of each and every work.
* Now he don't even get time to calculate duration of works, So your job is to count the durations for each work and give it to rahul.
*
* Input:
*   - First line will be given by N number of works
*   - Next N line will be given SH,SM,EH and EM  each separated by space(SH=starting hr, SM=starting min, EH=ending hr, EM=ending min)
*
* Output:
*   - N lines with duration HH MM(hours and minutes separated by space)
*
* SAMPLE INPUT                      SAMPLE OUTPUT
* 2                                 0 30
* 1 44 2 14                         5 41
* 2 42 8 23
*
* */

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Duration {

    public static void Duration() {
        Scanner s = new Scanner(System.in);
        int nJob = 0;
        String timeAsText;

        System.out.print("Number of Jobs : ");
        nJob = s.nextInt();
        s.nextLine();

        for (int i=0; i<nJob; i++) {
            timeAsText = s.nextLine();

            String time[] = timeAsText.split("\\s");

            LocalTime startTime = LocalTime.of(Integer.parseInt(time[0]),Integer.parseInt(time[1]));
            System.out.println("Job "+(i+1)+" :");
            System.out.println("Start Time : "+time[0]+" Hr "+time[1]+" Min");

            LocalTime endTime = LocalTime.of(Integer.parseInt(time[2]),Integer.parseInt(time[3]));
            System.out.println("End Time : "+time[2]+" Hr "+time[3]+" Min");

            long hours = startTime.until(endTime, ChronoUnit.HOURS);
            startTime = startTime.plusHours( hours );

            long min = startTime.until(endTime, ChronoUnit.MINUTES);

            System.out.println("Time Different : "+hours+" Hr "+min+" Min");
        }
    }

    public static void main(String args[]) {
        Duration();
    }
}
