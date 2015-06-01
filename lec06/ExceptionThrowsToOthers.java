import java.io.*;

public class ExceptionThrowsToOthers {
    public static void main(String[] args) {
        try {
            System.out.println("====Before====");
            readFile();
            System.out.println("====After====");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    public static void readFile() throws IOException {
        FileInputStream in = new FileInputStream("mytext.txt");
        int b = 0;
        b = in.read();
        while (b != -1) {
            System.out.println((char)b);
            b = in.read();
        }
        in.close();
    }
}
