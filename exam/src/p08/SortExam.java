package p08;

public class SortExam {// 중복체크/

	public static void main(String[] args) {

		// int[] nums= {1,2,2,3,4};
		// int cnt=0;// 중복난것을 임시로 저장하는 곳.
		// for(int j=0;j<nums.length;j++) {
		// int idx=j;
		// int num= nums[idx];
		// for(int i=idx+1;i<nums.length;i++) { //마지막은 포문이 돌지 않아서 에러 안남.
		// if(num==nums[i]) {
		// System.out.println("겹쳐!");
		// }
		// }
		//
		// }
		// System.out.println("겹치는갯수!"+cnt);
		//

		// 위의 것이랑 같은것임

		// int[] nums= {1,2,2,3,4};
		// int cnt=0;// 중복난것을 임시로 저장하는 곳.
		// for(int j=0;j<nums.length;j++) {
		// for(int i=j+1;i<nums.length;i++) { //마지막은 포문이 돌지 않아서 에러 안남.
		// if(nums[j]==nums[i]) {
		// cnt++;
		// System.out.println("겹쳐!");
		// }
		// }
		//
		// }
		// System.out.println("겹치는갯수!"+cnt);
		//

		
		//겹치는 번호가 몇번인지 까지 아는 코딩
		int[] nums = { 1, 2, 2, 3, 3, 4 };
		int cnt = 0;// 중복난것을 임시로 저장하는 곳.
		
		String duslStr="";
		
		for (int j = 0; j < nums.length; j++) {
			for (int i = j + 1; i < nums.length; i++) { // 마지막은 포문이 돌지 않아서 에러 안남.
				if (nums[j] == nums[i]) {
					cnt++;				
					duslStr+=nums[i]+",";
					System.out.println("겹쳐!");
				
				
				}
			}

		}
		System.out.println("겹치는갯수!" + cnt);
		System.out.println("겹치는숫자~~~~!" + duslStr);
	}
}
