package p15;

public class User {
	
	private String name;
	private int age;
	private int no;
	public User(int no) {
		this.no=no;	
	}
	
	public User(String name,int age,int no) {
		this.name=name;
		this.age=age;
		this.no=no;
		
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	//=====================================
	public int getNo() {
		return no;
	}
	public void setNo(int age) {
		this.age = no;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
	

}
