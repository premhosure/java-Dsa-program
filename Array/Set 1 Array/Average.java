//Average of array elements

public class Average
 {
    public static void Min(String[] args)
    {

        int [] numbers ={10,20,30,40,50};
        int sum =0;

        for(int i=0 ; i< numbers.length; i++)
        {
            sum += numbers[i];
        }
        double average =(double) sum/numbers.length;
        System.out.println("average =" +average);

    }
 }
    
