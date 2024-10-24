import java.util.*;
public class Duck_Number {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        String x=sc.nextLine();
        int l=x.length();
        if(x.charAt(0)=='0'){
            System.out.println("The number is not a Duck Number");
        }
        else{
            for(int i=1;i<l;i++){
                if(x.charAt(i)=='0'){
                    System.out.println("The number is a Duck Number");
                }
            }
        }
        
    }
}
