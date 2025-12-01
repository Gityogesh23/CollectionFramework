

//check even and odd from list and print duplicates

import java.util.List;
import java.util.Arrays;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Even_Odd_Dup
{
	public static void main(String[] args) {
	    List<Integer>l=Arrays.asList(12,13,14,15,12,15,18,20);
    
                       System.out.println("Even numbers:");
	                   l.stream().filter(n->n%2==0)
	                   .forEach(System.out::println);
	                   
	                   System.out.println("Odd numbers");
	                   l.stream().filter(n->n%2!=0)
	                   .forEach(System.out::println);
	                   
	                   System.out.println("Duplicates-->");
	                   Set<Integer>seen=new HashSet<>();
	                   l.stream().filter(n->! seen.add(n))  //If element already exist returns false
	                   .forEach(System.out::println);
	}
}