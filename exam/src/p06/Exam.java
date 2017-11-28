package p06;

public class Exam {                         // 구구단 예제
	public static void main(String[]args) {
		for(int i=9;i>=1;i--) {
			for(int a=9;a>=1;a--) {
				String str=i+"x"+a+"="+(i*a);
				if((i*a)%3==0) {
					str="3의배수";
					}
				System.out.print(str);
				if(a!=1) {
						System.out.print(",");
					}
			}
					System.out.println();
				}
				}
			}
			
		
		
	
	
	
	

