package p17;

import java.util.Scanner;

public class dsdsds {

	Scanner s = new Scanner(System.in);
	String str = new String();
	char[] ch;

	dsdsds() {
		System.out.print("입력");
		str = s.nextLine();//string
	}
	
	void change() {
		ch=str.toCharArray();
		int a=ch.length-1;//6->5
		char tmp=0;
				//0		5
		for(int i=0;i<ch.length;i++) {
			//0	 <-  0
			tmp=ch[i];
			//5 <-   5
			ch[i]=ch[a];
			//0 <- 0             i           a 
			ch[a]=tmp;        // 0 1 2 3 4 5 6
			// 0  6	  0  6       s t r i n g m
			if(i==a ||i>a) {  //m t r i n  g s
				
				break;
			}
			
			
			a--;
		}
		
		
	}
	
	

	public static void main(String[] args) {

		
		
	}

}
