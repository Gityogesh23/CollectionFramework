import java.util.Arrays;

public class FindingSumOfNumbers {
public static void main(String[]args){
    int []numbers={1,0,1,1,1,1};
    int sum=Arrays.stream(numbers).sum();

    System.out.println("sum of 1's is --->" +sum);
}    
}
