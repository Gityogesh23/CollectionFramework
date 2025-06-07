
//To find even Numbers using streams
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumbersDemo {
    public static void main(String[]args){
        List<Integer>l=Arrays.asList(12,13,14,15,98,12,13,10,30,40,50,100,1000);
        List<Integer>evenList=l.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println("The even numbers are :"+evenList);
    }
}