package p16;

import java.util.Scanner;

public class Exam1 {//ㅋㅋ 내가 한거 ..ㅎㅎ

	 //1. 총 5명의 학생의 점수를 Scanner 클래스의 nextLine()함수를 사용하여
	//입력받아 총점과 평균을 구하고 점수가 낮은 순서대로 출력해주세요.,
	//ex)입력순서가 50점 60점 30점 70잠 100점 이였다면
	//30 50 60 70 100 <====점수가 낮은 순서대로 출력
	
	
	
	public static void main(String[]args) {
		String a="";
		String b="";
		String c="";
		String d="";
		String e="";
		
		Scanner s=new Scanner(System.in);
		System.out.print("1번");
		 a=s.nextLine();
		 System.out.print("2번");
		 b=s.nextLine();
		 System.out.print("3번");
		 c=s.nextLine();
		 System.out.print("4번");
		 d=s.nextLine();
		 System.out.print("5번");
		 e=s.nextLine();
		
		 int a1=Integer.parseInt(a);
		 int a2=Integer.parseInt(b);
		 int a3=Integer.parseInt(c);
		 int a4=Integer.parseInt(d);
		 int a5=Integer.parseInt(e);
		 
		 int tmp=0;
		 int tmp1=0;
		 int[] nums= {a1,a2,a3,a4,a5};
		 for(int i=0;i<nums.length;i++) {
			 tmp=i;
			 tmp1+=i;
			 
			 
		 }
		
	}
	
}
