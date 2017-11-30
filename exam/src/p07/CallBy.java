package p07;

public class CallBy {
	
	void doFunc(int [] a, int[] b) {
		a[0]=3;
	}
	
	public static void main(String[]args) {
		int [] a = new int[1];
		int [] b = new int[2];
	
		CallBy cb= new CallBy();
		cb.doFunc(a, b);
		System.out.println(a[0]);
		
	}
	
	
}
