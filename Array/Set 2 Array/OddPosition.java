public class OddPosition {
    public static void main(String[] args){
        int [] numbers={10,20,30,40,50,60,70};
        for(int i=0; i<numbers.length; i += 3){
            System.out.println(numbers[i] + " ");
        }
    }
}
