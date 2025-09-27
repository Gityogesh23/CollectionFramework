import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
/*
To check string is panagram or not-->
# Key Conditions
1) Complete Alphabet: The string must include all 26 letters of the English alphabet (A-Z).
2) Case Insensitivity: The check should ignore case, meaning both 'a' and 'A' are considered the same letter.

3) Ignore Non-Letters: Punctuation, numbers, and spaces should be ignored when determining if the string is a pangram. 
*/
public class StringPanagram {
    public static boolean isPanagram(String str){
        if(str.isBlank()) return false;
       
        str=str.toLowerCase().replaceAll("[^A-Za-z0-9]","");
        Set<Character>set=new HashSet<>();
        for(char c: str.toCharArray()){
            if(c>='a' && c<='z'){
                set.add(c);
            }
        }
        return set.size()==26;//as per  panagram string must condition
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in); //creating scanner object
        System.out.println("Enter the string1");
        //String string1=sc.nextLine(); //accepting string_1-->"The Brown Fox jumps over the lazy dog.""
        String string1= "The Quick Brown Fox  jumps over the Lazy dog"; //true

        boolean result_of_string1=isPanagram(string1);
        System.out.println("String is Panagram"+"-->"+result_of_string1); 

        String string2="Hello World";  //false
        boolean result_of_string2=isPanagram(string2);
        System.out.println("String is Panagram" +"-->"+result_of_string2); 

    }
}
