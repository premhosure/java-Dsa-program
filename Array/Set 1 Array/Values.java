//Check if array contains a value


public class Values {
    public static void main(String[] args)
    {
        int [] numbers = {10,20,30,40,50};
        int target= 10;
        boolean found =false;

        for(int num:numbers)
        {
            if(num==target){
                found= true;
                break;
            }
        }
        if(found){
            System.out.println("array contains the value" +target);
        }
        else{
            System.out.println("array does not contain any value"+ target);
        }
    }
    
}
