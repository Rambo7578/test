package p12;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ArrayTest1 {

	int max=0;
	int min=0;
	
	StringList(){
		sl=new ArrayList<Integer>();
		Scanner s= new Scanner("최대");
		min=s.nextInt();
		Scanner s= new Scanner("최소");
		max=s.nextInt();
		
	}
	void insiSl() {
		Random r=new Random();
		for(int i= min;i<=max;i++) {
			int n=(r.nextInt(max-min)+1);
			if(sl.size()==(max-min)/2) {
				i=max;
				}
			if(n%2==0) {
				sl.add(n);
			}else {
				
			}
		}
	}
	
	public static void main(String[]args) {
		
	
		
	}
	
	
}
