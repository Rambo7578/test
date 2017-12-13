package p17;

import java.util.Scanner;

public class p17test {

	public static void main(String[]args) {
	int sum=0;
	int age=0;
		Scanner s=new Scanner(System.in);
		int[] num=new int[5];
		System.out.println("첫번째 입력");
		num[0]=Integer.parseInt(s.nextLine());
		System.out.println("두번째 입력");
		num[1]=Integer.parseInt(s.nextLine());
		System.out.println("세번째 입력");
		num[2]=Integer.parseInt(s.nextLine());
		System.out.println("네번째 입력");
		num[3]=Integer.parseInt(s.nextLine());
		System.out.println("다섯번째 입력");
		num[4]=Integer.parseInt(s.nextLine());
		
		
		
		for(int i=0;i<num.length;i++) {
			for(int j=i+1;j<num.length;j++) {
				if(num[i]>num[j]) {
				int tmp=num[i];
					num[i]=num[j];
					num[j]=tmp;
				}
			}
			
			}
		for(int i:num) {
			System.out.println(i);
			sum+=i;
			
		}
		System.out.println("총합 :"+sum);
		System.out.println("평균 :"+(sum/5));
		}
		}
		
		

	

