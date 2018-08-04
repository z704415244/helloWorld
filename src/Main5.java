import java.util.Arrays;
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] stone = new int[sc.nextInt()];
        for (int i = 0; i < stone.length; i++) {
            stone[i] = sc.nextInt();
        }
        Arrays.sort(stone);
        int score = 0;
        for (int i = stone.length - 1; i > 0; i--) {
            score += stone[i] * stone[i - 1];
            stone[i - 1] += stone[i];
        }
        System.out.println(score);
    }
}
