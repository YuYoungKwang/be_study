package be_study.quiz;

import java.util.Scanner;

public class Quiz21 {

	public static void main(String[] args) {
//		1.
//		두 개의 주사위를 던졌을 때, 두 눈의 합이 6이 되는
//		모든 경우의 수를 출력하는 프로그램을 작성하시오.
//
		for(int i = 1; i <= 6; i++) {
			for(int j = 1; j <= 6; j++) {
				if(i + j == 6) {					
					System.out.println(i + " + " + j + " = " + (i+j));
				}
			}
		}
		
//		2.
//		로또 번호 6개 랜덤하게 생성하기. ( 1~45 중 )
//		최종 6개의 번호는 6칸의 배열에 저장되어야 한다.
//		로또 번호는 동일한 번호가 중복되어 들어갈 수 없다.
//		1) Math.random() 활용
//		2) int[] lotto = new int[6]; 활용
//
//
		int[] lotto = new int[6];
		for(int i = 0; i < 6; i++) {
			lotto[i] = (int)(Math.random()*45) + 1;
			for(int j = 0; j < 6; j++) {
				if(i != j) {
					if(lotto[i] == lotto[j]) {
						i--;
						break;
					}
				}
			}
		}
		for(int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
//		3.
//		우리 학원은 3개의 반이 있으며, 한 반에 5명씩 공부하고 있다.
//		반 순서별로 5명의 점수를 입력받아서 저장해서 관리하도록 하며,
//		각 반별 점수의 평균과 전체의 평균을 출력할 수 있도록 코드를 작성하시오.
//		(*가능한 효율적인 구조를 생각해보세요)
//
//		ex)
//		1반 : 10 10 10 10 10
//		2반 : 20 20 20 20 20
//		3반 : 30 30 30 30 30
//
//		1반 평균 : 10
//		2반 평균 : 20
//		3반 평균 : 30
//		전체 평균 : 20
//
//
		System.out.println();
		Scanner scanner = new Scanner(System.in);
		int classScore = 0;
		int totalScore = 0;
		int[] classScoreAvr = new int[3];
		int[][] score = new int[3][5];
		for(int i = 0; i < score.length; i++) {
			System.out.print(( i + 1 ) + "반의 성적을 입력해주세요.(5명) : ");
			for(int j = 0; j < score[i].length; j++) {
				score[i][j] = scanner.nextInt();
				classScore += score[i][j];
				
				classScoreAvr[i] = classScore/5;
			}
			totalScore += classScore;
			classScore = 0;
		}
		
		for(int i = 0; i < classScoreAvr.length; i++) {
			System.out.println((i + 1)+"반 평균 :"+classScoreAvr[i]);
		}
		System.out.println("전체 평균 :"+(double)totalScore/15);
		
//		4. 주어진 2차원 배열보다 행과 열이 1씩 큰 배열을 선언하여,
//		각 행의 합과 각 열의 합, 마지막에는 전체의 합이 출력되도록 프로그램을 작성하시오.
//
//		ex)
//		int[][] arr =
//		{
//		{10, 20, 30},
//		{20, 30, 40},
//		{30, 40, 50}
//		};
//		이 주어지는 경우 최종 결과는
//		10 20 30 60
//		20 30 40 90
//		30 40 50 120
//		60 90 120 270
		
		int[][] arr =
		{
			{10, 20, 30},
			{20, 30, 40},
			{30, 40, 50}
		};
		int[][] resultArr = new int[4][4];
		for(int i = 0; i < arr.length; i++) {
			int rowSum = 0;
			for(int j = 0; j < arr.length; j++) {
				resultArr[i][j] = arr[i][j];
				rowSum += arr[i][j];
			}
			resultArr[i][3] = rowSum; 
		}
		int totalSum = 0;
		for(int j = 0; j < arr.length; j++) {
			int colSum = 0;
			for(int i = 0; i < arr.length; i++) {
				colSum += arr[j][i];
			}
			resultArr[3][j] = colSum;
			totalSum += colSum;
		}
		resultArr[3][3] = totalSum;
		
		for(int i = 0; i < resultArr.length; i++) {
			for(int j = 0; j < resultArr.length; j++) {
				System.out.print(resultArr[i][j] + " ");
			}
			System.out.println();
		}
	} 
}
