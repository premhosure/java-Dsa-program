//Find maximum element


public class Maximum {
    public static void main(String[] args){
        int[] numbers= {10,20,30,40,50,60};
        int max= numbers[0];

        for(int i=0; i<numbers.length; i++){
            if(numbers[i]>max){
                max= numbers[i];
            }
        }
        System.out.println("maximun number:"+ max);
    }
    
}
