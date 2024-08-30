import java.util.Scanner;
import java.util.Collection;
import java.util.List;
import java.util.ArrayList;

class UsingArrayList{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        List<Integer>list=new ArrayList<>();//upcasting and more generic code
        System.out.println("enter the size of an list");
        int n=sc.nextInt();//giving an  size of an arryList
        
        
      
        try{
            if(n>=0){
                System.out.println("enter the Elements: ") ;
                for(int i=0;i<n;i++){
                    int num=sc.nextInt();
                    list.add(num); 
            }
                 // else{
                //     System.out.println("plz enter valid number");
                // }
                 //Autoboxing internally done by JVM as ArrayList<>collection only works with objects=>
                          //so=>Integer.valueOf(num)=>will converts primtive to non-primitive type
                //similarly if its String num=>then num.parseInt()=> static Integer valueOf(int) it returns value of an int as a Integer.
                System.out.println("Array list become: ");
                for(int ele:list){
                    System.out.print(" "+ele);
                }
            }
        
      
    }catch(NumberFormatException e){
        System.out.println("plz enter valid number:");
    }
    }
}

/*
 1. Conversion from int to Integer: Autoboxing
Autoboxing is the automatic conversion of a primitive type (e.g., int) into its
 corresponding wrapper class (e.g., Integer). This feature was introduced in Java 5, 
 and it simplifies the process of working with collections that require objects.

How Autoboxing Works:
When you assign a primitive int to an Integer object or add an int to a 
collection like ArrayList<Integer>, the Java compiler automatically converts 
the int to an Integer object.

Example:
java
Copy code
int primitiveInt = 5;

// Autoboxing: primitive int to Integer
Integer integerObject = primitiveInt;

// Adding int to ArrayList<Integer>, autoboxing happens
List<Integer> numbers = new ArrayList<>();
numbers.add(primitiveInt);  // primitive int is autoboxed to Integer
Internal Process:
The Java compiler converts the primitive int into an Integer object 
using the Integer.valueOf(int i) method.
This method first checks if the value is within a cached range (typically -128 to 127).
 If it is, the cached Integer object is returned to save memory. If not, a 
 new Integer object is created.
java
Copy code
Integer integerObject = Integer.valueOf(primitiveInt);
2. Conversion from Integer to int: Unboxing
Unboxing is the reverse process of autoboxing, where an Integer object is 
automatically converted back to a primitive int.

Example:
java
Copy code
Integer integerObject = 10;

// Unboxing: Integer to primitive int
int primitiveInt = integerObject;
Internal Process:
The Java compiler converts the Integer object to a primitive int using
 the intValue() method of the Integer class.
java
Copy code
int primitiveInt = integerObject.intValue();
3. Conversion from String to int: Parsing
When you want to convert a String containing a numeric value into a 
primitive int, you use the Integer.parseInt(String s) method.

Example:
java
Copy code
String numberString = "123";
int primitiveInt = Integer.parseInt(numberString);
Internal Process:
The Integer.parseInt(String s) method parses the string character by
 character to verify that it represents a valid integer.
If the string is valid, it converts the string to an int using 
arithmetic operations.
Simplified Process:
The method checks if the string is null or empty, throwing a NumberFormatException
 if it is.
It then processes each character of the string to convert it to a numeric value,
 considering the sign if necessary.
The result is returned as a primitive int.
java
Copy code
public static int parseInt(String s) throws NumberFormatException {
    // Simplified logic
    int result = 0;
    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        if (c < '0' || c > '9') {
            throw new NumberFormatException("Invalid number");
        }
        result = result * 10 + (c - '0');
    }
    return result;
}
Summary:
Autoboxing: Converts a primitive int to an Integer object using Integer.valueOf().
Unboxing: Converts an Integer object back to a primitive int using intValue().
Parsing: Converts a String to a primitive int using Integer.parseInt(),
 where the string is validated and parsed character by character.
These internal mechanisms make it easier to work with both primitive
 types and their corresponding wrapper classes in Java.


 */