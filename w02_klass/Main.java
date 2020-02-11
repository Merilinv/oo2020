import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

//import sun.util.calendar.LocalGregorianCalendar.Date;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        PersonalCode merilinCode = new PersonalCode();
        merilinCode.setCode("49809230254");
        System.out.println(merilinCode.getCode());
        System.out.println(merilinCode.gender());

        System.out.println(merilinCode);

        Date date = new Date();

        System.out.println(date.toString());
    }
}