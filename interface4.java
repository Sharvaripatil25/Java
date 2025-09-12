interface student {
    int strength = 400;   // public static final by default
    void display();       // public abstract by default
}

interface TY extends student {
    // display() is already inherited, no need to redeclare
    void result();  // better to add a new method here
}

public class interface4 implements TY {
    public void result() {
        System.out.println("Result of " + strength + " students is good");
    }

    public void display() {
        System.out.println("Some students results are not being displayed");
    }

    public static void main(String[] args) {
        interface4 ob = new interface4();
        ob.result();
        ob.display();
    }
}

