class TestInnerThis {
    public static void main(String[] args) {
        A a = new A();
        A.B b = a.new B();
        b.mb(333);
        // a.B.mb(333);

        Outer.Inner oi = new Outer.Inner();
        Outer.Inner oi2 = new Outer.Inner();
        Outer ot = new Outer();
        System.out.println(oi.i);
        System.out.println(oi2.i);
        oi2.i = 2;
        System.out.println(oi.i);
        System.out.println(oi2.i);
    }
}

class A {
    private int s = 111;
    class B {
        private int s = 222;
        public void mb(int s) {
            System.out.printf("Argument s: %d\n", s);
            System.out.printf("B.s : %d\n", this.s);
            System.out.printf("A.s : %d\n", A.this.s);
        }
    }
}

class Outer {
    static class Inner {
        int i = 0;
    }
}
