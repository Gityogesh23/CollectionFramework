import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UsingMapToUpperCase {
    public static void main(String[] args) {
        List<String>l=new ArrayList<String>();
        l.add("Da-Vinci");
        l.add("Holmes");
        l.add("linus");
        l.add("Yogesh");
    List<String>list=l.stream().map(p->p.toUpperCase()).collect(Collectors.toList());
    System.out.println("list of strings using map to UpperCase " +list);
    } 
}
