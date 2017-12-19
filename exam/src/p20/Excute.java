package p20;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Excute {

	
	public static void main(String[]args) {
		Service s=new Service();
		LinkedHashMap<String,Object >hm= new LinkedHashMap<String,Object >();
//		hm.put("12", "34");
//		int result = s.updateClassInfo(hm);
//		if(result==1) {
//			System.out.println("업데이트 잘됨");
//		}
		
//		hm.put("sd", "test");
//		int result = s.deleteClassInfo(hm);
//		if(result==1) {
//			System.out.println("업데이트 잘됨");
//		}
		
		hm.put("sd", "sd");
		ArrayList<HashMap<String,Object>> result = s.printClassInfo(hm);
		if(result==null) {
			System.out.println("업데이트 잘됨");
		}
		
		
	}
}


//입력,출력,삭제