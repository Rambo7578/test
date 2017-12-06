package p12;

import java.util.ArrayList;
import java.util.Scanner;

public class ListExam2 {

	// String으로 구성된 ArrayList를 선언해 주세요.
	// 스캐너 클래스를 이용하여 숫자를 입력받아 해당 숫자만큼 반속해서
	// ArrayList의 값을 스캐너 변수로 문자열 숫자를 입력받아주세요.
	// 중복 값이 없어야합니다.
	// 만약 중복값을 입력할 경우 중복값이 있다고 알려주고 다시 돌아야합니다.
	// ArrayList안에 값을 출력하는 함수를 2개 만들어 주시고
	// 첫번째 함수는 짝수 일때만 출력
	// 두번째 함수는 홀수 일때만 출력해주세요.

	ArrayList<String> alStr = new ArrayList<String>();

	ListExam2() {
		Scanner s = new Scanner(System.in);
		System.out.println("몇개의 숫자를 입력하실지 알려주세요.");
		int max = s.nextInt();
		for (int i = 1; i <= max; i++) {
			System.out.println(i + "번째 숫자를 입력해주세요");
			int n = s.nextInt();
			if (alStr.indexOf(n + "") != -1) {
				System.out.println(n + "값은 중복되었습니다. 다시 입력하세요");
				i--;
			} else {
				alStr.add(n + "");
			}
		}
	}

	void print0dd() {
		for(String s: alStr) {
			int num=Integer.parseInt(s);
			if(num%2==1) {
				System.out.println(num);
			}
		}
	}
	
	void printOddOrEven(int checkNum) {
		for(String s:alStr) {
			int num=Integer.parseInt(s);
			if(num%2==checkNum) {
				System.out.println(num);
			}
		}
	}
	
	
	void printEven() {
		for(String s:alStr) {
			int num=Integer.parseInt(s);
			if(num%2==0) {
				System.out.print(num);
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		ListExam2 le=new ListExam2();
		
		le.printOddOrEven(0);
		le.printOddOrEven(1);
	
		
	}

}
