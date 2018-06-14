package perfectnumbers;

// Finding Perfect Numbers Between 1 To 100 ;

public class PerfNum1To100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=0;
		for( int i=1;i<=100;i++){
			no=0;
			for( int j=1; j<i;j++){
				if(i%j==0)
					no = no+j;
			}
				if(i==no)
					System.out.print(i + ",");
				
		}
	}
}
