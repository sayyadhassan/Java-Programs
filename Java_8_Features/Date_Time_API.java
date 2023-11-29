package Java_8_Features;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Date_Time_API {
    public static void main(String []args){
        // Current Time in Milli Seconds
        LocalTime t = LocalTime.now();
//        int hour = t.getHour();
//        int minutes = t.getMinute();
//        int seconds = t.getSecond();
//        int mili = t.getNano();
//        System.out.println(mili);
//        System.out.println("Current Time is :"+t);
//        System.out.println("Current Hour is :"+hour);
//        System.out.println("Current Minutes is :"+minutes);
//        System.out.println("Current Seconds is :"+seconds);


        // Specific Time
//        LocalTime t2 = LocalTime.of(23,36,38,999);
//        System.out.println(t2);
//
//        // Get Set of Time Zones
//        for(String s : ZoneId.getAvailableZoneIds()){
//            System.out.println(s);
//        }
//
//        // Current Time according to time zone
//        LocalTime t3 = LocalTime.now(ZoneId.of("Egypt"));
//        System.out.println(t3);
//
//
//
//        // Current Date
        LocalDate d = LocalDate.now();
        int day = d.getDayOfMonth();
        int month = d.getMonthValue();  // Will print month in integer value
        Month month1 = d.getMonth();   // Will print moth in String value
        int year = d.getYear();
        System.out.println("Current Day is :"+day);
        System.out.println("Current Month is :"+month);
        System.out.println("Current Month is :"+month1);
        System.out.println("Current Year is :"+year);
        System.out.println("Current Date is :"+d);
//
//        // Specific Date
//        LocalDate d2 = LocalDate.of(2002,8,23);
//        System.out.println(d2);
//                        // OR
//        LocalDate d3 = LocalDate.of(2002, Month.AUGUST,23);
//        System.out.println(d3);
//
//
//        // Current Local Date and Time (Machine Specific)
//        Instant i = Instant.now();
//        System.out.println(i);
//
//        // Curren Local Date and Time (Human Specific or Readable)
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(d);


//
//        // Formate Date and Time using DateTimeFormatter
        DateTimeFormatter df = DateTimeFormatter.ofPattern("Y@M@d __E");  // We can't change the order of YY-MM-DD
        String myDate = dt.format(df);
        System.out.println("Format One "+myDate);
                           // OR
        DateTimeFormatter df2 = DateTimeFormatter.ofPattern("d$M$y : h:m:s");
        String myDate2 = dt.format(df2);
        System.out.println("Format 2 "+myDate2);

    }
}
