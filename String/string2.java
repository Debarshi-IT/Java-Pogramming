import java.util.*;
public class string2 {
    public static void main(String[] args) {
        //concatenation
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter your string:");
        String st1=sc.nextLine();
        System.out.println("please enter your name:");
        String st2=sc.nextLine();
        System.out.println(st1+" "+ st2);
        String st3=st1 +st2;
        System.out.println("Length of the string is:"+st3.length());
        //charAt
        for(int i=0;i<st3.length();i++){
            System.out.println(st3.charAt(i));
        }
    }
} 
