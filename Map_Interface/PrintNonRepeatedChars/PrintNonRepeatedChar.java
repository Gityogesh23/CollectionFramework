
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
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
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
