
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DynaFactorial {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a num to find Factorial :  ");
		int no = Integer.parseInt(br.readLine());
		
		int x=1;
		for( int i =1; i<=no; i++){
			x = x*i;
		}
		System.out.println(x);
		

	}

}
