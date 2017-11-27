package p05;

import java.util.Scanner;

public class ArrayExam01 {
	
	public static void main(String[]args) {
	// 스캐너 클래스로 구구단의 최대값을 입력하시오.
	// 입력받은 각각의 단 만큼 구구단을 출력하는 프로그램을 작성하시오.
		
		
		
		Scanner s=new Scanner(System.in);	//문자를 쓸 수 있도록 허가 내줌.
		
		System.out.println("첫번째 입력값");	//문자열 출력
		int num1 =s.nextInt();				// 숫자 입력대기
		System.out.println("두번째 입력값");	//문자열 출력
		int num2 =s.nextInt();				// 숫자 입력대기
		
		
		System.out.println();				// 의미 없음 그냥 한줄 띄게 할라고 넣음
		
		for(int i=1;i<=num2;i++) {		
			for(int j=1;j<=num1;j++) {
				System.out.print(i+"x"+j+"="+(i*j));
			if(j!=num1) {
				System.out.print(",");
				
			}else {
				System.out.println();
			}
			}
		}

		
		
	}
	
	
}
