import java.io.*;

public class TryCatchFinally {
    private static String output = "";
    public static void foo(int i) {
        try {
            if (i == 1) {
                throw new Exception();
            }
            output += "1";
        } catch (Exception e) {
            output += "2";
        } finally {
            output += "3";
        }
    }
    public static void main(String[] args) {
        int a = 100;
        try {
            a = 200;
        } catch (IndexOutOfBoundsException e) {
            a = 300;
        } catch (Exception e) {
            a = 400;
        } finally {
            a = 500;
        }
        a = 600;
        foo(1);
        System.out.println(output);
        output = "";
        foo(2);
        System.out.println(output);
    }
}
