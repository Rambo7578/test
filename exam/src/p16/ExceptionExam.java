package p16;

import java.util.Scanner;

public class ExceptionExam {

	public void convertAndPrint(String numStr)throws Exception {
		
		System.out.print(Integer.parseInt(numStr));
	
	}
	public static void main(String[]args) {
		
		ExceptionExam ee=new ExceptionExam();
		System.out.println("숫자 적어줘");
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		try {
			ee.convertAndPrint(str);
		} catch (Exception e) {
			System.out.println("숫자좀 적어주세요");
			System.out.println("출력할 숫자 적어줘");
			str=s.nextLine();
			try {
				ee.convertAndPrint(str);
			}catch(Exception e1) {
				System.out.println("숫자좀 적어주세요");
			}
		}
		
	}
	
	
}
