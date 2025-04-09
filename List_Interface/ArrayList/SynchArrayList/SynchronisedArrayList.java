import java.util.Collections;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public class SynchronisedArrayList {

   public static void main (String[] args)
   {
       List<String> synchronized_list =
          Collections.synchronizedList(new ArrayList<String>());
 
       synchronized_list.add("learn");
       synchronized_list.add("practice");
       synchronized_list.add("solve");
       synchronized_list.add("interview");
       
       synchronized(synchronized_list)// must be declared
       {
          
           Iterator it = synchronized_list.iterator();
 
           while (it.hasNext())
               System.out.println(it.next());
       }
   }
}