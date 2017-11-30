package p08;

import java.util.Random;

public class Lotto {
	private int[] lottoNums;
	private int lottoMaxNum;
	private int checkRandomNum;
	private int[] checkLottoNums;
	
	public Lotto() {
		this.lottoNums=new int[6];
//		this.lottoMaxNum=45;
	}
	public Lotto(int lottoNumsLength) {
		this(lottoNumsLength,45);
	}
	public Lotto(int lottoNumsLength,int lottoNumsMaxNum) {
		this.lottoNums =new int[lottoNumsLength];
		this.lottoMaxNum=lottoNumsMaxNum;
	}
	
	
	void steCheckLottoNums(int[] checkLottoNums) {
		this.checkLottoNums=checkLottoNums;
	}
	
	void printMachLottomNums() {
		
	}
	void makeLottoNums() {
		Random r=new Random();
	
	for(int i=0;i<lottoNums.length;i++) {
		checkRandomNum=r.nextInt(lottoMaxNum)+1;
		if(isDupl()) {
			i--;
		}else {
			lottoNums[i]=checkRandomNum;
		}
	}
	}
	private boolean isDupl() {
	for(int i=0;i<lottoNums.length;i++) {
		if(lottoNums[i]==checkRandomNum) {
			return true;
	}
	}
	return false;
	}
	void printLottoNums() {
		for(int i=0;i<lottoNums.length;i++) {
			System.out.print(lottoNums[i]+",");
		}
	}
	
	
		public static void main(String[]args) {
		Lotto lt=new Lotto(3,10);
		lt.makeLottoNums();
		lt.printLottoNums();
		}
}
		

			
