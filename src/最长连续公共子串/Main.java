package 最长连续公共子串;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
//        String s1 = "abcabcf";
//        String s2 = "dacabcfa";
        int cnt = 1;
        int[] a = new int[s1.length()];
        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    cnt = 1;
                    for (int k = 1; k < s1.length() - i && k < s2.length() - j; k++) {
                        if (s1.charAt(i + k) == s2.charAt(j + k)) {
                            cnt++;
                        }else
                            break;
                    }
                    a[i] = Math.max(a[i], cnt);
                }
            }
        }
        int max = 0;
        for(int i = 0; i < a.length; i++){
            if(a[max] < a[i])
                max = i;
        }
        for(int i = max; i < max+a[max]; i++){
            System.out.print(s1.charAt(i) + "   ");
        }
    }


}
