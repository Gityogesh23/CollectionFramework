import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
public class CountFrequency {
   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the string: ");
    String str=sc.nextLine();

    Map<Character,Integer>map=new HashMap<>();

    //To count frequency of each character.

    for(char ch:str.toCharArray()){
        map.put(ch,map.getOrDefault(ch,0)+1);
    }
    System.out.println(map);

   } 
}
/*
O/p: 
Enter the string: 
Racecar
{a=2, R=1, r=1, c=2, e=1
*/


//To find duplicate chars
/*
Logic:
Input: "programming"
Output: r g m

for(char ch: map.keySet()){ //keySet() is HashMap class's method not set -->use same object as above .
    if(map.get(ch)>1){
        System.out.print(ch+ ""); 
    }
}
*/