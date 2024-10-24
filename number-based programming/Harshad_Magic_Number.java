import java.util.Scanner;

public class Harshad_Magic_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        int num=n,s=0,i,sum=0;
        for(i=num;i>0;i=i/10){
            int d=i%10;
            s=s+d;
        }
        int s1=s;
        if(n%s==0){
            while (s1 > 0 || sum > 9) 
            { 
                if (s1 == 0) 
                    { 
                        s1 = sum; 
                        sum = 0; 
                    } 
                sum += s1 % 10; 
                s1 /= 10; 
            } 
            if(sum==1){
                System.out.println("The numner is a Harshad Number");  
            }
            else{
                System.out.println("The numner is not a Harshad Number");
            }
            
        }
        else{
            System.out.println("The numner is not a Harshad Number");
        }
    }
}

