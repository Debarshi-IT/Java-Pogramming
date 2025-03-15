
import java.util.Scanner;

public class so_Insertion_sort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size:");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("enter numbers in decending order:");
        int i, j;
        for (i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }
        //insertion sort 
        for (i = 1; i < n; ++i) {
            int k = a[i];
            j = i - 1;
            while (j >= 0 && a[j] > k) {
                a[j + 1] = a[j];
                j = j - 1;
            }
            a[j + 1] = k;
        }
        System.out.println("Sorted array in ascending order:");
        for (i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
