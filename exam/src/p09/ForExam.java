package p09;

public class ForExam {

	public static void main(String[]args) {
		int [][] nums= new int[3][];
		
		int []a =new int[3];// 방 갯수 4개인데 5개로 바꿀때
		int []b =new int[4];//
		
		nums[0]=a;
		nums[1]=b;
		nums[2]=new int[5];
		
		
		for(int i=0;i<3;i++) {
			nums[0][i]=(i+1);		
		
		}
		for(int i=0;i<3;i++) {
		System.out.println(nums[0][i]);
		
		}
		System.out.println();
		
		for(int i=0;i<4;i++) {
			nums[1][i]=(i+1);		
		
		}
		for(int i=0;i<4;i++) {
		System.out.println(nums[1][i]);
		
		}
		System.out.println();
		
		for(int i=0;i<5;i++) {
			nums[2][i]=(i+1);		
		
		}
		for(int i=0;i<5;i++) {
		System.out.println(nums[2][i]);
		
		}
		System.out.println();
	}
}
