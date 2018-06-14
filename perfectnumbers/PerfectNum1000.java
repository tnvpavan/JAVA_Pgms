package perfectnumbers;

// Finding Perfect Numbers Between 1 to 1000 :


//import java.io.BufferedReader;
//import java.io.InputStreamReader;

public class PerfectNum1000 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		/*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter num between 1 to 1000 : ");
		int i = Integer.parseInt(br.readLine());*/
		
		int no=0;
		for(int i=1 ;i<=1000; i++){
			no=0;
			for(int j=1;j<i; j++){
				if(i%j==0)
					no = no+j;
			}
			if (no==i)
				System.out.println( i +",");
			
		}

	}

}
