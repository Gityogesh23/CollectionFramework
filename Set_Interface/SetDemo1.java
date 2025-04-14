import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
/*
 * Remember:Collections never works with the Primitive types of values.hence we always Use NP type of values=>which wraps respective primitive types inside it.
 * The Set interface does not allow duplicate elements and can contain at most one null value.
 * HashSet is an implementation of the Set interface. It does not maintain any order.
 * LinkedHashSet extends HashSet to maintain insertion order, while TreeSet is a NavigableSet 
 * that maintains elements in a sorted order.
 */

public class SetDemo {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
         // Creating object of Set of type int
        Set<Integer>hash_set=new HashSet<>();
        System.out.println("enter the number of elements which you want to add: ");
        int n=sc.nextInt();
        System.out.println("Enter " + n + " elements:");
        for(int i=0;i<n;i++){
            int ele=sc.nextInt();
            hash_set.add(ele);
        }
        System.out.println();
        System.out.print("The elements  inside hash_set are: ");
        for(int element:hash_set)
        System.out.print(" "+element);
    }
}
