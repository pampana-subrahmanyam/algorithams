package controllerstatements.forloop.patterns.other;

public class ButterFlyPattern {

	public static void main(String[] args) {

		int i, j;
		int n = 5;
		// upper half of the pattern
		for (i = 0; i < n; i++) {
			for (j = 0; j < (2 * n); j++) {
				if (i >= j) // upper left triangle
					System.out.print("*");
				else
					System.out.print(" ");
				if (i >= (2 * n - 1) - j) // upper right triangle
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		// bottom half of the pattern
		for (i = 0; i < n; i++) {
			for (j = 0; j < (2 * n); j++) {
				if (i + j <= n - 1) // bottom left triangle
					System.out.print("*");
				else
					System.out.print(" ");
				if ((i + n) <= j) // bottom right triangle
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
