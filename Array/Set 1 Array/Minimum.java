//Find minimum element


public class Minimum {
    public static void main(String[] args){
        int[] numbers ={100,30,40,60,70,90};
        int min= numbers[0];

        for(int i=0; i<numbers.length; i++){
            if(numbers[i]< min){
                min= numbers[i];
            }
        }
        System.out.println("minimum number:"+ min);
    }
    
}
