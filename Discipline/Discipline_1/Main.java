import java.util.Scanner;

// check odd and even-->

public class Main{
    public static String isOddOrEven(int n){
        if(n<0)return "give positive integer only";
        if (n < 0) {
            return "Please enter a positive integer only";
        }
    return (n%2==0)? "Even" : "Odd";
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the num==>" );
        try{
        int n=sc.nextInt();
       String result= isOddOrEven(n);
    System.out.println("The Number is: "+result);
        }catch(Exception e){
            System.out.println("input should be positive Integer only");
        }
    }
}