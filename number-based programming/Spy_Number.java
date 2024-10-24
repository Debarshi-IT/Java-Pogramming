import java.util.*;
public class Spy_Number {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int x=sc.nextInt();
        int sum=0,i,product=1;
        for(i=x;i>0;i=i/10){
            int d=i%10;
            sum=sum+d;
            product=product*d;
        }

        if(sum==product){
            System.out.println("The number is a Spy Number");
        }
        else{
            System.out.println("The number is not a Spy Number");
        }
        
    }
}
