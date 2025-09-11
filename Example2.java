class Box
 {
 	float depth;
	float width;
	float height;
    Box()  //defaullt constructor
    {
        depth = 10;
        width = 5;
        height = 20;
    }
 	Box(float d, float w, float h) //parameterized 
	{
	depth = d;
	width = w;
	height = h;
	}
 	Box(Box ob2) //parameterized 
	{
	depth = ob2.depth;
	width = ob2.width;
	height = ob2.height;
	}   
	void volume()
	{
	 float V= depth * width *height;
	System.out.println("Volume:" + V);
	}
}
class Boxweight extends Box
 {
 	float weight;
	Boxweight()
	{
        super();  //call superclass constructor
	    weight =200;
	}    
	Boxweight(float p, float q, float r, float x)
	{
        super(p,q,r);  //call superclass constructor
	    weight =x;
	}
	Boxweight(Boxweight ob2)
	{
        super(ob2);  //call superclass constructor
	    weight =ob2.weight;
	}
	void show()
	{
	 System.out.println("Weight:" + weight);
	}
}


public class Example2 {
    public static void main(String[] args) {
        Boxweight ob1 =new Boxweight();
	    Boxweight ob2 =new Boxweight(5,6,8,100);
	    Boxweight ob3 =new Boxweight(ob2);
	    ob1.volume();
	    ob1.show();
	    ob2.volume();
	    ob2.show();	
        ob3.volume();
	    ob3.show();
    }
}
