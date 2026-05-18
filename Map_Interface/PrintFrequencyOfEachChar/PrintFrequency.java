import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/*
logic 1 with HashMap-->use getorDefault()
Logic 2 : With Streams-->
groupingBy(classifier): Groups elements into a Map based on a property

*/
public class PrintFrequency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str=sc.nextLine();
        Map<Character,Integer>map= new HashMap<>();

        for(char ch : str.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        System.out.println(map+" ");
    }
}
/*
import java.util.Map;
import java.util.stream.Collectors;

public class CharFrequency {
    public static void main(String[] args) {
        String str = "javatpoint";
        
        Map<Character, Long> frequencyMap = str.chars() //chars() converts string into stream of ASCII/Unicode integer values.
            .mapToObj(c -> (char) c)
            .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
            
        frequencyMap.forEach((k, v) -> System.out.println(k + " : " + v));
    }
}

*/