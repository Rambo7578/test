package p05;

import java.util.Scanner;

public class ArrayExamTest1 {
	int num1;
	int num2;
	int[][] numArr;
	
	void inputNums() {
		Scanner scanner;
		
		scanner =new Scanner(System.in);
		
		System.out.print("첫번째 입력해");
		num1=scanner.nextInt();  			
		System.out.print("두번째 입력해");
		num2=scanner.nextInt();				
	}
	
	void initNumArr() {
		
		
	}
	
	public static void main(String[]args) {
		Scanner scanner;
		ArrayExam ae=new ArrayExam();
		
		Scanner s=new Scanner(System.in);
		
		
		
		int[][] numArr=new int[3][3];
		
		for(int i=0;i<numArr.length;i++) {
			for(int j=0;j<numArr.length;j++) {
			numArr[i][j]=j+1+(i*numArr[i].length);
			
			}
		}
		
			
		
		for(int i=0;i<numArr.length;i++) {
				for(int j=0;j<numArr.length;j++) {
				System.out.print(numArr[i][j]);
				if(j!=numArr[i].length-1) {
				System.out.print(",");
				}else {
					System.out.println();
				}
			}
			
				
				
		}
	
		}	
	}



