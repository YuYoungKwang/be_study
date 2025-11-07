package be_study.refer;

public class Arr02 {

	public static void main(String[] args) {
		
		// int
		// int[]
		// int[][]
		// int[][][]
		
		int n = 10;  //  ㅁ
		int[] nArr1 = new int[5]; //  ㅁㅁㅁㅁㅁ
		
		int[][] nArr2 = new int[3][5]; 
		
		/*  0 123 4
		0	ㅁㅁㅁㅁㅁ
		1	ㅁㅁㅁㅁㅁ
		2	ㅁㅁㅁㅁㅁ
		 */
		
		int[][] nArr3 = new int[4][3];
		/*  01 2
		 0	ㅁㅁㅁ
		 1	ㅁㅁㅁ
		 2	ㅁㅁㅁ		nArr3[3][0]
		 3	ㅁㅁㅁ		nArr3[1][2]
		 */
		
		int[] nArray1 = {1,2,3,4,5,6};
		int[][] nArray2 = { {1,2,3}, {4,5,6}  };
		//	ㅁㅁㅁ	1 2 3
		//	ㅁㅁㅁ   	4 5 6 
		
		int[][] nArray3 = { {1,2}, {3,4}, {5,6}  };
		//	ㅁㅁ		1 2
		//	ㅁㅁ		3 4 
		//	ㅁㅁ		5 6 
		
		System.out.println(nArray2[0][2]);
		
		int[][] nArray4 = new int[2][3];
	
		
		//2행 3열 nArray2 출력
		// nArray2[2][3]
		//for(int i=0; i< 2; i++) {
		for(int i=0; i< nArray2.length; i++) {
			//for(int j=0; j<3; j++) {
			for(int j=0; j < nArray2[i].length; j++) {
				System.out.print(nArray2[i][j] + " ");
				// i : 0 0 0 1 1 1
				// j : 0 1 2 0 1 2
				// nArray2[0][0]	nArray2[0][1]	nArray2[0][2]
				// nArray2[1][0]	nArray2[1][1]	nArray2[1][2]
			}
			System.out.println();
			
		}
	}

}
