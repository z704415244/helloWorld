import java.util.Scanner;

/*
3 3
1 1
1 1
0 1 0
1 0 0
0 0 2
*/
//3 3 0 0 2 2 0 1 0 0 0 0 0 0 0
//4 4 0 3 3 3 1 0 0 0 1 0 1 1 1 0 0 0 2 0 0 0
public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[sc.nextInt()][sc.nextInt()];
        int inX = sc.nextInt();
        int inY = sc.nextInt();
        int outX = sc.nextInt();
        int outY = sc.nextInt();
        int i, j;
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a[i].length; j++) {
                a[i][j] = sc.nextInt();
            }
        }
//        printArr(a);
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a[i].length; j++) {
                if (a[i][j] == 1) {
                    a[i][j] = -1;
                } else if (a[i][j] == 2) {
                    a[Math.max(0, i - 1)][j] = -1;
                    a[Math.min(a.length - 1, i + 1)][j] = -1;
                    a[i][Math.max(0, j - 1)] = -1;
                    a[i][Math.min(a[i].length - 1, j + 1)] = -1;
                } else if (a[i][j] == 3) {
                    a[Math.max(0, i - 1)][j] = -1;
                    a[Math.max(0, i - 2)][j] = -1;
                    a[Math.min(a.length - 1, i + 1)][j] = -1;
                    a[Math.min(a.length - 1, i + 2)][j] = -1;
                    a[i][Math.max(0, j - 1)] = -1;
                    a[i][Math.max(0, j - 2)] = -1;
                    a[i][Math.min(a[i].length - 1, j + 1)] = -1;
                    a[i][Math.min(a[i].length - 1, j + 2)] = -1;
                }
            }
        }
//        printArr(a);
        a[outX][outY] = 1;
        ergodic(a, outX, outY);
        printArr(a);
//        int x = 0, y = 0;
//        if (outX - inX > 0) {
//            x = -1;
//        } else {
//            x = 1;
//        }
//        if (outY - inY > 0) {
//            y = -1;
//        } else {
//            y = 1;
//        }
//
//
//        a[outX][outY] = 1;
//
//
//        for (i = outX; i >= 0 && i < a.length; i += x) {
//            for (j = outY; j >= 0 && j < a[0].length; j += y) {
//                if (i == outX && j == outY) {
//                    j += y;
//                }
//                if (a[i][j] == -1) {
//                    continue;
//                }
//                a[i][j] = Math.min(Math.min(Math.min(isBorder(a, i - 1, j), isBorder(a, i + 1, j)),
//                        isBorder(a, i, j - 1)), isBorder(a, i, j + 1));
//                if (i == inX && j == inY) {
//                    System.out.println(a[i][j] - 1);
////                    return;
//                }
//            }
//            if (y > 0) {
//                j = 0;
//            } else {
//                j = a[0].length - 1;
//            }
//        }
//        printArr(a);


    }
//4 4 0 3 3 3 1 0 0 0 1 0 1 1 1 0 0 0 2 0 0 0

    static void ergodic(int[][] a, int i, int j) {
        if (a[i][j] == -1) {
            a[i][j] = 1000;
        } else if (a[i][j] == 0 || a[i][j] > 1000) {
            a[i][j] = Math.min(Math.min(Math.min(isBorder(a, i - 1, j), isBorder(a, i + 1, j)),
                    isBorder(a, i, j - 1)), isBorder(a, i, j + 1));
        }

        if (i - 1 >= 0 && a[i - 1][j] <= 0 ) {
            ergodic(a, i - 1, j);
        }
        if (i + 1 <= a.length - 1 && a[i + 1][j] <= 0) {
            ergodic(a, i + 1, j);
        }
        if (j - 1 >= 0 && a[i][j - 1] <= 0) {
            ergodic(a, i, j - 1);
        }
        if (j + 1 <= a[0].length - 1 && a[i][j + 1] <= 0) {
            ergodic(a, i, j + 1);
        }

    }

    static int isBorder(int[][] a, int i, int j) {
        if (i < 0 || j < 0 || i > a.length - 1 || j > a[0].length - 1 || a[i][j] == -1 || a[i][j] == -2 || a[i][j] == 0) {
            return Integer.MAX_VALUE / 10;
        }
        return a[i][j] + 1;
    }

    static void printArr(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + "  ");
            }
            System.out.println();
        }
    }
}