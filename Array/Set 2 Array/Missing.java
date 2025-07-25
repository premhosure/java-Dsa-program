public class Missing {
    public static void main(String[] args){
        int [] numbers ={1,2,4,5};
        int n = 5; 

        int expectedSum = n*(n+1)/2;

        int actualSum = 0;
        for(int num : numbers ){
            actualSum += num;
        }
        int MissingNumber = expectedSum - actualSum ;

        System.out.println("missinf number is: " + MissingNumber);
    }
}
