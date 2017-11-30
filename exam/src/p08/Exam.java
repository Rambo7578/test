package p08;

public class Exam {
	public static void main(String[]args) {
		int[] num1= {1,2,3};
		int[] num2= {2,3,4};
		
		int cnt=0;
		for(int i=0;i<num2.length;i++) {
			int checkNum = num1[i];
			for(int j=0;j<num2.length;i++) {
			if(num2[j]==checkNum) {
				cnt++;
			
			System.out.println(num2[j]+"=="+checkNum+":"+(num2[j]==checkNum));
		}
		}
		}
			System.out.println("num1과 num2가 같은 값을 가진 갯수는"+cnt);

	}
	
	
}
