public class string3 {
    public static void main(String[] args) {
        //compareing
        String st1="Debarshi";
        String st2="Chatterjee";

        //1. string1 > string2 : +ve value
        //2. string1 == string2 : 0
        //3. string1 < string2 : -ve value

        if(st1.compareTo(st2)==0){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }
    }
}
