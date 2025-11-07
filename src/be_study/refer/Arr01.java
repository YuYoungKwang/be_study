package be_study.refer;

public class Arr01 {

	public static void main(String[] args) {
		
		//Array 배열
		
		int score1 = 100;
		int score2 = 50;
		int score3 = 75;
		int score4 = 80;
		int score5 = 40;
		
		int sum = 0;
		sum = score1 + score2 + score3 + score4 + score5;
		double avg = sum / 5.0;
		
		System.out.println("총점:" + sum + " 평균:" + avg);
		
		sum = sum + score1;
		sum = sum + score2;
		sum = sum + score3;
		sum = sum + score4;
		sum = sum + score5;
		
		//점수들~
		
		//studentScore
		
		//scores scoreArr scoreArray
		int[] scoreArr = { 100, 50, 75, 80, 40  };
		//index            0    1   2   3   4
		
		sum = 0;
		sum = scoreArr[0] + scoreArr[1] + scoreArr[2] + scoreArr[3] + scoreArr[4];
		avg = sum / 5.0;
		System.out.println("총점:" + sum + " 평균:" + avg);
		
		sum = sum + scoreArr[0];
		sum = sum + scoreArr[1];
		sum = sum + scoreArr[2];
		sum = sum + scoreArr[3];
		sum = sum + scoreArr[4];
		
		//index:0 1 2 3 4 
		sum = 0;
		for(int i=0; i<5; i++) {  //i: 0 1 2 3 4 
			sum = sum + scoreArr[i];
		}
		System.out.println("총점:" + sum);
		
		
//		//int[] pointArr; //단순선언
		int[] pointArr = null; //null값 초기화
		//pointArr = {30, 12, 10, 5, 1};  //불가능한 사용방법
		
		pointArr = new int[] {30, 12, 10, 5, 1};  // 사용가능
		
		pointArr = new int[5];  //사이즈(공간)을 명시하면서 생성
		
		//int n;
		//n = 30;
		
		//pointArr => 참조변수 주소를 의미
		//pointArr[2] => int 변수  
		
		//index 0 1 2 3 4
		pointArr[0] = 30;
		pointArr[1] = 12;
		pointArr[2] = 10;
		pointArr[3] = 5;
		pointArr[4] = 1;
		//pointArr[5] = 50;  사용불가  인덱스 범위 벗어남
		
		//저장하고 싶은 값 : 1 2 3 4 5
		//배열의 인덱스   : 0 1 2 3 4 
		
		for(int i=0; i<5; i++) { //i: 0 1 2 3 4  인덱스~
			pointArr[i] = i+1;   //값: 1 2 3 4 5
		}
		
		for(int i=1; i<=5; i++) { //  i: 1 2 3 4 5  값~
			pointArr[i-1] = i;	//인덱스:  0 1 2 3 4
		}
		
		
		//배열 index : 0~
		for(int i=0; i<5; i++) {  //i: 0 1 2 3 4
			System.out.print( pointArr[i] + " " );
		}
		System.out.println();
		
		System.out.println( pointArr ); //주소
		
		
		//초기값 확인
		
		int[] intArr = new int[6];
		double[] doubleArr = new double[12];
		String[] stringArr = new String[30];
		boolean[] booleanArr = new boolean[14];
		
		//for(int i=0; i<6; i++) {
		for(int i=0; i< intArr.length ; i++) {
			System.out.print(intArr[i] + " ");
		}
		System.out.println();
		
		for(int i=0; i< doubleArr.length; i++) {
			System.out.print(doubleArr[i] + " ");
		}
		System.out.println();
		
		for(int i=0; i<stringArr.length; i++) {
			System.out.print(stringArr[i] + " ");
		}
		System.out.println();
		
		for(int i=0; i<booleanArr.length; i++) {
			System.out.print(booleanArr[i] + " ");
		}
		System.out.println();
		
		
		
	}

}




