//Count occurrences of an element

public class Occurrences
 {
    public static void main(String[] args)
    {
        int [] numbers={10,20,30,40,50};
        int target= 50;
        int count= 0;

        for(int num: numbers)
        {
            if(num == target)
            {
                count++;
            }
        }
        System.out.print("Element " + target + " occurs " + count + " times.");
    }
}
