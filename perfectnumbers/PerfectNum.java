package perfectnumbers;


// To find Entered value is Perfect Number or not 

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PerfectNum {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int no=0;
		Scanner br=new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = Integer.parseInt(br.nextLine());
		
		for(int i=1;i<n;i++){
			if(n%i==0){
				no = no+i;
			}
			
		}
		System.out.println("Result is : " + no);
			if(n==no)
				System.out.println(n + "  is a perfect Number");
			else
				System.out.println(n + "  is not a perfecr number");
		}

	

}
