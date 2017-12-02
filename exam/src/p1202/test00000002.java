package p1202;

public class test00000002 {
	public static void main(String[] args) {
			//369 게임2
		for (int i = 1; i <= 100; i++) {
			String str = i + "";
			str = str.replace("3", "짝");
			str = str.replace("6", "짝");
			str = str.replace("9", "짝");

			if (str.indexOf("짝") > -1) {
				if (str.equals("짝짝")) {
					System.out.print(i + ",");
				}
				System.out.print("짝,");
			} else {
				System.out.print(str + ",");
			}
			if (i % 10 == 0) {
				System.out.println();
			}

		}
	}
}