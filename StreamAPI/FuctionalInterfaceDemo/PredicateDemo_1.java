
// Java program to illustrate Predicate Chaining
//public <T>static boolean Predicate<T>Test(T t)
import java.util.function.Predicate;
public class PredicateDemo_1 {
    public static void main(String[] args)
    {
        Predicate<Integer> greaterThanTen = (i) -> i > 10;//

        // Creating predicate
        Predicate<Integer> lowerThanTwenty = (i) -> i < 20; //lambda exp: number_of_args -> expression
        boolean result = greaterThanTen.and(lowerThanTwenty).test(15);
        System.out.println(result);

        // Calling Predicate method
        boolean result2 = greaterThanTen.and(lowerThanTwenty).negate().test(15);
        System.out.println(result2);
    }
}