package perfectnumbers;

//Finding factors of a Dynamically entered NUmber :
import java.io.IOException;
import java.util.Scanner;
public class FacDynamicNum {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Scanner br=new Scanner(System.in);
		System.out.println("Enter a number between 1 to 100");
		int n = Integer.parseInt(br.nextLine());
	    	
			for( int i=1; i<=n; i++){
				if(n%i==0)
					System.out.println(i);
				
		}
	}
}
