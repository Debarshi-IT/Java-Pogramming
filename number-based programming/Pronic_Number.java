import java.util.*;
public class Pronic_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int x=sc.nextInt();
        int i,n1=x;
        boolean b=false;
        for(i=1;i<=n1;i++){
            if((i*(i+1))==x){
                b=true;
            } 
        }
        if(b){
            System.out.println("The number is a Pronic Number");
        }
        else{
            System.out.println("The number is not a Pronic Number");
        }
        
    }
}
