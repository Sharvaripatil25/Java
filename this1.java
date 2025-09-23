class Box
  {
 	private int width;
	private int depth;
	private int height;
	void set(int width, int depth, int height)
	{
 	this.width= width;
	this.depth= depth;
	this.height= height;
	}
	int volume()
 	{
	int vol = width * depth * height;
	return vol;
	}
 }

public class this1 {
    public static void main( String args[] )
   {	
	Box B1 = new Box();
	Box B2 = new Box();
	B1.set(5, 10, 15);
	int V1=B1.volume();
	B2.set(10, 20, 30);
	int V2=B2.volume();
   }
}
