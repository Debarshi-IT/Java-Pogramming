
import java.util.Scanner;

public class selection_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter numbers in descending order:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        //selection sort
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = temp;
        }
        System.out.println("Sorted array in ascending order:");
        for (int i = 0; i <= n - 1; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
