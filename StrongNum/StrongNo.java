
public class StrongNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=125;
		int n1=n;
		int no=0;
		for (; n!=0;){
			int r = n%10;
			int x=1;
			
			for(int i=1; i<=r ; i++){
				x=i*x;
			}
			no = no+x;
			n=n/10;
		}
		System.out.println("Result is  " + no);
		if (n1==no)
			System.out.println(n1 + " It is a Strong Number");
		else
			System.out.println(n1 +"  Is not a Strong Number");

	}

}
