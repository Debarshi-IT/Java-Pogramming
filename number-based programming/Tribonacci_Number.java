import java.util.*;
public class Tribonacci_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (isTribonacci(num)) {
            System.out.println(num + " is a Tribonacci number.");
        } else {
            System.out.println(num + " is not a Tribonacci number.");
        }

        scanner.close();
    }
    public static boolean isTribonacci(int num) {
        if (num < 0) return false;
        int a = 0, b = 1, c = 1;
        if (num == a || num == b || num == c) return true;
        int next;
        while (true) {
            next = a + b + c;
            if (next == num) return true; 
            if (next > num) return false; 
            a = b;
            b = c;
            c = next;
        }
    }
}

