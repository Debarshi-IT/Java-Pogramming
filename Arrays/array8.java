import java.util.*;

public class array8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,d,i,j;
        System.out.println("Enetr the array size: ");
        n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enetr the elements: ");
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Original array is: "+Arrays.toString(a));
        System.out.println("Enetr the d steps, where d is a positive integer: ");
        d=sc.nextInt();
        for(i=0;i<d;i++){
            int k=a[0];
            for(j=0;j<n-1;j++){
                a[j]=a[j+1];
            }
            a[j]=k;
        }
        System.out.println("The new array is: ");
        for(i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}
