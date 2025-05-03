import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;



import java.util.Set;
//Note =>as all standard Wrapper claases are implements Comparable<T>interface so methods od intr=erface are easily call on thme as they are trated as objects in java eg. Integer.compare()
//Interface Comparator<T> =>java.util=>int	compare(T o1, T o2)=>Returns a negative integer, zero, or a positive integer as the first argument is less than, equal to, or greater than the second.

//Comparable=>Interface Comparable<T>=>java.lang=>so its methods are direcltly can be used in any java program correct without import
//int	compareTo(T o):Returns a negative integer, zero, or a positive integer as this object is less than, equal to, or greater than the specified object.	
//Compares this object with the specified object for order.

class Person{
  String name;
  int age;

  Person(String name,int age){
    this.name=name;
    this.age=age;
  }

  @Override
  public String toString(){
    return "person { "+name+", (" +age+ ")"+ "}";
  }
}
    class AgeComparator implements Comparator<Person>{
       @Override
    public int compare(Person p1,Person p2){
        if(p1.age==p2.age){
            return p1.name.compareTo(p2.name);
        }
        return Integer.compare(p1.age,p2.age);
        }
    }

public class TreeSetDemo {
    public static void main(String[] args) {
        // TreeSet with custom comparator
        TreeSet<Person> personSet = new TreeSet<>(new AgeComparator());
        // Adding elements
        personSet.add(new Person("Alice", 30));
        personSet.add(new Person("Bob", 25));
        personSet.add(new Person("Charlie", 30));  // Same age as Alice
        personSet.add(new Person("David", 22));

        // Iterating using Iterator
        Iterator<Person> iterator = personSet.iterator();
        System.out.println("People sorted by age:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}


/*
 public interface Comparable<T> {
    int compareTo(T o);
}
It's used to define the natural ordering of objects. When you insert elements
 into a TreeSet (or TreeMap), Java uses compareTo() (or compare() from Comparator)
 to:
Decide order
Decide uniqueness (duplicate elements are not allowed in TreeSet)

 Step-by-Step Internal Flow:
First element is added — no comparison needed.
Next element is compared using compareTo():
newElement.compareTo(existingElement) is called.

Based on the return value:
0: Treat as duplicate, not inserted.
< 0: Inserted to the left of current node.
> 0: Inserted to the right of current node.

This continues like a Binary Search Tree, ensuring elements are sorted.
Behind the scenes, TreeSet uses a TreeMap with values as keys, so insertion 
relies on:

compareTo(key1, key2)

| Feature  | `compareTo()` (Comparable)                      | `compare()` (Comparator) |
| -------- | ----------------------------------------------- | ------------------------ |
| Location | In the class itself                             | Separate class or lambda |
| Purpose  | Natural order                                   | Custom order             |
| Used by  | `TreeSet`, `TreeMap`, `Collections.sort()` etc. | Same                     |

TreeSet<Student> students = new TreeSet<>();
students.add(new Student(101, "Alice"));
students.add(new Student(99, "Bob"));
students.add(new Student(101, "Charlie")); // Duplicate ID

compareTo() returns:
99 < 101 → go left
101 == 101 → duplicate → not inserted
 */