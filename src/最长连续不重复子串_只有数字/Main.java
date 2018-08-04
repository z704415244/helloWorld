package 最长连续不重复子串_只有数字;

//处理非数字的使用hashmap存储就可以实现
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String s = "102135435";
        String s = sc.nextLine();
        int[] k = new int[s.length()];
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = -1;
        }
        int x = 0;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            x = s.charAt(i) - 48;
            //k[] 是存放包括当前下标元素在内的 之前的最长子串长度
            if (a[x] == -1) {
                a[x] = i;//如果没有找到值为x的数字, 就把x的下标存入a数组
                if (i > 0) {
                    k[i] = k[i - 1] + 1;
                } else {
                    k[i] = 1;
                }
            } else {
                k[i] = Math.min(i - a[x], k[i - 1] + 1);
                a[x] = i;
            }
            //max 是用来存放 包括当前下标的值在内 之前的最长不重复子串 的下标
            if (k[max] < k[i]) {
                max = i;
            }
        }
        //通过max来截取字符串
        for (int i = max - k[max] + 1; i <= max; i++) {
            System.out.print(s.charAt(i));
        }
    }
}