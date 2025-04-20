//Same as Demo_2 but for better readability crating this new Demo_3
 @FunctionalInterface
 interface StringOperation{
    String operate(String s);
 }
//No need for implements keyword=>beauty of lambda Expression.Read it in last.
 public class LambdaDemo_3 {
public static void main(String[]args){
   //Use Lambda Expression to reversing a string
   //here only lambdaExp is created not object creation,its happened only when 
   //operate method called and read below.==>On line No.11
    StringOperation reverse= (s)->new StringBuilder(s).reverse().toString();
    String result=reverse.operate("World");
    System.out.println("Reversed String Become : "+result);
        }
    }
 