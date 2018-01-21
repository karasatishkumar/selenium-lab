package ForLoopExample;

public class DiagonalDemo {
	public static void main(String args[]) {

		// int arr[][] = new int[3][3];
		int ar[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int sum = 0;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (i == j) {

					/*
					 * if (i == j || i + j == 2) { System.out.println(ar[i][j]);
					 */

					System.out.println(ar[i][j]);

				}
			}

		}

	}
}
