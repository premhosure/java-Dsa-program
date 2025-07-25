//Copy one array into another


public class CopyArray {
    public static void main(String[] args)
    {
        int [] original= {10,20,30,40,50};
        int [] copy= new int[original.length];

        for(int i=0; i<original.length; i++)
        {
            copy[i]= original[i];
        }
        System.out.print("copied array:");
        for(int num:copy)
        {
            System.out.print(num +" ");
        }
    }
    
}
