package p13;

public class dddfdddddd {

	public static void main(String[] args) {
	
	Person pss = new Person();
    al.add(pss);
    pss.setAge(1);
    
    al.add(pss);
    pss.setAge(2);
    				//만약 여기에 new~~가 들어가면 방 번호는 변경 안됨
    al.add(pss);
    pss.setAge(3);
    
    al.add(pss);
    pss.setAge(4);
    
    for(int i=0;i<al.size();i++) {
       Person p = al.get(i);
       System.out.println(p.getAge());
    }
	}
