package amstrongNumber;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Amstrong {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Enter a Number : ");
		int n = Integer.parseInt(br.readLine());
		int n1=n;
		int no=0;
		for (; n!=0;){
			int r = n%10;
			r = r*r*r;
			no = no+r;
			n = n/10;
		}
		if(n1==no)
			System.out.println( no + " Is an Amstrong Number");
		else
			System.out.println("not an amstrong Number");
		
	}

}
