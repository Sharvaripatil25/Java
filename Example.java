class Box
 {
 	float depth;
	float width;
	float height;
    
 	void set( float d, float w, float h)
	{
	depth = d;
	width = w;
	height = h;
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
	void set_w( float p)
	{
	weight = p;
	}
	void show()
	{
	 System.out.println("Weight:" + weight);
	}
}
public class Example {
    public static void main(String[] args) {
        Boxweight ob =new Boxweight();
	    ob.set(5.5f, 10.5f, 7.5f);
	    ob.volume();
	    ob.set_w( 100.5f);
	    ob.show();

    }
}
