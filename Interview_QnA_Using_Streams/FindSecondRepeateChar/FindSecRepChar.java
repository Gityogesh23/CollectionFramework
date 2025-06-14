
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindSecRepChar {
    public static void main(String[] args) {
        String l="mayank";

        List<Character>secDup= l.chars().mapToObj(q->(char)q)
                            .collect(Collectors.groupingBy(w->w,LinkedHashMap :: new, Collectors.counting()))
                            .entrySet().stream()
                            .filter(e->e.getValue()>1)
                            .map(r->r.getKey())
                            .collect(Collectors.toList());
            Optional<Character>second=secDup.stream().skip(1).findFirst();
            
            if(second.isPresent()){
                System.out.println(second.get());

            }else{
                System.out.println("Value is not present");
            }
    }
}
