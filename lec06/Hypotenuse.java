public class Hypotenuse {
    public static void main(String[] args) {
        assert compute(3, 4) == 5.0 : "Wrong solution!";
    }
    public static double compute(double x, double y) {
        return Math.sqrt(x*x + y*y + 1);
    }
}
