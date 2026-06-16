
import java.util.*;
 public class RecursiveSearch {

    static boolean search(int[] arr, int target, int index) {

        // Base case
        if (index == arr.length) {
            return false;
        }

        // If element found
        if (arr[index] == target) {
            return true;
        }

        // Recursive call
        return search(arr, target, index + 1);
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int target = 30;

        System.out.println(search(arr, target, 0));
    }
}  
    

