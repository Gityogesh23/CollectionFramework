import java.util.Arrays;
import java.util.List;

public class ListDemo {
   public static void main(String args[])
   {
       //creating a sample array
       String sample_array[]
           = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
       
       int length_array = sample_array.length;
       System.out.println("The input elements are as follows : ");
       for(int i = 0; i < length_array; i ++)
       {
           System.out.print(sample_array[i] + " ");
       }
       System.out.println();// setting the print cursor to the next line
   
       List<String>converted_list = Arrays.asList(sample_array);// converting the array to a list
       
       // print converted elements
       System.out.println("The converted list is as follows : "
                          + converted_list);
    }
  }
