package pyramids;

public class P1 {

	public static void main(String[] args) {
		int n = 10;
		for (int i = n; i >= 1; i = i - 2) {
			for (int j = i / 2; j >= 1; j--) {
				System.out.print("* ");
			}
			for (int k = (n - i); k != 0; k--) {
				System.out.print(" ");
			}
			for (int j = i / 2; j >= 1; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
