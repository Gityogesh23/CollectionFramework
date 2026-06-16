//kjava Print All Non-Repeatitive Characters
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

class AllNonRepeatitiveChars{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String :"); //racecar
        String str=sc.nextLine();
        
        Map<Character,Integer>map=new HashMap<>();
        
        //to count frequency of characters.
        // If "character" is in the map, add 1 to its current count. 
        // If it's not in the map, start the count at 0, then add 1.
        for(char ch : str.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        
        //print the all non-repeatitive charcters
        for(char ch : str.toCharArray()){
            if(map.get(ch)==1){
                System.out.print(ch + " ");
            }
        }
    
    }
}
/*
Map is an interface in java.util package--> where Keys should be unique, but values can be duplicated.
It provides efficient retrieval, insertion, and deletion operations based on keys.
HashMap and LinkedHashMap allow one null key, and TreeMap does NOT allow null keys (if natural ordering is used).
Use ConcurrentHashMap for thread-safe operations, or Collections.synchronizedMap() to make an existing map synchronized.
public interface Map<K, V>

It is part of the Java Collections Framework, and its key implementation classes 
include HashMap, LinkedHashMap, TreeMap, and Hashtable.

Implemented Classes of Map Interface

HashMap: Stores key-value pairs using hashing for fast access, insertion, and deletion.
LinkedHashMap: Similar to HashMap but maintains the insertion order of key-value pairs.
TreeMap: Stores key-value pairs in sorted order using natural ordering or a custom comparator.
Hashtable: A synchronized Map implementation that doesn’t allow null keys or values.
//////////////////////
*/