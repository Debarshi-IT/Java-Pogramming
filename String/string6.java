import java.util.*;
public class string6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter your name: ");
        String st=sc.nextLine();
        int s=st.length();
        //System.out.println(s);
        for(int i=s-1;i>=0;i--){
            System.out.print(st.charAt(i));
        }

    }
}
