import java.util.List;
import java.util.Arrays;
import java.util.Comparator;
public class FindSecHigh{
  public static void main(String[] args){
    List<Integer>list=Arrays.asList(55,66,77,88,1000,1001,1000);
    int SecHighestElement=list.stream()
    .distinct()  //removes duplicate values e.g . one of the 1000
    .sorted(Comparator.reverseOrder()) //modern approach which internally calls Collections.reverseOrder()
    .skip(1)
    .findFirst()
    .orElse(null);
    // .get();
System.out.println("The Second Highest Element Become: "+SecHighestElement);
  
  }
}

/*
List<E> ->Ordered(sequence) Collection that allows you store duplicate elements (maintain their insertion order)
It's an interface which maintains the insertion order and extends Collection interface
and belongs to java.util package.

Collecton<E>--E->List<E>-implements--->ArraysList<E> and (LikedList<E>,Vector,Stack).

# Below  implementing classes of List interface :through them we able to create an object of List Interface:

ArrayList<E> : Resizable array that maintains insertion order allows duplicates and provides
fast random access.

LinkedList<E> : Implements Doubly Linked List can be used as List,Stack, or Queue.

Vector<E> : Synchronized resiazable array. slower than Arraylist but thread safe.

Stack<E> : extends vector follows LIFO principle for storing elements.

*/
/*
// Java Program to Demonstrate Working of reverseOrder()
// method of Collections class
// To Sort an Array in Descending Order

// Importing required utility classes
import java.util.*;

// Main class
// CollectionSorting
public class GFG {

    // Main driver method
    public static void main(String[] args)
    {

        // Creating an array to be sorted in descending
        // order
        Integer[] arr = { 30, 20, 40, 10 };

        // Collections.sort method is sorting the
        // elements of arr[] in descending order
        // later on Arrays.sort() is applied to sort array
        Arrays.sort(arr, Collections.reverseOrder());

        // Printing the sorted array on console
        System.out.println(
            "Array after the use of Collection.reverseOrder()"
            + " and Arrays.sort() :\n"
            + Arrays.toString(arr));
    }
}
*/