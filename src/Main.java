import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        function(Arrays.copyOfRange(a, 1, 5));
    }

    static void function(int[] arr){
        System.out.println(Arrays.toString(arr));
    }
}