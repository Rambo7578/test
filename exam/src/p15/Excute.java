package p15;

import java.util.ArrayList;

public class Excute {
			
	public static void main(String[]args) {
	Controller c=new Controller();
	
	for(int i=1;i<=5;i++) {
		User user=new User("이름"+i,i,i);
		e.get("add",user);
	}
	User user=new User("모모",20,2);
	e.get("update",user);
	System.out.println("수정결과 :");
	for(User u:userList) {
		System.out.println(u);
	}
	e.get("add",userList);
	}
}
