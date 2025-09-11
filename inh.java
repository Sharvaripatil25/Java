import java.util.Scanner;
class Box
{
 	 protected double depth;
	 protected double width;
	 protected double height;
	Box(double d)
	{
	depth =width =height = d;
	}
	void volume()
	{
	 double V= depth * width *height;
	System.out.println("Volume:" + V);
	}
}
 class Boxweight extends Box
 { 	
	double weight;
	Boxweight(double d, double x)
	{
	super(d);  //call superclass constructor
	weight = x;
	}
	void show()
	{
	 System.out.println("Weight:" + weight);
     System.out.println("depth:" + depth);
     System.out.println("width:" + width);
     System.out.println("height:" + height);
	} 
}
class Boxcost extends Boxweight
{
	double cost;
	Boxcost(double d, double x, double c)
	{
	super(d, x);
	cost = c;
	}
	void show()
	{
	super.show();		//weight
	System.out.println("Cost is:" + cost);
	}
}


public class inh {
    public static void main(String[] args)
	{
	Boxcost ob =new Boxcost(7.5,50.5,30.5); 	
	ob.volume();
	ob.show();
	}
}
