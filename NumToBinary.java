package numbertobinary;

import java.util.Scanner;

//converting given number to Binary Number 0's & 1's

public class NumToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number :  ");
		String str = s.nextLine();
		/*//String n = Integer.parseInt(s.nextLine());
		int r=0;
		int t=0;
		while(n!=0){
			r=n%2;
			if(r==0){
			}
			else{
			t=(t*10)+r;
			n=n/2;
			}
		}
			
		System.out.println(t);
*/
		System.out.println(str);
	}

}
