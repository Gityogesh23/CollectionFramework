import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayToStream {
    public static void main(String[] args) {
        
    int[]array={12,13,11,1,9,8,7,5,4};
    Arrays.sort(array);
    IntStream streamArray =Arrays.stream(array);//converting array into stream..
   streamArray.forEach(s->System.out.println(s)); ;
    }
}
