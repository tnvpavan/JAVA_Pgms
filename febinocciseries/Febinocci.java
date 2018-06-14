package febinocciseries;

import java.util.Scanner;

// printing series of febinocci
public class Febinocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value of n :  ");
		int n = Integer.parseInt(s.nextLine());
		
		int a=2;
		int b=3;
		int c=0;
		int count =0;
		while ( count < n){
			c=a+b;
			System.out.println( c + "  ");
			a=b;
			b=c;
			count++;
		}

	}

}
