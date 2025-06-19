import java.time.LocalDate;
import java.time.LocalTime;

//How you will get current date and Time using java 8 API
public class ToGetDateAndTime {
    public static void main(String[] args) {
         LocalDate ld= LocalDate.now();
         LocalTime lt= LocalTime.now();
        System.out.println("Todays Date is: " +ld);
        System.out.println("Now The Time is :" +lt);
    }
}
