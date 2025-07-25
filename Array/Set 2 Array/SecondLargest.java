//Find second largest element in array

public class SecondLargest{
    public static void main(String[] args){
        int [] numbers= {10,20,30,40,50};
        int first = Integer.MIN_VALUE , second= Integer.MIN_VALUE;

        for(int num : numbers ) {
            if(num >first){
                second = first ;
                first = num ;
            }
            else if (num>second && num != first){
                second =num;
            }
        }
        System.out.println("second largest number: " + second);
    }
}