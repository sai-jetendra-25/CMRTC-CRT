package ExcepHandling.CheckedException;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CheckedVsUnChecked {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int res = a / b;

        } catch (ArithmeticException ob) {
            System.out.println(ob);

        }
        try {
            String st = null;
            System.out.println(st.length());
        } catch (NullPointerException ob) {
            System.out.println(ob);
        }
        try {
            File f = new File("Sample.txt");
            FileReader fr = new FileReader(f);
            System.out.println("File red Successfully");
            fr.close();
        } catch (IOException e) {
            System.out.println(e);
        }
        try {
            readFile();

        } catch (IOException e) {
            System.out.println(e);
        }
    }

    private static void readFile() throws IOException {
        File f = new File("AnotherSample.txt");
        FileReader fr = new FileReader(f);
        System.out.println("File red Successfully");
        fr.close();
    }
}