
//given a string,find first non -repeated character in it using Stream function?

import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

public class FirstNonrepeatedChars {
public static void main(String[] args) {
    String input="nayatn";
    List<Character>chr=input.chars().mapToObj(p->(char)p)
    .collect(Collectors.groupingBy(s->s,LinkedHashMap :: new,Collectors.counting()))
    .entrySet().stream()
    .filter(q->q.getValue()==1)
    .map(w->w.getKey())
    .collect(Collectors.toList());
System.out.println(chr.stream().findFirst().get());
}    
}
