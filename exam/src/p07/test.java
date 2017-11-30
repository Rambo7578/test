package p07;

import java.util.Scanner;

public class test {
	public static void main(String[]args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("몇 단 뽑아줘?");
		int num1=scanner.nextInt();
		
		System.out.print("몇 단 까지?");
		int num2=scanner.nextInt();
		
		for(int i=1;i<=num2;i++) {
			System.out.println(num1+"x"+i+"="+(num1*i)+" ");
		}
		
		
		
			
		
	}
	
	
	
}
