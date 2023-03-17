@FunctionalInterface
public interface Adds {
	int sum(int a,int b);
	 
	
	default int diff(int c,int d) {
		return c-d;
		
	};
}
