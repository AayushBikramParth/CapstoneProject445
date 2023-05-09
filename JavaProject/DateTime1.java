import java.time.*;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.*;
public class DateTime1 {
    public static void main(String[] args) {
        LocalDate d = LocalDate.now();
        d = d.with(TemporalAdjusters.firstDayOfYear());
        System.out.println(d);
        for(int i=0; i<=12;i++){
            d = d.with(TemporalAdjusters.dayOfWeekInMonth(2, DayOfWeek.SATURDAY));
            System.out.println(d);

        }
        

        /*LocalDate d1 = LocalDate.parse("2024-02-29");
        d1 = d1.minusYears(1);
        System.out.println(d1);
        */



    }
}
