package 子区间最大和;

public class Main {
    public static void main(String[] args) {

        int[] a = {3, -5, 1, -5, 7, -10, 5, 1, -2, 1};
        int[] b = new int[a.length];
        b[0] = a[0];
        int s = a[0];

        for (int i = 1; i < a.length; i++) {
            if (b[i - 1] < 0) {
                b[i] = b[i - 1] + a[i];
            } else {
                b[i] = a[i];
            }
            s = Math.max(s, b[i]);
        }


        System.out.println(s);
    }

}
