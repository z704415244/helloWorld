public class Utils {

    public static int[] getArr(int n){
        int[] a = new int[n];
        for (int i = 0; i < a.length;i++){
            a[i] = (int)Math.ceil(Math.random()*50);
        }
        return a;
    }
}
