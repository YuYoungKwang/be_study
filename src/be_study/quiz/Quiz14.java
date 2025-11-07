package be_study.quiz;

import java.util.Scanner;

public class Quiz14 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		/*
		1.
		+자연수 (정수) 5개의 수를 차례대로 입력 받는다.
		몇번째 수인가요? : 그에 해당하는 수를 출력
		ex) 10 20 30 50 90
		몇번째 수인가요? 5
		결과 : 90
		*/
		
		/*
		int[] nArr = new int[5];  
		//nArr 5개공간
		//index : 0 1 2 3 4 
		
		System.out.println("숫자 정수 5개 입력하세요~");
		
		for(int i=0; i < nArr.length; i++) {  //i: 0 1 2 3 4 
			nArr[i] = scanner.nextInt();
		}
		
		System.out.print("몇번째 수인가요? : ");
		int num = scanner.nextInt();
		
		//index: 0 1 2 3 4 
		//순서  : 1 2 3 4 5 
		System.out.println("결과 : " + nArr[num-1]);
		*/
//		nArr[0] = scanner.nextInt();
//		nArr[1] = scanner.nextInt();
//		nArr[2] = scanner.nextInt();
//		nArr[3] = scanner.nextInt();
//		nArr[4] = scanner.nextInt();
		
		/*
		//배열 없이
		System.out.println("숫자 정수 5개 입력하세요~");
		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();
		int n3 = scanner.nextInt();
		int n4 = scanner.nextInt();
		int n5 = scanner.nextInt();
		
		System.out.print("몇번째 수인가요? : ");
		int num = scanner.nextInt();
		
		if(num == 1) {
			System.out.println("결과 : " + n1);
		} else if (num==2) {
			System.out.println("결과 : " + n2);
		} else if (num==3) {
			System.out.println("결과 : " + n3);
		} else if (num==4) {
			System.out.println("결과 : " + n4);
		} else if (num==5) {
			System.out.println("결과 : " + n5);
		} else {
			System.out.println("몇번째 잘못입력함.");
		}
//		} else {
//			System.out.println("결과 : " + n5);
//		}
		*/
		
		/*
		2.
		+자연수 (정수) 5개의 수를 차례대로 입력 받는다.
		받은후에 순서를 거꾸로 출력하세요.
		ex) 1 2 3 4 5
		결과 : 5 4 3 2 1
		*/
		
		//n1 n2 n3 n4 n5
		//n5 n4 n3 n2 n1
		
		/*
		int[] nArr = new int[5];
		//index
		// 0 1 2 3 4 
 		// 1 2 3 4 5 
		// 5 4 3 2 1
		// 4 3 2 1 0
		System.out.println("숫자 정수 5개 입력하세요~");
		
//		for(int i=0; i < nArr.length; i++) {  //i: 0 1 2 3 4 
//			nArr[i] = scanner.nextInt();
//		}
		
//		for(int i=4; i>=0; i--) {
//			System.out.print(nArr[i] + " ");
//		}
		
		for(int i= nArr.length-1 ; i>=0; i--) {  //i: 0 1 2 3 4 
			nArr[i] = scanner.nextInt();
		}
		
		for(int i=0; i <= nArr.length-1; i++) {
			System.out.print(nArr[i] + " ");
		}
		*/
		
		/*
		3. 4x4 배열을 생성하여, 값을 아래와 같이 저장후 출력 하시오.
		(*반복문을 사용하면 좀 더 편하게 저장이 가능합니다.)
		1   2   3   4
		5   6   7   8
		9  10 11 12
		13 14 15 16
		*/
		
		//int[][] arr = { {1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16} };
		int[][] arr = new int[4][4];
		
		//값 저장
		int n = 1;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				
				// i: 0 0 0 0 1 1 1 1 2 2 2 2 3 3 3 3
				// j: 0 1 2 3 0 1 2 3 0 1 2 3 0 1 2 3
				// n: 1 2 3 4 5 6 7 8 9 ...         16
				// arr[0][3] = 4   arr[1][3] = 8    arr[3][3] = 16
				
				arr[i][j] = n;  // 1씩 증가하면서 저장
				n++;
				//n = n + 1;
				
//				arr[i][j] = i*4 + (j+1);  // i j 를 활용한 수식
				
				// arr[i][j] = n++;
			}
		}
		
		//값 출력
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				//System.out.print(arr[i][j] + " ");
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
		
	}

}
