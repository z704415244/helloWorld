package 消耗能量最小值;

import java.util.Scanner;
//2 3
// -2 -3 3
// -5 -10 1
// ==6
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][]a =  new int[sc.nextInt()][sc.nextInt()];
        for(int i = 0; i<a.length;i++){
            for(int j = 0; j<a[i].length;j++){
                a[i][j] =sc.nextInt();
            }
        }
        for(int j = a[0].length-1;j>-1;j--){
            for (int i = a.length - 1; i > -1; i--) {
                if(i==a.length-1&&j==a[0].length-1)
                    continue;
                if(i == a.length - 1){
                    if(a[i][j+1] < 0){
                        a[i][j] += a[i][j+1];
                    }
                }else if(j==a[0].length-1){
                    if(a[i+1][j] < 0){
                        a[i][j] += a[i+1][j];
                    }
                }else {
                    if (a[i][j + 1] < 0 && a[i + 1][j] < 0) {
                        a[i][j] += Math.max(a[i][j + 1], a[i + 1][j]);
                    }
                }
            }
        }
        if(a[0][0]>0)
            System.out.println(1);
        else
            System.out.println(Math.abs(a[0][0])+1);
    }
}