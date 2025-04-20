
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


@FunctionalInterface
interface MyFunctionalInterface {
    void sayHello();
  }

public class LambdaDemo4 {
    public static void main(String[] args) {

        // 1. Using lambda to implement functional interface
        MyFunctionalInterface greeting = () -> System.out.println("Hello from Lambda!");
        greeting.sayHello();

        // 2. Sorting a list using lambda
        List<String> names = Arrays.asList("Yogesh", "Amit", "Nikhil", "Ravi");
        System.out.println("Before sorting: " + names);

        Collections.sort(names, (a, b) -> a.compareTo(b));
        System.out.println("After sorting: " + names);

        // 3. Creating a thread using lambda
        Thread t = new Thread(() -> {
            System.out.println("Thread running using Lambda!");
        });
        t.start();
    }
}
