import java.util.*;
public class Buzz_Number {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int x=sc.nextInt();
        if(x%7==0 || x%10==7){
            System.out.println("The number is a Buzz Number");
        }
        else{
            System.out.println("The number is not a Buzz Number");
        }
    }
}
