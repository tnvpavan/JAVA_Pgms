import java.io.BufferedReader;
import java.io.InputStreamReader;
//finding strong numbers within the entered value

public class StrongNum1toN {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Enter value of n: ");
		int n = Integer.parseInt(br.readLine());
		// int n1=n;
		//int tot=0;
		for(int i=1; i<=n; i++){
			int tot=0;
			int k=i;
			for(;k!=0;){
			int r =k%10;
			int x=1;
			for(int j=1;j<=r;j++){
				x=j*x;
			}
			tot = tot+x;
			k=k/10;
		}
			
		if(i==tot)
			System.out.println(i +",");
		
	}
		
		
}
}