package demo;

import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Serialize implements Serializable {
    public static final long serialVersionUID = -1;
    public int num = 1390;

    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("D:/a.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            Serialize serialize = new Serialize();
            oos.writeObject(serialize);
            oos.flush();
            oos.close();
            FileOutputStream fis = new FileOutputStream("D:/a.dat");
            byte[] c = new byte[1024];
            fis.write(c);
            System.out.println(Arrays.toString(c));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
