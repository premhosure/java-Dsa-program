package String;

public class CharAsString {
    public static void main(String[] args){
        String firstName= "Prem";
        String secondName= "Hosure";
        String FullName= firstName + " "+ secondName;

        for(int i=0; i < FullName.length() ; i++){
        System.out.print(FullName.charAt(i));
        }
    }
}
