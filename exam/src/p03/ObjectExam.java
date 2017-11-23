package p03;

import java.util.Scanner;

public class ObjectExam {
	int num1;
	int num2;//맴버변수, 최상위 변수
	
	ObjectExam(){
	System.out.println("기본 생성자를 호출 하셨군요!");
	}
	void add() {
		System.out.println("ObjectExam의 num1="+num1);
		System.out.println("add()함수 호출 했구나");
	}
	
	int getnum2(int num2) {
		return num2;
		
	}
	
	void inputNums() {
		Scanner s=new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력해 주세요 : ");
		num1=s.nextInt();
		System.out.println("두번째 숫자를 입력해 주세요 : ");
		num2=s.nextInt();
	}
	
	
	
	
	int getNum2(int num2) {
		return num2;

	}
		void printLoop() {
			for(int i=num1;i<num2;i++) {
				System.out.println(i);
				if(i%10==0) {
					System.out.println("");
			}
			System.out.println(num2);
		}
		
	}
	public static void main(String[] args) {
		ObjectExam o = new ObjectExam();
		
	
	
	}
}
