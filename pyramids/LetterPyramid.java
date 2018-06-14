package pyramids;

public class LetterPyramid {

	public static void main(String[] args) {
		int n = 4;
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < i; j++) {
				//char ch1=(char)('A'+j), ch2 =(char)('A'+j);
				System.out.print((char)('A'+j));
				System.out.print((char)('A'+j));
				System.out.print(" ");
			}
			System.out.println();
		}
		
		/*char ch1 = 0, ch2 = 0;
		int n = 4;
		int n1 = 65;
		int n2 = 97;

		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < i; j++) {
				ch1 = (char) (n1 + j);
				ch2 = (char) (n2 + j);
				System.out.print(ch1);
				System.out.print(ch2);
				System.out.print(" ");
				for(int k=0;k<i-1;k++){
					System.out.print(" ");
				}
			}

			System.out.println();
		}*/
	}

}
