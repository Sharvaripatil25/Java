class SumAvg<T extends Number>
{
    T[] arr;
    SumAvg(T[] arr)
    {
        this.arr=arr;
    }
    void find()
    {
        double sum =0;
        for(T i:arr){
            sum+=i.doubleValue();
        }
        System.out.println("Sum:"+sum);
        System.out.println("Average:"+(sum/arr.length));
    }
}
public class generic3 
{
    public static void main (String args[]){
        Integer arr1[]={1,2,3,4,5};
        Double arr2[]={1.1,2.2,3.3,4.4,5.5};
        SumAvg<Integer> obj1=new SumAvg<>(arr1);
        obj1.find();
        SumAvg<Double> obj2=new SumAvg<>(arr2);
        obj2.find();
    }
    
}
