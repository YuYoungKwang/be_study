package be_study.quiz;

import java.util.Scanner;

public class Quiz21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		1.
		두 개의 주사위를 던졌을 때, 두 눈의 합이 6이 되는
		모든 경우의 수를 출력하는 프로그램을 작성하시오.
		
		주사위1 : 1 ~ 6
		주사위2 : 1 ~ 6
		*/
		
		for(int i=1; i<=6; i++) { //주사위1 : 1 ~ 6
			for(int j=1; j<=6; j++) { //주사위2 : 1 ~ 6
				if(i+j == 6) {
					System.out.printf("[%d, %d]\n", i, j);
				}
			}
		}
		
		
		/*

		2.
		로또 번호 6개 랜덤하게 생성하기. ( 1~45 중 )
		최종 6개의 번호는 6칸의 배열에 저장되어야 한다.
		로또 번호는 동일한 번호가 중복되어 들어갈 수 없다.
		1) Math.random() 활용
		2) int[] lotto = new int[6]; 활용
	

		번호 6개 모으기
		-> 일단 6개 전체 뽑고 중복돼? -> 다시 뽑아
		
		번호 6개를 1개씩 순서대로 모으기
			-> 하나 뽑고 
				-> 기존에 같은 숫자 있어? 그럼 다시뽑아
				-> 기존에 같은 숫자 없어? 그럼 다음 숫자 진행
			-> 언제까지? 6개 다 뽑을때까지
			-> 그럼 지금 몇개 뽑은 상태인데? -> 관리
			 
		ㅁ	ㅁ	ㅁ	ㅁ	ㅁ	ㅁ
		0	0	0	0	0	0
		
		20
			30	35	15	45
							10
							
		정렬
		10	15	20	30	35	45	
		
		 */
		
		
		int[] lotto = new int[6]; //6칸  index: 0 1 2 3 4 5  |  6 
		int index = 0;
		boolean isDuplicated = false; //중복인가?
		
		//while문 + 흐름을 그대로 코드화
		while(true) {
			
			//랜덤 값 뽑기
			int value = (int)(Math.random()*45) + 1;
			
			//기존에 뽑힌거에 중복 체크
			isDuplicated = false;
			
			for(int i=0; i<index; i++) {  //index:3 (4번째칸)    1 2 3 칸 0 1 2 
				if( lotto[i] == value) { //중복된 케이스 확인
					//중복된게 있네?
					isDuplicated = true;
				}
			}
			
			//중복여부?
			/*
			if(isDuplicated) { //중복있으면 저장안하고 다시 뽑는 과정
				continue;
			} else { 				//중복없으면 저장하고 다음 차례
				lotto[index] = value;
				index++;
			}
			*/
			
			/*
			if(isDuplicated) { //중복있으면 저장안하고 다시 뽑는 과정
				continue;
			}
			
			lotto[index] = value;
			index++;
			*/
			
			if(isDuplicated == false) {
				lotto[index] = value;
				index++;
			}

			//6칸 다 채웠어? -> 종료 break
			if(index == 6) {
				break;
			}
			
		}
		
		for(int i=0; i<lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
		System.out.println();
		
		
//		//단순 랜덤만 수행 -> 중복될 수 있음
//		for(int i=0; i<lotto.length; i++) {
//			lotto[i] = (int)(Math.random()*45) + 1; //1~45 
//		}
		
		//for문 활용 구조
		lotto = new int[6]; // 0 0 0 0 0 0 
		
		for(int i=0; i<6; i++) {
			lotto[i] = (int)(Math.random()*45) + 1;
			
			for(int j=0; j<i; j++) {
				if(lotto[i] == lotto[j] ) { //같은거(중복) 나온다?
					i--;
					break;
				}
			}
		}
		
		for(int i=0; i<lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
		System.out.println();
		
		
		
		/*
		3.
		우리 학원은 3개의 반이 있으며, 한 반에 5명씩 공부하고 있다.
		반 순서별로 5명의 점수를 입력받아서 저장해서 관리하도록 하며,
		각 반별 점수의 평균과 전체의 평균을 출력할 수 있도록 코드를 작성하시오.
		(*가능한 효율적인 구조를 생각해보세요)

		ex)
		1반 : 10 10 10 10 10
		2반 : 20 20 20 20 20
		3반 : 30 30 30 30 30

		1반 평균 : 10
		2반 평균 : 20
		3반 평균 : 30
		전체 평균 : 20
		
		1반[5]
		2반[5]
		3반[5]
		
		전체 반 통합 [3][5] 
		
		각반 별 총합 / 각반학생수(5)
		전체 총합 / 전체학생수(15)
		*/
		int[][] scoreArr = new int[3][5];
		// i:0 ㅁㅁㅁㅁㅁ  1반
		// i:1 ㅁㅁㅁㅁㅁ  2반
		// i:2 ㅁㅁㅁㅁㅁ  3반
		
		/*
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<scoreArr.length; i++) {
			System.out.print(i+1+ "반 : ");
			for(int j=0; j<scoreArr[i].length; j++) {
				scoreArr[i][j] = scanner.nextInt();
			}
		}
		
		int total = 0;
		int classTotal = 0;
		for(int i=0; i<scoreArr.length; i++) {
			
			classTotal = 0;
			for(int j=0; j<scoreArr[i].length; j++) {
				classTotal += scoreArr[i][j];
			}
			total += classTotal;
			System.out.println(i+1+ "반 평균 : " + (classTotal/5.0));
		}
		System.out.println("전체 평균 : " + (total/15.0));
		*/
		/*


		4. 주어진 2차원 배열보다 행과 열이 1씩 큰 배열을 선언하여,
		각 행의 합과 각 열의 합, 마지막에는 전체의 합이 출력되도록 프로그램을 작성하시오.

		ex)
		int[][] arr =
		{
		{10, 20, 30},
		{20, 30, 40},
		{30, 40, 50}
		};
		이 주어지는 경우 최종 결과는
		10 20 30 60
		20 30 40 90
		30 40 50 120
		60 90 120 270
		
		
		[3][3]
		[4][4] 
		각행의 마지막 열 인덱스
		각열의 마지막 행 인덱스
		전체 마지막 행/열 인덱스
		*/
		int[][] arr =
				{
					{10, 20, 30},
					{20, 30, 40},
					{30, 40, 50}
				};
		
		int[][] newArr = new int[4][4];
		
		
		for(int i=0; i<3; i++ ) {
			for(int j=0; j<3; j++) {
				newArr[i][j] = arr[i][j];
				
				newArr[i][3] += arr[i][j]; //본인 행의 마지막 열
				newArr[3][j] += arr[i][j]; //본인 열의 마지막 행
				newArr[3][3] += arr[i][j]; //제일 마지막 칸 (마지막 열, 마지막 행)
			}
		}
		
		for(int i=0; i<4; i++ ) {
			for(int j=0; j<4; j++) {
				System.out.printf("%4d", newArr[i][j] );
			}
			System.out.println();
		}
	}
			

}
















