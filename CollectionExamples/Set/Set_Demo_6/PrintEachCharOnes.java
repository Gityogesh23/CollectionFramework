//Print each character only ones from String.-->abccdde //expected o/p: abe
//prefer to go with Set Interface.
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class PrintEachCharOnes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String str=sc.nextLine();

        Set<Character>set=new HashSet<>();
        for(char ch : str.toCharArray()){
            set.add(ch);
        }
        System.err.print(set+"");
    }
}
