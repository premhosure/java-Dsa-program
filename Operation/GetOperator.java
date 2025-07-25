/*get a 3rd (position=2) of number n. (n=1010) */
package Operation;

public class GetOperator {
    public static void ain(String[] args){
        int n=5;
        int pos= 3;
        int bitMask = 1<<pos;

        if((bitMask & n)==0){
            System.out.println("bit was zero ");
        }else{
            System.out.println("bit was one");
        }
    }
}
