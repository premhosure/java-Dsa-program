//Search for an element (Linear Search)


public class Search {
    public static void main(String[] args){
        int[] numbers={10,20,30,40,50,60};
        int target = 55;
        boolean found= false;

        for(int i=0; i<numbers.length; i++){
            if(numbers[i]==target){
                System.out.print("element"+target+"found at index"+ i );
                found = true;
                break;
            }
        }
        if(!found){
            System.out.print("element"+ target + "not found in the array");
        }
    }
    
}
