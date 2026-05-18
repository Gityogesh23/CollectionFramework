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
        
        Map<Character, Long> frequencyMap = str.chars() 
        //chars() converts string into stream of ASCII/Unicode integer values.-->j  a  v  a  t  p  o  i  n  t,internally-->106 97 118 97 116 112 111 105 110 116
        //return type : IntStream  
        .mapToObj(c -> (char) c) //Now each integer converts back into character.
        // 106 -> 'j'
        // 97  -> 'a'
        // 118 -> 'v'
       // Now stream becomes: [j, a, v, a, t, p, o, i, n, t]-->return Type:Stream<Character>
       //


            .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
            //This part:Groups same characters ,counts occurrences

            
        frequencyMap.forEach((k, v) -> System.out.println(k + " : " + v));
    }
}

*/
/*
Understanding groupingBy
Syntax
groupingBy(
    classifier,
    downstreamCollector
)

Here:

c -> c

means:

group by character itself

Internal Working

Input stream:

[j, a, v, a, t, p, o, i, n, t]

Grouping happens like:

j -> [j]
a -> [a, a]
v -> [v]
t -> [t, t]
Collectors.counting()

Now counting elements in each group.

Result:

j -> 1
a -> 2
v -> 1
t -> 2
Final Map
Map<Character, Long>

Why Long?
Because counting() returns Long.

Final structure:

{
 j=1,
 a=2,
 v=1,
 t=2,
 p=1,
 o=1,
 i=1,
 n=1
}
Step 5
frequencyMap.forEach((k, v) -> 
    System.out.println(k + " : " + v));

Printing map values.

Here:

k = key (character)
v = value (count)
*/