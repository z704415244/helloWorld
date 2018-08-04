package offer;

/*
* 请实现一个函数，将一个字符串中的空格替换成“%20”。
* 例如，当字符串为We Are Happy.则
* 经过替换之后的字符串为We%20Are%20Happy。
*/
public class 字符串替换 {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("We are happy");
        int cnt = 0;
        for (int i = 0; i < str.length(); i++) {
            if (' ' == str.charAt(i)) {
                cnt++;
            }
        }
        int i = str.length() - 1;
        str.setLength(str.length() + cnt * 2);
        int j = str.length() - 1;
        while (i < j) {
            if (' ' == str.charAt(i)) {
                str.setCharAt(j--, '0');
                str.setCharAt(j--, '2');
                str.setCharAt(j--, '%');
                i--;
            } else {
                str.setCharAt(j--, str.charAt(i--));
            }
        }
        System.out.println(str);
    }
}
