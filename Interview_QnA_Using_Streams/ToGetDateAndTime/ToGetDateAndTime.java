import java.time.LocalDate;

//How you will get current date and Time using java 8 API
public class ToGetDateAndTime {
    public static void main(String[] args) {
        int LocalDate ld= LocalDate.now();
        int LocalTime lt=LocalTime.now();
        System.out.println("Todays Date is: " +ld);
        System.out.println("Now The Time is :" +lt);
    }
}
