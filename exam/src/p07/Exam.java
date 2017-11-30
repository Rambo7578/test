package p07;

import java.util.Scanner;

public class Exam {                         // 구구단 예제
	int num1;
	int num2;
	int num3;
	int num4;
	int num5;
	
	void inputNums() {
	Scanner s=new Scanner(System.in);
	
	int num1=s.nextInt();
	int num2=s.nextInt();
	
	int num3=s.nextInt();
	int num4=s.nextInt();
	
	int num5=s.nextInt();
	
	}
	void print() {
		for(int i=num1;i>=num2;i--) {
			for(int a=num3;a>=num4;a--) {
				String str=i+"x"+a+"="+(i*a);
				if((i*a)%num5==0) {
					str=num5+"의배수";
					}
				System.out.print(str);
				if(a!=1) {
						System.out.print(",");
					}
			}
					System.out.println();
				}
				}
	public static void main(String[]args) {
	Exam e = new Exam();
	e.inputNums();
	e.print();
	
	}		
	}
			
		
		
	
	
	
	

