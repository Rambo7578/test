package p05;

public class df {// for if 응용 구구단, 5의 배수 안보이게 하기
	public static void main(String[] args) {
		for (int i = 9; i >= 1; i--) {
			for (int j = 9; j >= 1; j--) {
				if (i * j % 5 == 0) {
					System.out.print(" ");
				} else {
					System.out.print(i + "x" + j + "=" + i * j);
					if(j!=3) {
						System.out.print(",");
					 
				}

			}
			System.out.println();
		}

		// for(int b=9;b>=1;b--) {
		// for(int c=9;c>=1;c--) {
		// System.out.print(b+"x"+c+"="+b*c+", ");
		//
		// }

		// for(int d=9;d>=1;d--) {
		// for(int e=9;e>=1;e--) {
		// System.out.println(d+"x"+e+"="+d*e);
		// }
		// }
	}
	}
}
