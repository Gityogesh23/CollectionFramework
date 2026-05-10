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
