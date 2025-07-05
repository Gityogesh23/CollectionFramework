import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class printLengthofString {
    public static void main(String[] args) {
        List<String>words=Arrays.asList("Alice","Bob","Jobs","Bezos");
        List<Integer>len=words.stream().map(p->p.length()).collect(Collectors.toList());
        System.out.println("Length of words :"+len);
    }
}
