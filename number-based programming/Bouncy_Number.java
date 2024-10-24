import java.util.*;

class Bouncy_Number {
static Boolean check(int N)
{
	String S = Integer.toString(N);
	for (int i = 0; i < S.length(); i++) {
	if (i == 0) {
		int next = i + 1;
		if (next < S.length()) {
		if (S.charAt(i) >= S.charAt(next)) {

			return false;
		}
		}
	}

	else if (i == S.length() - 1) {
		int prev = i - 1;
		if (prev >= 0) {
		if (i % 2 == 1) {
			if (S.charAt(i) <= S.charAt(prev)) {
			return false;
			}
		}
		else {
			if (S.charAt(i) >= S.charAt(prev)) {
			return false;
			}
		}
		}
	}
	else {
		int prev = i - 1;
		int next = i + 1;
		if (i % 2 == 1) {
		if ((S.charAt(i) > S.charAt(prev))
			&& (S.charAt(i) > S.charAt(next))) {
		}
		else {
			return false;
		}
		}
		else
		{
		if ((S.charAt(i) < S.charAt(prev))
			&& (S.charAt(i) < S.charAt(next))) {
		}
		else {
			return false;
		}
		}
	}
	}
	return true;
}
public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number: ");
    int N=sc.nextInt();
	if(check(N) == true)
	System.out.print("The number is a Bouncy Number");
	else
	System.out.print("The number is not a Buncy Number");
}
}