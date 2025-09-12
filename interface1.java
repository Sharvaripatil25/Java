//abstract class

/*abstract class student
{
    final static int total=200;
    abstract void display();
}

class CollegeStudent extends student {
    @Override
    void display() {
        System.out.println("Total students: " + total);
    }
}*/



interface student{
    int total=200; //final and static
    void display();  //abstract
}
class marks implements student{
    String cls="SY";
    public void display(){
        System.out.println(cls+ " Strength is "+total);
    }
}

public class interface1{
    public static void main(String[] args) {
        marks s= new marks();
        s.display();
    }
}


