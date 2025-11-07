//generic method
class SumAvg{
    <T extends Number> void SumAvg(T[] arr){
    double sum =0;
        for(T i:arr){
            sum+=i.doubleValue();
        }
        System.out.println("Sum:"+sum);
        System.out.println("Average:"+(sum/arr.length));
   }
}
public class generic4 {
   public static void main(String args[]){
       SumAvg obj=new SumAvg();
       Integer arr1[]={1,2,3,4,5};
       Double arr2[]={1.1,2.2,3.3,4.4,5.5};
       Float arr3[]={1.1f,2.2f,3.3f,4.4f,5.5f};
       obj.SumAvg(arr1);
       obj.SumAvg(arr2);
       obj.SumAvg(arr3);
   } 
}
