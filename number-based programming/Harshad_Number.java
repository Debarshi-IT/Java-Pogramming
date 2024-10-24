import java.util.Scanner;

public class Harshad_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        int num=n,s=0,i;
        for(i=num;i>0;i=i/10){
            int d=i%10;
            s=s+d;
        }
        if(n%s==0){
            System.out.println("The numner is a Harshad Number");
        }
        else{
            System.out.println("The numner is not a Harshad Number");
        }
    }
}
