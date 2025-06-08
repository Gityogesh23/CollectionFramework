import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumbersStartsWithOne {
    public static void main(String[] args) {
        List<Integer>l=Arrays.asList(12,13,14,12,22,44,55,108,110);
        List<Integer>Numbers1=l.stream().filter(n->n.toString().startsWith("1")).collect(Collectors.toList());
        System.out.println("The Numebrs starts with 1 are: "+Numbers1);

        List<Integer>numbers2=l.stream().filter(n->n.toString().endsWith("2")).collect(Collectors.toList());
        System.out.println("The Numebrs ends with 2 are: "+numbers2);

        List<Integer>numbers3=l.stream().filter(n->n.toString().contains("8")).collect(Collectors.toList());
        System.out.println("The Numebrs contains with 2 are: "+numbers3);
    }
}
/*
toString() is used when the list contains non-String elements, like Integer, and 
you want to apply String operations 
like startsWith, endsWith, contains, etc.

he startsWith() method in Java is designed for use with String objects, not integers. To 
check if an integer "starts with" a specific sequence of digits, it needs to be converted
 to a string first.
Here's how you can achieve this: Convert the integer to a String:
Use String.valueOf(yourInteger) or Integer.toString(yourInteger) to convert your integer 
into a string representation.
Use startsWith() on the String:
Now that you have a String, you can use the startsWith() method to check if it begins 
with a specific sequence of characters (which will represent the digits you're looking for).


Important Considerations:
The startsWith() method performs a case-sensitive comparison.
If you need to check for a numeric prefix without leading zeros, you'd have to handle the 
conversion of numbers to strings and leading zeros separately.
The startsWith() method requires a string as an argument. If you have an integer that you 
want to use as a prefix, you will also need to convert it to a string.
*/