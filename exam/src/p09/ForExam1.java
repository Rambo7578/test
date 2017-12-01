package p09;

public class ForExam1 {
	public static void main(String[]args) {
		int [][] nums= new int[3][];
		
		int []a =new int[3];// 방 갯수 3개인데 4개로 바꿀때
		int []b =new int[4];//
		
		nums[0]=a;
		nums[1]=b;
		nums[2]=new int[5];
		
		int addNum=1;
		int cnt=1;
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums[i].length;j++) {
			nums[i][j]=cnt++;		
			} 
		}
		for(int i=0;i<nums.length;i++) {
			int[] num=nums[i];
			for(int j=0;j<num.length;j++) {
				System.out.print(num[j]+",");
			}
	
		System.out.println();
		
		
		
		}
	}
}
