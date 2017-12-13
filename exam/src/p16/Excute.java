package p16;

public class Excute {
	
	public void printAction(Action act) {
		//eat 호출시 누구누가가 먹습니다.
		act.eat();
		//sleep 호출시 누구누구가 잡니다.
		act.sleep();
		//walk호출시 누구누구가 걷습니다.
		act.walk();
	}
	
	public static void main(String[]args) {
		Action p=new Hong("Hong",20,173,"hong@gmail.com");
		Excute e=new Excute();
		Cat c=new Cat("냥코",2,30);
		e.printAction(c);
		//동물도 이름,나이,몸길이를 가지게 만들어 주시구요
		//cat생성자 호출시 이름 나이 몸길이를 저장하게 만들어주세요.
		
		
	}

	

}
