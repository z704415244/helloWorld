package 最长递增子序列;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int[] a = new int[sc.nextInt()];
//        for (int i = 0; i < a.length; i++)
//            a[i] = sc.nextInt();
        int[] a = {5, 3, 4, 8, 6, 7};
        int[] b = new int[a.length];
        b[0] = 1;
        int max = 0;
        for (int i = 1; i < a.length; i++) {
            for (int j = i - 1; j > -1; j--) {
                if (a[j] <= a[i]) {
                    b[i] = Math.max(b[j] + 1, b[i]);
                } else {
                    b[i] = Math.max(1, b[i]);
                }
            }
            max = Math.max(max, b[i]);
        }
        System.out.println(max);
        System.out.println(Arrays.toString(b));
    }
}
