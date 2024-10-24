import java.util.*;
public class Magic_Number {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int x=sc.nextInt();
        int s=0,n1=x;
        while (n1 > 0 || s > 9) 
       { 
           if (n1 == 0) 
           { 
               n1 = s; 
               s = 0; 
           } 
           s += n1 % 10; 
           n1 /= 10; 
       } 
        if(s==1){
            System.out.println("The number is a Magic Number");
        }
        else{
            System.out.println("The number is not a Magic Number");

        }
    }
}
