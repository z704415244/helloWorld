package 最长连续递增子序列;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//      int[] a = {5, 3, 4, 8, 6, 7};
        Scanner sc = new Scanner(System.in);
        int[] a = new int[sc.nextInt()];
        for (int i = 0; i < a.length; i++)
            a[i] = sc.nextInt();
        int[] b = new int[a.length];
        int max = 0;
        b[0] = 1;
        for (int i = 1; i < a.length; i++) {
            if (a[i] >= a[i - 1]) {
                b[i] = b[i - 1] + 1;
            } else {
                b[i] = 1;
            }
            max = Math.max(max, b[i]);
        }
//        for (int i = 0; i < b.length; i++)
//            System.out.println(b[i]);
        System.out.println(max);
    }
}
