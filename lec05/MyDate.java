public class MyDate {
    private int yy;
    private int mm;
    private int dd;
    public MyDate(int y, int m, int d) {
        yy = y;
        mm = m;
        dd = d;
    }
    public void addYear() {
        yy++;
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(yy);
        sb.append('/');
        sb.append(mm);
        sb.append('/');
        sb.append(dd);
        return sb.toString();
    }
    public static void modify(int b) {
        b = 1;
    }
    public static void modify(int[] b) {
        b[0] = 1;
    }
    public static void main(String[] args) {
        MyDate m = new MyDate(2012, 12, 28);
        System.out.println(m);
        MyDate n = m;
        n.addYear();
        System.out.println(m);
        System.out.println(n);
        int b = 0;
        modify(b);
        int[] a = new int[1];
        a[0] = 0;
        modify(a);
        System.out.printf("b is %d\n", b);
        System.out.printf("a is %d\n", a[0]);
    }
}
