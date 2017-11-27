package p05;

import java.util.Scanner;

public class TotalExam {
	
		int a;//정해져있는 데이터타입
		Integer ac;
		boolean b;//정해져있는 데이터타입
		Boolean bc;
		
		public static void main(String[]args) {
		
		TotalExam te = new TotalExam();
			if(te.a==1|| te.a==2|| te.a==3) {
				System.out.print("a가 0이 아니네요");
			}else if(te.a==0);{
			System.out.print("a가 0이 네요");
		}	
			System.out.print(Integer.parseInt("167")==167);//Interger.parseInt는 문자를 숫자로 바꿔준다.
			System.out.print(Double.parseDouble("3.14"));
		
		// String랑 String[]스트링 배열은 전혀 다른다.
			
			System.out.println("스트링배열 변수의 방 갯수를 입력해주세요");
			Scanner s =new Scanner(System.in);
			int length = s.nextInt();
			
			String[] strArr=new String[length];
			
//			for (int i=0;i<strArr.length;i++) {
//				System.out.println((i+1)+"번째 방의 값을 입력해주세요");
//				strArr[i]=s.nextInt()+"";
			
			
			for (int i=0;i<strArr.length;i++) {
				System.out.println((i+1)+"번째 방의 값을 입력해주세요");
				
			}
			
		
		}
}


