import java.util.stream.IntStream;

public class StringPalindromeCheck {
    public static void main(String[] args){
        String string="racecar";
        boolean isPalindrome=IntStream.range(0, string.length()/2)
                .allMatch(i->string.charAt(i)==string.charAt((string.length()-i-1)));
        System.out.println((isPalindrome) ? "String Is Palindrome" : "String Not Palindrome");
    }
}
 /*
 1)Use IntStream.range()---> index-based iteration.
2)allMatch()---> ensures all comparisons comparisons
3)try-->IntStream.rangeClosed(1, 10)
 */