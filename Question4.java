package patterns;

public class Question4 {
	public static void main(String args[]) {
		int n = 14;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i >= n / 2 - 1) {
					if (i == n - 1 || i == n - 2 || j <= (i - (n / 2 - 1)) || j >= n / 2 + ((n - i) - 2)) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}
}
