import java.util.*;
public class array1 {
    public static void main(String[] args) {
    int[] marks=new int[10];
    int i;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter all marks: ");
    for(i=0;i<10;i++){
        marks[i]=sc.nextInt();
    }
    //marks[0]=90;
    //marks[1]=100;
    //marks[2]=80;
    //System.out.println(marks[0]);
    //System.out.println(marks[1]);
    //System.out.println(marks[2]);
    System.out.println("the all marks:");
    for (i=0;i<10;i++){
        System.out.println(marks[i]);
    }
    }
}

