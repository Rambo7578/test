package p03;

public class CastingExam01 {
	public static void main(String[] args) {
		double d=12.3;
		int i=(int)d;  // 에러가 나는 이유는 인트가 더블보다 용량이 작기 때문이다. 이전 int i=d;를 int i=(int)d;로 수정
						//캐스팅은 작은 명령어에 큰 명령어를 넣기 위한 작업. 캐스팅..
		System.out.println("더블타입 d="+d);
		System.out.println("인트타입 i="+i);
		
		int i2=123;
		double d2=i2;
		
		long l=1234;
		int i3=(int) l;
		
		int i4=1234;
		long l2=i4;
	}
	
	
}
