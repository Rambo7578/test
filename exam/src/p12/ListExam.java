package p12;

import java.util.ArrayList;
import java.util.Scanner;

public class ListExam {

	private ArrayList<String> alStr ;

	ListExam() {
		alStr = new ArrayList<String>();
	}
	
	//처음 alStr변수에 값을 add했을때는 '처음값을 추가 하셨군요'라는 메세지
	//처음이 아니라면 바로 전에 입력한 값을 출력해 주세요.
	void intPutAlStr() {
		Scanner s=new Scanner(System.in);
		System.out.println("숫자 스트링을 넣어주세요. 구분자는  ,  입니다.");
		String str=s.nextLine();
		
		
		
//		String str="123,3456,";
//		String[] strs= str.split(",");
//		for(String ss:strs) {
//			System.out.print(ss);
//		}
	}
	
	
	
	
	void add(String str) {
		if(alStr.size()==0) {
			System.out.print("처음");
		}else {
			System.out.print(alStr.get(alStr.size()-1));
		}
		alStr.add(str);
	}

	String get(int idx) {
		return alStr.get(idx);
	}
	void remove(int idx) {
		alStr.remove(idx);
		
	}

	
	
//	void printAlStr() {
//		for(String s :alStr) {
//			System.out.println(s);
//		}
//		for(int i=0;i<alStr.size();i++) {
//			
//			System.out.println(i+"번째값"+alStr.get(i));
//		}
//	
//	}
	void alStr() {
		for(int i=0;i<10;i++) {
			if(Integer.parseInt(alStr.get(i)%2==0){
				remove(i);
				i--;
			}else {
				System.out.println(i+"번째 값 : "+alStr.get(i));
			}
		}
	}
	
	void printAlStr2() {
		for(int i=0;i<alStr.size();i++) {
			String numSrt=alStr.get(i);
			System.out.println(i+"번째값:"+numStr);
		}
	}
}
