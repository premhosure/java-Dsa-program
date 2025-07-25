//Count even and odd elements


public class EvenAndOdd {
    public static void main(String[] args){
        int [] numbers= {11,24,33,40,56};
        int evenCount = 0;
        int oddCount= 0;

        for(int num : numbers){
            if(num % 2==0){
                evenCount++;
            }
            else{
                oddCount++;
            }
        }
        System.out.println("even numbers:"+ evenCount);
        System.out.println("odd numbers"+ oddCount);
    }
    
}
