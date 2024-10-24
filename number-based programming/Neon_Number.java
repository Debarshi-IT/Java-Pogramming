import java.util.*;
import java.lang.Math;
public class Neon_Number {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number:");
        int x=sc.nextInt();
        int s=0,n1=x,i;
        int p=(int)Math.pow(n1,2);
        int p1=p;
        for(i=p1;i>0;i=i/10){
            int d=i%10;
            s=s+d;
        }
        if(s==x){
            System.out.println("The number is a Neon Number");
        }
        else{
            System.out.println("The number is not a Neon Number");
        }
    }
}
