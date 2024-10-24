import java.util.Scanner;
import java.lang.Math;
public class Armstrong_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        int num=n,s=0,c=0,n1=n,i;
        //to count number of digits in a number
        while(n1>0){
            c++;
            n1=n1/10;
        }
        for(i=num;i>0;i=i/10){
            int d=i%10;
            s=s+(int)Math.pow(d,3);
        }
        if(s==n){
            System.out.println("The number is a Armstrong Number");
        }
        else{
            System.out.println("The number is not a Armstrong Number");
        }
    }
}
