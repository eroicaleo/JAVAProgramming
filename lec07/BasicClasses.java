import java.util.*;
import java.util.Date;

public class BasicClasses {
    public static void main(String[] args) {
        Integer I = 5;
        System.out.println(I);

        Properties props = System.getProperties();
        Enumeration keys = props.propertyNames();
        while (keys.hasMoreElements()) {
            String key = (String) keys.nextElement();
            // System.out.println(key + ": " + System.getProperty(key));
        }

        /* StringBuffer class */
        String s = "";
        StringBuffer sb = new StringBuffer();
        int N = 10000;

        long t0 = System.currentTimeMillis();
        for (int i = 0; i < N; i++) s += "a";
        long t1 = System.currentTimeMillis();
        for (int i = 0; i < N; i++) sb.append("a");
        long t2 = System.currentTimeMillis();
        System.out.println(t1 - t0);
        System.out.println(t2 - t1);

        /* StringTokenizer */
        StringTokenizer st = new StringTokenizer("this is a new test", " ");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
        st = new StringTokenizer("123,456,789", ",");
        int sum = 0;
        while (st.hasMoreTokens()) {
            sum += Integer.parseInt(st.nextToken());
        }
        System.out.println("sum = " + sum);

        List<Photo> album = new LinkedList<Photo>();
        album.add(new Photo("one", new Date(), "classroom"));
        album.add(new Photo("two", new Date(), "library"));

        for (Photo p : album) {
            System.out.println(p);
        }

        String[] month = {"Jan", "Feb", "Mar", "Apr", "May", "Jue"};
        Stack<String> sm = new Stack<String>();
        for (String m : month) {
            sm.push(m);
        }
        for (String m : sm) {
            System.out.println(m);
        }

        java.util.Queue<Integer> q = new LinkedList<Integer>();
        for (int i = 0; i < 5; i++) {
            q.offer(i);
        }
        while (!q.isEmpty()) {
            System.out.println(q.poll());
        }

        /* Set */
        Set<String> set = new HashSet<String>();
        set.add("Brazil");
        set.add("India");
        set.add("China");
        set.add("USA");
        set.add("Japan");

        System.out.println("Set contains China? " + set.contains("China"));
        for (String ss : set) {
            System.out.println(ss);
        }

        /* Map */
        Map<String, String> map = new TreeMap<String, String>();
        map.put("b", "Brazil");
        map.put("c", "China");
        map.put("i", "India");
        map.put("u", "USA");
        map.put("j", "Japan");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.printf("%s : %s\n", entry.getKey(), entry.getValue());
        }

        String haha = "Hello";
        haha.length();

        /* Collection.Sort */
        List<Person> school = new ArrayList<Person>();
        school.add(new Person("Alex", 18));
        school.add(new Person("Barbara", 17));
        school.add(new Person("Caroline", 16));
        school.add(new Person("Dario", 15));
        school.add(new Person("Emily", 14));
        school.add(new Person("Helen", 13));
        school.add(new Person("Shannon", 2));
        Collections.sort(school, new PersonComparator());
        for (Person p : school) {
            System.out.println(p);
        }
    }
}

class PersonComparator implements Comparator<Person> {
    public int compare(Person v, Person w) {
        return (v.age - w.age);
    }
}

class Person {
    public String name;
    public int age;
    public Person(String s, int a) {
        name = s;
        age = a;
    }
    public String toString() {
        return name + ": " + age;
    }
}

class Photo {
    private String name;
    private Date date;
    private String memo;
    public Photo(String n, Date d, String m) {
        name = n;
        date = d;
        memo = m;
    }
    public String toString() {
        return name + " (" + date + ") " + memo;
    }
}
