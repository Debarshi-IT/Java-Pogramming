
import java.util.*;

public class so_bubble_sort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("enter numbers in decending order:");
        int i, j;
        for (i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        //bubble sort
        System.out.println("the sorted array is:");
        for (i = 0; i < arr.length - 1; i++) {
            for (j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
