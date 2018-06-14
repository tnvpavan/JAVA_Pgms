package perfectnumbers;

//Finding factors of a number

public class Factor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=144;
		for (int i=1 ; i<=n; i++)
			if(n%i==0)
				System.out.println(i);
	}

}
