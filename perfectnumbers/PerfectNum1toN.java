package perfectnumbers;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// Finding Pefect NUmbers between 1 to n

public class PerfectNum1toN {
	public static void main (String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		System.out.println(" Enter value of n : " );
		int n = Integer.parseInt(br.readLine());
		int no=0;
		for ( int i=1; i<=n; i++){
			no=0;
			for(int j=1;j<i;j++){
				if(i%j==0)
					no=j+no;
			}
			if(no==i)
				System.out.println(i+",");
		}
	}

}
