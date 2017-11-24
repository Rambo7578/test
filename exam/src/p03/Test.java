package p03;

public class Test {
	String str;
	
	Test(String str){
		this.str=str;
		// 맨위에str과 Test(String str)의 str은 다르다. 같은 이름일때 구분짓는 방법 this. 또는
		//Test(String str)부분의 str의 이름을 바꾼다.
	}
	void print() {
	System.out.println(str);
	}
//	static void printInt(int a) {
//	System.out.println(a);
	
	
	
//	public static void main(String[] args) {
//		Test t= new Test("가나다ABC123");
//		t.print();
//		String str = "나 여나기있어요 나";
//		t.print(str);
//		str=str.replace("나","홍경철");
//		t.print(str);

		
		//일반 인덱스{글자 위치(숫자), 뒤에서 부터 찾고 싶으면lastIndex}
		
	
	public static void main(String[] args) {
		ObjectExam oe=new ObjectExam();
		oe.inputNums();
		GuGuDan ggd=new GuGuDan();
		ggd.printLoop(oe);;
		
		
	}
	
}