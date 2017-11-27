package p05;

public class ArrayExam {
	public static void main(String[]args) {
		int[][] numArr=new int[3][3];
		
		for(int i=0;i<numArr.length;i++) {
			for(int j=0;j<numArr.length;j++) {
			numArr[i][j]=j+1+(i*numArr[i].length);
			
			}
		}
		
			
	
		for(int i=0;i<numArr.length;i++) {
				for(int j=0;j<numArr.length;j++) {
				System.out.print(numArr[i][j]);
				if(j!=numArr[i].length-1) {
				System.out.print(",");
				}else {
					System.out.println();
				}
			}
			
				
				
		}
	
		}	
	}



