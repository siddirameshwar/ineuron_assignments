package patterns;

public class Question2 {
	public static void main(String args[]) {
		int n = 7;
		int count = 1;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i % 2 == 0 && j % 2 == 0) {
					System.out.print(count);
				} else {
					System.out.print(" ");
				}
			}
			if (i % 2 == 0) {
				count++;
			}
			System.out.println();
		}
	}
}
