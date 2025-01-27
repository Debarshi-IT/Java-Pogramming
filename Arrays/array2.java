import java.util.*;
public class array2 {
    public static void main(String[] args) {
    int[] marks=new int[5];
    int i;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter all marks: ");
    for(i=0;i<5;i++){
        marks[i]=sc.nextInt();
    }
    System.out.println("Please enter the search element: ");
    int x=sc.nextInt();
    for (i=0;i<5;i++){
        if(marks[i]==x)
        System.out.println("index of number: "+i);
       
    }
    }
}

