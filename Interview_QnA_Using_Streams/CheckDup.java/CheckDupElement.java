import java.util.Arrays;

public class CheckDupElement {
    public static void main(String[] args) {
        int[] l1={41,43,89,62,42,58,69,73,80,100};
        int[]l2={10,12,13};
        boolean checkDuplicate=Arrays.stream(l2).distinct().count() < (l2.length);
        System.out.println(checkDuplicate);
    }
}
