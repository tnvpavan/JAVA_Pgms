package recursive;

//Printing 1 to 100 numbers using Recursion technique

public class OneTo100 {

	public void printNumber(int number) {

		if (number <= 100) {
			System.out.println(number);
			number++;
			printNumber(number);
		}

	}

	public static void main(String[] args) {

		OneTo100 obj = new OneTo100();
		obj.printNumber(1);

	}

}
