package be_study.quiz;

import java.util.Scanner;

public class Quiz18 {

	public static void main(String[] args) {

		
/*
		1. 중첩반복문을 활용하여 아래와 같이 결과가 나타나도록 출력코드를 작성해주세요.
		*****
		****
		***
		**
		*
		
		라인(행)수 1 2 3 4 5   5회 반복
		별 출력 수 5 4 3 2 1   5회부터 1회 까지 
	*/
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=6-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		
		for(int i=1; i<=5; i++) {
			for(int j=i; j<=5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=1; i<=5; i++) {
			for(int j=5; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=0; i<5; i++) {
			for(int j=1; j<=5-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=0; i<5; i++) {
			for(int j=i+1; j<=5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=5; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=5; i>=1; i--) {
			for(int j=5; j>5-i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		
		/*
		
		2. 중첩반복문을 활용하여 아래와 같이 결과가 나타나도록 출력코드를 작성해주세요.
		*
		**
		***
		****
		
		*/
		
		for(int i=1; i<=4; i++) {
			//i : 1 2 3 4 
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		
		
		
		
		/*
		
		3. 입력된 수의 약수를 출력하시오.
		ex) 입력 : 6
		1 2 3 6
		*/
		
		Scanner scanner = new Scanner(System.in);
		/*
		System.out.print("입력 : ");
		int n = scanner.nextInt();
		
		//1 2 3 4 .... n 해당 숫자
		
		for(int i=1; i<=n; i++) {
			if(n%i == 0) { //입력받은수 n
				//i로 나머지연산
				//나누어 떨어지면 약수
				System.out.print(i + " ");
			}
		}
		System.out.println();
		*/
		
		
		
		/*
		
		4. 중첩반복문을 활용하여 아래와 같이 결과가 나타나도록 출력코드를 작성해주세요.
		숫자를 입력받고 아래 문양으로 * 출력하기
		ex) 입력 : 5
		*
		**
		***
		****
		*****
		****
		***
		**
		*
		
		입력 : 3
		
		*
		**
		***
		**
		*
		
		*/
		
		/*
		System.out.print("입력 : ");
		int n = scanner.nextInt();
		// n 숫자 반복 횟수에 영향
		// 5 
		
		for(int i=1; i<=n; i++) {
			//i : 1 2 3 4 .. n 
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1; i<=n-1; i++) {
			for(int j=n-1; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		*/
		
		/*
		 * 
		
		5. 1+ (1+2)+ (1+2+3)+(1+2+3+4)+...+(1+2+3+...+10) ..결과 계산 최종결과는?
		
		1+
		(1+2)+
		(1+2+3)+
		(1+2+3+4)+...+
		..
		(1+2+3+...+10)
		
		*/
		
		//i: 1 2   3 	 4		 ... 9 10
		//j: 1 1 2 1 2 3 1 2 3 4       1 2 3 4 5 6 7 8 9 10
		
		int sum = 0;
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=i; j++) {
				//총합
				sum = sum + j;   //j: 1 1 2 1 2 3 1 2 3 4   ... 1 2 3 4 5 6 7 8 9 10
			}  
		}
		System.out.println("누적된 총합 : " + sum);
		
		sum = 0;
		int currentSum = 0;
		for(int i=1; i<=10; i++) {
			currentSum = currentSum + i;
			sum = sum + currentSum;
		}
		System.out.println("누적된 총합 : " + sum);
		
		sum = 0;
		for(int i=1; i<=10; i++) {
			sum = sum + ( i * (10 - (i-1)));
			//			  1 * (10)
			//			  2 * (9)
			//			  3 * (8)
			//			 10 * 1 
		}
		System.out.println("누적된 총합 : " + sum);
		
		/*
		6. 1+(-2)+3+(-4)+... , 과 같은 식으로 계속 더해나갔을 때 몇까지 더해야 총합이
		100이상인지 찾으시오. 100 이상이된 시점의 누적합이 얼마인지 + 얼마까지 더해서 100이 넘었는지 찾으세요.
		 */
		//1-2+3-4+5-6 ... >= 100 !?!?!? 
		
		int i=1; //2 3 ..
		int total = 0;
		while(true) {
			
			if(i%2 == 0) { //짝수 빼기
				total = total - i;
			} else { //홀수 더하기
				total = total + i;
			}
			
			if(total >= 100)
				break;
			
			i++;
		}
		// 1-2+3 ... +197 - 198 + 199 
		
		//2개 셋트 -1
		// 1-2   3-4
		// -198 ->   99개 세트 ->  -99   + 199 = 100
		
		System.out.println("100이 넘은시점 누적합 : " + total + " 얼마까지 계산: " + i);
		
		
		
		
		i=0; //
		total = 0;
		while(true) {
			i++;
			
			if(i%2 == 0) { //짝수 빼기
				total = total - i;
			} else { //홀수 더하기
				total = total + i;
			}
			
			if(total >= 100)
				break;
			
			
		}
		
		System.out.println("100이 넘은시점 누적합 : " + total + " 얼마까지 계산: " + i);
		
		
		total = 0;
		for(i=1; total<100; i++) {
			
			if(i%2 == 0) { //짝수 빼기
				total = total - i;
			} else { //홀수 더하기
				total = total + i;
			}
		}
		//i--;
		
		System.out.println("100이 넘은시점 누적합 : " + total + " 얼마까지 계산: " + (i-1));
		
		
	}

}
