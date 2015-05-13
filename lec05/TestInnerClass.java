class TestInnerClass {
    public static void main(String[] args) {
        Parcel p = new Parcel();

        Parcel.Contents c = p.new Contents(23);
        Parcel.Destination d = p.new Destination("Maui");
        p.setProperty(c, d);
        p.ship();
    }
}

class Parcel {
    private Contents c;
    private Destination d;
    class Contents {
        private int i;
        Contents(int i) {
            this.i = i;
        }
        int value() {
            return i;
        }
    }
    class Destination {
        private String label;
        Destination(String whereTo) {
            label = whereTo;
        }
        String dest() {
            return label;
        }
    }
    public void setProperty(Contents c, Destination d) {
        this.c = c;
        this.d = d;
    }
    public void ship() {
        System.out.printf("I am shipping contents %d to destination %s.\n", c.value(), d.dest());
    }
}
