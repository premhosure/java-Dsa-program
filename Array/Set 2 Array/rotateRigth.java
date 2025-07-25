public class rotateRigth {
    public static void main(String[] args){
        int [] numbers={10,52,48,95,37};
        int last = numbers[numbers.length -1 ];
        for(int  i=numbers.length - 1; i>0; i--)numbers[i] = numbers[i-1];
        numbers[0]= last;
        
        for(int num: numbers)System.out.print(num + " ");
        

    }
    
}
