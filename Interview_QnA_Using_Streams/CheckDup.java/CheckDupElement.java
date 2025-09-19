import java.util.Arrays;

public class CheckDupElement {
    public static void main(String[] args) {
        int[] arr1={41,43,89,62,42,58,69,73,80,100};
        int[]arr2={10,12,13};
        boolean checkDuplicate=Arrays.stream(arr1).distinct().count() < (arr2.length);
        System.out.println(checkDuplicate);
    }
}
