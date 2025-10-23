import java.util.Arrays;

public class ArrayToStream{
    public static void main(String[] args) {
        int[]arr={12,14,15,17};
        Integer[]array={12,16,19,20};
               int sumOfArrayElements= Arrays.stream(arr)
                .filter(n->n%2==0)  //12,14 
                .sum();
        System.out.println("Sum of an Array elements are : "+sumOfArrayElements);
    }
}