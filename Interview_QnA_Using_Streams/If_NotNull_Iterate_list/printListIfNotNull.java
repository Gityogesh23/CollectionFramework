import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//How to check if list is empty using Optional in java8 using Streams.
public class printListIfNotNull {
    public static void main(String[] args) {
        List<String>words=Arrays.asList("apple","Berry","papaya","apple","guava");
        Optional.ofNullable(words)
        .filter(l->!l.isEmpty())
        .ifPresent(i->i.forEach(s->System.out.println(s)));
    }
}
