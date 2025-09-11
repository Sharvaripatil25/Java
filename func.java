class Figure
{
    void display()
    {
	 System.out.println("This is figure ");
    }
}

 class Rectangle extends Figure
 { 	
    float p,q;
	Rectangle (float a, float b)
	{ 
        p=a;
        q=b;
	}
	float area()
	{
	 System.out.println("Inside Rectangle");
	 return p*q;
	}
}
class Triangle extends Figure
 { 	
	Triangle (float a, float b)
	{ 
        super();
	}
	float area()
	{
	 System.out.println("");
	 return 0.5f* a * b;
	}
}
public class func
{
	public static void main(String[] args)
	{
// Figure F = new Figure(10,5);    //Invalid
Rectangle R = new Rectangle(2,6);
Triangle T = new Triangle(5, 7);

float A;
R.display();
A=R.area();  		//Rectangle Method
System.out.println("Area: " + A);

T.display();

A=T.area(); 		 //Triangle Method
System.out.println("Area:" + A);
	}
}
