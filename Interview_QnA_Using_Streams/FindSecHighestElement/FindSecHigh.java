import java.util.List;
import java.util.Arrays;
import java.util.Comparator;
public class FindSecHigh{
  public static void main(String[] args){
    List<Integer>list=Arrays.asList(55,66,77,88,1000,1001);
    int SecHighestElement=list.stream()
    .sorted(Comparator.reverseOrder())
    .skip(1)
    .findFirst()
    .get();
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