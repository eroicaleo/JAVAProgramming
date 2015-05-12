public class TestVirtualInvoke {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        s1.draw();
        Shape s2 = new Rectangle();
        s2.draw();
    }
}

class Shape {
    public void draw() {
        System.out.println("Shape drawing!");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Circle drawing!");
    }
}

class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle drawing!");
    }
}
