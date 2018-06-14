package recursive;

//Finding Factorial of a NUmber Using Recursion technique....

public class Factorial {

	int result = 1;
	public int calculateFactorial(int number) {

		if (number == 1) {
			//result = (result*x)+result;
			return result;
		}
		else{
			result = (result*number);
			return calculateFactorial(number-1);
			
		}
	}

	public static void main(String[] args) {

		Factorial fact = new Factorial();
		System.out.println(fact.calculateFactorial(5));

	}

}
