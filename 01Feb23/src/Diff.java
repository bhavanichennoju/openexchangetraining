
public class Diff implements Adds{

	public static void main(String[] args) {
	Adds ad=(a,b)->a+b;
	int result=ad.sum(3, 7);
	System.out.println(result);

	int results=ad.diff(5, 7);
	System.out.println(results);
	}

	@Override
	public int sum(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

}
