public class InitialTest {
    public static void main(String[] args) {
        new InitialTest();
    }

    public InitialTest() {
        n++;
        System.out.println("Constructor..." + n);
    }
    int n = 10;
    {
        n++;
        System.out.println("InitialTest..." + n);
    }
    {
        n++;
        System.out.println("InitialTest..." + n);
    }
    static int x;
    static {
        x++;
        System.out.println("Static..." + x);
    }
    static {
        x++;
        System.out.println("Static..." + x);
    }

}
