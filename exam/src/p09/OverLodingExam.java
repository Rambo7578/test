package p09;

public class OverLodingExam {

	public int getInt() { //상속 부모
		return 1;
	}
	public void getInt(int a) {
		
	}
	
	public static void main(String[]args) {
		OverLodingExam ole=new OverLodingExam();
		int a=ole.getInt();
		
		
	}
}
