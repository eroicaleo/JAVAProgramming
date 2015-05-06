public class Person {
    private String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age  = age;
    }
    public void sayHello() {
        System.out.format("My name is %s, my age is %d.\n", name, age);
    }

    public static void main(String[] args) {
        Person p = new Person("Liming", 50);
        p.sayHello();
    }
}
