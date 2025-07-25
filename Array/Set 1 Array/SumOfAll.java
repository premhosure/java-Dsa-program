//Sum of all elements

public class SumOfAll {
    public static void main(String[] args){
        int [] numbers={1,25,30,44,99};
        int sum= 0;

        for(int num:numbers){
            sum += num ;
        }
        System.out.println("sum of all the elements: "+ sum);

    }
}
