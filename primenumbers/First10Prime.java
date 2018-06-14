package primenumbers;

//Printing " n " prime numbers :
import java.util.Scanner;

public class First10Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("how many prime numbers u want to print ? Enter Num : ");
		int n = Integer.parseInt(s.nextLine());
		int primeCount=0;
		//while(true){
			
			for( int i=2; primeCount<n; i++){
				//int primeCount = n;
				int count=0;
			for(int j=2; j<i; j++) {
				if( i%j==0){
					count++;
					break;
				}
			}
				if(count==0){
					System.out.print(i+ "  ");
					primeCount++;
				}
		 
			/*if(primeCount==n){
				break;
			}*/	
			}
		}
	}
   
//}