import java.util.Scanner;

class JollyJumper {
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
	
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}

			if (n == 1) {
				System.out.println("Jolly");
			}

			boolean[] nums = new boolean[n - 1];
			for (int i = 0; i < n - 1; i++) {
				int x = Math.abs(arr[i] - arr[i + 1]) - 1;
				if (0 <= x && x < nums.length) nums[x] = true;
			}

			boolean valid = true;
			for (boolean b : nums) {
				valid = valid && b;
			}
			System.out.println(valid ? "Jolly" : "Not jolly");
	}
}