import java.time.*;
import java.util.*;
import java.time.temporal.*;
public class DateAPI {
    public static void main(String[] args) {
        //LocalDate d = LocalDate.now();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Date you want to give");
        String date = sc.nextLine();

        /*System.out.println("Enter the Number of Years  for the same");
        String Years = sc.nextLine();

        System.out.println("Enter the Number of Months you want to Input");
        String Months = sc.nextLine();

        System.out.println("Enter the number of days here");
        String Days = sc.nextLine();
        */

        LocalDate d = LocalDate.parse(date);

        /*int y  = Integer.parseInt(Years);
        int m = Integer.parseInt(Months);
        int day = Integer.parseInt(Days);
        */

        d = d.with(TemporalAdjusters.firstDayOfNextYear());

        System.out.println(d.with(TemporalAdjusters.next(DayOfWeek.MONDAY)));




        
    }

}
