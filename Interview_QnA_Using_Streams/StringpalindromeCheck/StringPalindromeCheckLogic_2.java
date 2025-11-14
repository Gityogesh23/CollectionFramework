import java.util.stream.IntStream;



public class StringPalindromeCheckLogic_2 {
 public static boolean isPalindrome(String str) {
     // Convert the string to lowercase to handle case-insensitivity

        String cleanStr = str.toLowerCase();
        int length = cleanStr.length();
        // Use IntStream to iterate from index 0 to half the length of the string

        return IntStream.range(0, length / 2)

      // noneMatch returns true if no elements match the given predicate

     // Here, we check if any character at index 'i' does not match

    // the character at the symmetric position (length - 1 - i)

       .noneMatch(i -> cleanStr.charAt(i) != cleanStr.charAt(length - 1 - i));

    }

    public static void main(String[] args) {
        System.out.println("racecar is a palindrome: " + isPalindrome("racecar"));      // true
        
        System.out.println("Racecar is a palindrome: " + isPalindrome("Racecar"));      // true

        System.out.println("hello is a palindrome: " + isPalindrome("hello"));          // false

        System.out.println("madam is a palindrome: " + isPalindrome("madam"));          // true

        System.out.println("A man a plan a canal Panama is a palindrome: " + isPalindrome("A man a plan a canal Panama")); // true (after cleaning)

    }

}