import java.util.Scanner;
import java.util.Stack;

public class Main2 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int M = scanner.nextInt();
            int N = scanner.nextInt();
            if(M>=0){
                convert(M, N);
            }
        }
    }

    public static void convert(int m, int n){
        if(n==10){
            System.out.println(m);
            return;
        }
        boolean flag = true;
        Stack<Integer> stack = new Stack<Integer>();
        StringBuilder str = new StringBuilder();
        char[] ch = {'A','B','C','D','E','F'};
        while(m!=0){
            if(m%n<10){
                stack.push(m%n+'0');
            }else{
                stack.push(m%n-10+'A');
            }
            m = m/n;
        }
        while(!stack.isEmpty()){
            if(m<0&&flag){
                str.append("-");
                flag = false;
            }
            if(stack.peek()-'0'<10){
                str.append(stack.pop()-'0');
            }else{
                str.append(ch[stack.pop()-'A']);
            }
        }
        System.out.println(str.toString());
    }
}