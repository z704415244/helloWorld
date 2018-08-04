public class 求一个数组中不重复的两个元素 {



    public static void main(String[] args) {
        int a[] = {3, 2, 5, 1, 3, 9, 2, 5};
        int num1 = 0, num2 = 0, num = 0, flag = 0;
        for (int i = 0; i < a.length; i++) {
            num = num ^ a[i];
        }
        for (int i = 0; i < 32; i++) {
            if (((num >> i) & 1) != 1)//找异或之后这个数字二进制数中最先出现的1的位置
            {
                flag++;
            } else
                break;

        }
        for (int i = 0; i < a.length; i++) {
            if (((a[i] >> flag) & 1) == 1)//分成2组
                num1 ^= a[i];
            else
                num2 ^= a[i];
        }
        System.out.println(num1 + " " + num2);
    }
}
