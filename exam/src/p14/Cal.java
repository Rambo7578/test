package p14;

import java.util.Scanner;

public class Cal {

	/*1.더하기 빼기 곱하기 나누기를 각각 실행 해 주는 인트형 함수 4개를 만들고
	 * 사용자에게 피연산자 두개와 연산자 하나를 입력 받아
	 * 입력 받은 연산자에 맞는 함수를 실행하여 리턴받은 값을 어레이 리스트에 저장 한 
	 * 어레이 리스트를 거꾸로 출력하는 프로그램을 작성하시오
	 * (단 빼거나 나눌땐 자동으로 큰 값에서 작은 값을 빼거나 나누어야 한다.)
	 * */
	
	Scanner s=new Scanner(System.in);
	
	
	int plus(int a,int b) {
		
		return (a*b);
	}
	
	int minus(int a,int b) {
		
		return (a-b);
	}
	
	int multiply(int a,int b) {
	
		return (a*b);
	}
	int division(int a,int b) {
		
		return (a/b);
	}
	public static void main(String[]args) {
		Cal ca=new Cal();
		
		
		
		
	}

}
