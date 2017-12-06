package p12;

import java.util.HashMap;

public class MapExam {

	HashMap<Integer,String> hm=new HashMap<Integer,String>();
	
	void add(String str) {
		hm.put(hm.size(), str);
	}
	void add(int idx) {
		hm.put(idx, hm.size()+1);
	}
	
	
	
	public static void main(String[]args) {
		MapExam me=new MapExam();
		for(int i=0;i<10;i++) {
			me.add((i+1)+"번째값");
		}
		System.out.println(me.hm);
	}
	
	
}
