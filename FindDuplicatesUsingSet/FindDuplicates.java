import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class FindDuplicates {

    public static Set findDup(int[] arr1) {
        Set seen = new HashSet();
        Set duplicates = new HashSet();

        for (int num : arr1) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }
        return duplicates;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter " + size + " array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Array elements are: ");
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();

        Set duplicates = findDup(arr);

        if (duplicates.isEmpty()) {
            System.out.println("No duplicates found.");
        } else {
            System.out.print("Duplicate elements are: ");
            for (int dupElement : duplicates) {
                System.out.print(dupElement + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}