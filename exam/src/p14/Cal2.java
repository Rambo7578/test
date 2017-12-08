package p14;

import java.util.ArrayList;
import java.util.Scanner;

public class Cal2 {
	// 로또번호를 입력하고 랜덤하게 로또를 만들고
	// 자동,수동, 반자동이 선택가능하게 만들어야함
	// 로또가 끝난이후 맞춘 갯수를 출력
ArrayList<Integer> alCheck;
	
	Cal2(){
		alCheck=new ArrayList<Integer>() ;
		Scanner s=new Scanner(System.in);
		System.out.println("1. 자동, 2. 수동 3. 반자동");
		int cmd=s.nextInt();
		if(cmd==1) {
			
		}else if(cmd==2) {
			System.out.println("입력할 로또숫자를 , 를 기준으로 입력해주세요.");
			String str=s.next();
			
		}
	}
	

	public static void main(String[] args) {

	}

}
