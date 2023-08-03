import java.util.*;

public class PrimaryArithmetic {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		
			int n1 = in.nextInt();
			int n2 = in.nextInt();
			int carries = 0;/* keep track of the total number of carry operations encountered during addition*/
			int carry = 0; /* keep track of the carry value (0 or 1) for the current digit position.*/
			while (n1 != 0 || n2 != 0) { //This loop continues as long as there are digits remaining in either of the numbers (n1 or n2)./
				int sum = carry + n1 % 10 + n2 % 10;/* calculates the sum of n1 and n2 along with the current carry (carry). It extracts the rightmost digit of n1 and n2 using % 10 and then adds the carry value. */
				if (sum >= 10)
					++carries;
				carry = sum / 10;
				n1 /= 10;/* divides both n1 and n2 by 10 to remove the rightmost digit since we have already processed it.*/
				n2 /= 10;
			}
			if (carries == 0)
				System.out.println("No carry operation.");
			else
				System.out.println(carries + " carry operations.");
		//loop continues to read the next pair of integers until the input pair contains two zeros, and the loop terminates./
	}
}
