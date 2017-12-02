package p1202;

public class test00000005 {
	public static void main(String[]args) {
		String str="123가456"; //숫자만 가져 오는 방법    * 1."가"라는글자를 기준으로 앞뒤로 자르기
		
		System.out.println(str.replace("가",""));  // * 2. 번째 방법  replace (치환기능)
		
		
		int idx=str.indexOf("가"); // "글자 의 위치를 찾는 함수 indexOf()  원하는 글자를 기준점으로 만든다??
		
		
		System.out.println("가의 위치는  : "+ idx);
		
		System.out.println(str.substring(0,idx));
		
		System.out.println(str.substring(idx+1));
		
		str=str.substring(0,idx)+str.substring(idx+1);
}
}