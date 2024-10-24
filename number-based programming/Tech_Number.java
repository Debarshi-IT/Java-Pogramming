import java.util.*;
import java.lang.Math;
public class Tech_Number {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int x=sc.nextInt();
        int s,ls,rs,c=0,n1=x;
        while(n1>0){
            c++;
            n1=n1/10;
        }
        if(c%2!=0){
            System.out.println("The number is not a Tech Number");
            return;
        }
        else{
            ls=x/100;
            rs=x%100;
            s=ls+rs;
            int p;
            //int b=2;
            p=(int)Math.pow(s,2);
            if(p==x){
                System.out.println("The number is a Tech Number");
            }
            else{
                System.out.println("The number is not a Tech Number");
            }
        }
        
    }
}
