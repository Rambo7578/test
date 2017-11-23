package p02;

public interface Operator {
	/**
	 * @param agrs
	 */
	public static void main(String[] agrs) {
		int a=3;
		int b=a;
		int c= b;
		
		if(a==b) {
				System.out.println("a와 b는 같습니다");
		
		}
		
		
		for(int i=1;i<10;i++) {
			if(i%2==0) {
				System.out.println((i+1)+"a와 b는 같습니다.");
				
			}
		}
			for(int i=10;i>0;i--) {
				if(i%2==1) {
					System.out.println((i)+"a와 b는 같습니다");
				}
			}	

			int len=7;
			String[] strArr=new String[len];
			for(int i=0;i<7;i++) {
				strArr[i]=(i+1)+"0";
				System.out.println("strArr["+i+"]="+strArr[i]);
			}
			
			for(int i=0;i<7;i++) {
				strArr[i]=(i+1)+"0";
				System.out.println("strArr["+i+"]="+strArr[i]);
			}
			
			
			for(int i=10; i<=100; i+=10) {
				System.out.println(i);

				//for(지정값, 법위, 조건)
	}
			for(int i=100; i<0; i-=5) {
			System.out.println(i);
		}
		
			for(int i=10; i<=100; i+=10) {
				System.out.println(i-5);
			
			}
			for(int i=100; i>0; i-=5) {
				System.out.println(i);
	}
}
}

