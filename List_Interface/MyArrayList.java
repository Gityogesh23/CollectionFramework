
import java.util.ArrayList;
import java.util.List;
public class MyArrayList {
    public static void main(String[] args) {
       // List<Integer>arr=new ArrayList<>();//Class ArrayList<E> //Upcasting
       //Or 
       ArrayList<Integer>arr=new ArrayList<>();
        System.out.println("Arraylist Become:" +arr); 
        arr.add(10);
        arr.add(12);
        arr.add(13);
        arr.add(14);
        arr.add(15);
        for(int ele:arr){
            System.out.println("Arraylist Become: "+ele);
        }
    }
}
