package recursive;

import java.util.Scanner;

public class StringReverse {

	String reverseString = "";

	public StringBuilder stringRev(String string, int i, StringBuilder revBuilder) {

		StringBuilder builder = revBuilder;

		if (string == null || "".equals(string.trim())) {
			System.out.println(" ");
			return null;
		}
		if (i < string.length() - 1) {
			// System.out.println("in if:"+i);
			stringRev(string, i + 1, builder);
		}

		return builder.append(string.charAt(i));
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter String to reverse");
		String str = s.nextLine();

		StringReverse stringObj = new StringReverse();
		StringBuilder build = stringObj.stringRev(str, 0, new StringBuilder());
		System.out.println(build.toString());
		// System.out.println(stringObj.stringRev(str, 0, new StringBuilder()));

	}

}
