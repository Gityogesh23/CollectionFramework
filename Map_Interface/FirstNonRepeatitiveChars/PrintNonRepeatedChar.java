
//TO print first non-repeatitive character from string .
//STAR: Situation,Task,Action,Result
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class PrintNonRepeatedChar {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String :");
        String str=sc.nextLine();
        str=str.toLowerCase();
        Map<Character,Integer>map=new HashMap<>();

        //Step 1: to find frequency of each character.
         for( char ch: str.toCharArray()){
            if(map.containsKey(ch)){ //to count frequency of chars below..
                map.put(ch,map.get(ch)+1);// v put(k Key ,v value); if character or key is present then set its count to 1
            }else{
                map.put(ch,1);//if above cond-fails like if its map doesn't contains the key then set its count value to 1.
            }
         }

        //  step 2:  to print first non-repeatitive character.
        for(char ch : str.toCharArray()){
            if(map.get(ch)==1){
                System.out.println("First non-repeatitive character is -->"+ch);
                break;
            }
        }
    }
}


/* 
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        String str = "programming";

        HashMap<Character, Integer> map = new HashMap<>();

        for(char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for(char ch : str.toCharArray()) {
            if(map.get(ch) == 1) {
                System.out.print(ch + " ");
            }
        }
    }
}

 
 

/*
A HashMap is a highly efficient data structure that stores data in key-value pairs.
 It uses a hashing algorithm to compute an index (a "bucket") where the value is 
 stored, allowing you to retrieve, insert, or delete data in constant time, 

"When put() is called, HashMap first computes the key's hashCode() and applies a bit-mixing function. 
It then calculates the bucket index using (capacity - 1) & hash. If the bucket is empty, it inserts a new node. 
If a collision occurs, it searches the existing entries using the hash and equals(). If the key already exists,
it updates the value; otherwise, it adds a new node. In Java 8+, if a bucket's linked list grows beyond 8 nodes 
and the table capacity is at least 64, the linked list is converted into a Red-Black Tree to improve lookup 
performance. When the number of entries exceeds the load factor threshold (75% of capacity by default), the 
table is resized and the entries are rehashed."

, on average
*/
