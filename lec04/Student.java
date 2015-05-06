public class Student extends Person {
    private int score = 100;
    private String school = "ZJU";

    public Student(String name, int age) {
        super(name, age);
    }

    public Student(String name, int age, int score, String school) {
        this(name, age);
        this.score = score;
        this.school = school;
    }

    public void testThisSuper() {
        int a = age;
        a = this.age;
        a = super.age;
    }

    public void sayHello(Student that) {
        System.out.println("Hi!");
        if (this.school == that.school)
            System.out.println("Schoolmate!");
    }

    public void sayHello() {
        super.sayHello();
        System.out.format("My school is %s, my score is %d.\n", school, score);
    }

    public static void main(String[] args) {
        Person p = new Person("Liming", 50);
        Student s = new Student("WangQiang", 20, 95, "PKU");
        Student s2 = new Student("Zhangyi", 18);
        Student s3 = new Student("LiLei", 18);
        p.sayHello();
        s.sayHello();
        s2.sayHello();
        s3.sayHello();
        s2.sayHello(s3);
    }

}
