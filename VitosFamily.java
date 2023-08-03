import java.util.*;

public class VitosFamily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int T = 1; T <= t; T++) {
            int n = scanner.nextInt();
            int[] S = new int[10];

            for (int i = 1; i <= n; i++)
                S[i] = scanner.nextInt();
  // Sorting Doing Here
            for (int i = 1; i <= n; i++) {
                for (int j = i + 1; j <= n; j++) {
                    if (S[i] > S[j]) {
                        int temp = S[i];
                        S[i] = S[j];
                        S[j] = temp;
                    }
                }
            }

            int M = (n + 1) / 2; 
            int sum = 0;
            for (int i = 1; i <= n; i++)
                sum += Math.abs(S[M] - S[i]); 
                                              
            System.out.println("Sum = "+sum);     
        }
    }
}
