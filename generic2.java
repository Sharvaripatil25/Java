
class gen{
    <T> void display(T[] arr){
        for(T i:arr){
            System.out.println(i);
        }
    }
}

public class generic2 {
    public static void main (String args[]){
        String arr1[]={"Apple","Banana","Grapes"};
        Integer arr2[]={1,2,3,4,5};
        gen obj=new gen();
        obj.display(arr1);
        obj.display(arr2);
    }
}
