package p1202;

public class test00000003 {

	public static void main(String[]args) {
		for(int i=0;i<10;i++) {
			String str1=i+"";
			if(str1.indexOf("3")>-1||str1.indexOf("6")>-1||str1.indexOf("9")>-1)
			str1="짝";
				
			for(int j=0;j<9;j++) {
				String str2="짝";
				if(str2.indexOf("3")>-1||str2.indexOf("6")>-1||str2.indexOf("9")>-1)
					str2="짝";
			}
			System.out.print(str1);
		}
	}
	
}
