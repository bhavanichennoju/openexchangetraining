
public class Fibonacci {

	public static void main(String[] args) {
		int n=10;
		int a=0;
		int b=1;
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<=n;i++) {
			sb.append(a+" ");
			int c=a+b;
			a=b;
			b=c;
			
		}
		System.out.println(sb);
		
		

	}

}
