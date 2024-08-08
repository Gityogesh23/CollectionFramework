
//to print reverse ReverseArrayList

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

class MyArrayList{
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>(); //upcasting
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
     //plz read below notes before next lines
        Iterator i1=list.iterator();
        System.out.println("Existing array List is: ");
        while (i1.hasNext()) {
            System.out.print( " "+i1.next());// sout=>shortcut in intellij idea
            }
        /*
        Collections class's method:
       public static void reverse(List<?> list)
       Reverses the order of the elements in the specified list.
       This method runs in linear time.
         */
        System.out.println();//to move cursor on next line
       Iterator i2=list.iterator(); //b'z now we r doing our task to reverse araaylist and hence we use it
        // again b'z it returns Iterator object which provides methods hence first time to iterate original list
      //  and then now to reverse list of elements so that we can able to use hasNext(),next(),etc methods further
        // we can't able to use i1 here again as it has original arraylist  is present
        Collections.reverse(list);
        System.out.println("reverse list become :");
        while(i2.hasNext()){
            System.out.print(" "+i2.next());
       }
    }
}

   /*
        Collection Interface and Iterator
Collection Interface:

The Collection interface is a root interface in the Java Collections Framework. It defines the common operations for all collections, such as adding, removing, and checking for elements.
The iterator() method is part of this interface. It returns an Iterator for the collection, which allows you to traverse the elements.
Iterator Interface:

The Iterator interface provides methods to iterate over elements in a collection. It includes methods such as hasNext(), next(), and remove().
The Iterator itself does not have an iterator() method; it is used to traverse the collection that provides the iterator.
How list.iterator() Works
Collection Implementation:

Classes like ArrayList, HashSet, and LinkedList implement the Collection interface.
These classes provide an implementation of the iterator() method that returns an instance of Iterator.
Usage:

When you call list.iterator(), you're invoking the iterator() method on an object of a class that implements Collection.
This method returns an Iterator object that can be used to iterate over the elements of the list.

Understanding the Flow
Create the Collection:

You create an ArrayList instance, which is a concrete implementation of the List interface.
Obtain the Iterator:

Calling list.iterator() invokes the iterator() method defined in the Collection interface, which is implemented by ArrayList. This method returns an Iterator object specific to the ArrayList.
Use the Iterator:

The returned Iterator object provides methods to traverse the ArrayList, such as hasNext() and next().
Summary
The iterator() Method: Defined in the Collection interface and implemented by classes like ArrayList. It returns an Iterator object for the collection.
The Iterator Interface: Provides methods to traverse the elements of a collection but does not have its own iterator() method.
So, when you use list.iterator(), you are calling the iterator() method of the Collection interface implemented by ArrayList, which returns an Iterator to traverse the elements of the ArrayList.

 */