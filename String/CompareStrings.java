package String;
public class CompareStrings {
    public static void main(String[] args){
        String name1= "tony";
        String name2= "tony";

        /* 1 - s1> s2: +ve values 
         * 2 - s1 = s2: 0
         * 3 - s1< s2 : -ve values 
         * 
         even these vary from capital and amall leter 
        */
        /*compareTo is used instade of == because == fails in some case and not compareTo */
        if(name1.compareTo(name2) ==0){
            System.out.println("String are equal ");
        }else{
            System.out.println("String are not equal");
        }
    }
}
