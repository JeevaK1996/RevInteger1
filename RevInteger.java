# RevInteger1
public class RevInteger {

	
	public static void main(String[] args) {

		int n=123;
		int a;
	int b=Integer.toString(n).length();
		for(int i=0;i<b;i++){
			a=n%10;
			System.out.print(a);
			n=n/10;
		}
	}

}
