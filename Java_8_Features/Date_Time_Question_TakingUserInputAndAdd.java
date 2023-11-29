package Java_8_Features;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Date_Time_Question_TakingUserInputAndAdd {
    public static void main(String args[]) throws ParseException {
//        System.out.println("Enter Hour");
//        Scanner sc = new Scanner(System.in);
//        int hour = sc.nextInt();
//        System.out.println("Enter Minutes");
//        int minutes = sc.nextInt();
//        System.out.println("Enter Seconds");
//        int second = sc.nextInt();
//        System.out.println("Enter Seconds");
//        int nano = sc.nextInt();
//
//        LocalTime t = LocalTime.of(hour,minutes,second,nano);
//        LocalTime t2 = t.plusHours(5);
//        LocalTime t3 = t.plusMinutes(32);
//        LocalTime t4 = t.plusSeconds(35);
//        System.out.println(t.toString());
//        System.out.println("Updated Hour "+t2);
//        System.out.println("Updated Minutes "+t3);
//        System.out.println("Updated Secondes "+t4);


        // The same thing can be done with Date

        LocalDateTime dt = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("d$M$y : h:m:s");
        String myDate = dt.format(df);
        System.out.println(dt);
        System.out.println(myDate);

//        System.out.println(")

        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
//        LocalTime dt2 = LocalTime.parse(date);
        String date2 = "7-Jun-2009";
        Date dt2 = formatter.parse(date2);
        System.out.println(dt2);

    }
}
