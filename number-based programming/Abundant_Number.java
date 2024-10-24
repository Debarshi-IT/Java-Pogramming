import java.util.*;
public class Abundant_Number {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number:");
        int x=sc.nextInt();
        int i,s=0,n1=x;
        for(i=1;i<n1;i++){
            if(n1%i==0){
                s=s+i;
            }
        }
        if(s>x){
            System.out.println("The number is a Abundant Number");
        }
        else{
            System.out.println("The number is not a Abundant Number");
        }
    }
}
