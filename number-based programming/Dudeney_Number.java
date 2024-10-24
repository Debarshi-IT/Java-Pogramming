import java.util.*;
import java.lang.Math;
public class Dudeney_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr the number: ");
        int x=sc.nextInt();
        int s=0,i,n1=x;
        int cubeRoot=(int)Math.cbrt(n1);
        //System.out.println(cubeRoot);
        for(i=n1;i>0;i=i/10){
            int d=i%10;
            s=s+d;
        }
        //System.out.println(s);
        if(s==cubeRoot){
            System.out.println("The number is a Dudeney Number");
        }
        else{
            System.out.println("The number is not a Dudeney Number");
        }

    }
}
