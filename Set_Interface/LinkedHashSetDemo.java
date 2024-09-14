import java.util.Scanner;
import java.util.Iterator;
import java.util.Set;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Set<String>linkedhash_set=new LinkedHashSet<>();//perfectly type safe and more generic
        System.out.println("enter the number of elements which you want to add: ");
         int n=sc.nextInt();
         System.out.println("Enter " + n + " elements:");
         for(int i=0;i<n;i++){
             String ele=sc.nextLine();
             linkedhash_set.add(ele);
    }
    System.out.println();
    System.out.print("The elements  inside hash_set are: ");
    for(String element:linkedhash_set)
    System.out.print(" "+element);//follows insertion order B'z internally It uses Doubly LinkedList
  }
}