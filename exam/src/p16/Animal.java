package p16;

public class Animal implements Action {

	public String name;
	public int age;
	public int height;
	
	
	@Override
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + ", height=" + height + "]";
	}
	@Override
	public void eat() {
		System.out.println(this.name+" 타베루!");
		
	}
	@Override
	public void sleep() {
		System.out.println(this.name+" 네루!");
		
	}
	@Override
	public void walk() {
		System.out.println(this.name+" 아루쿠!");
		
	}

	
	
}
