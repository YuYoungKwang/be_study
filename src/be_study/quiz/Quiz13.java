package be_study.quiz;

import java.util.Scanner;

public class Quiz13 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		/*
		1. 정수를 입력받고 홀수면 "odd"를 출력, 짝수면 "even"을 출력하기.
		*/
		
		/*
		System.out.print("정수 입력 : ");
		int input = scanner.nextInt();
		
		//   %2 결과 0 -> 2의 배수 -> 짝수
		//   %2 결과 1 -> 홀수
		
		//if( input%2 == 0 ) 짝
		//if( input%2 == 1 ) 홀
		//if( input%2 != 0 ) 홀
		//if( input%2 != 1 ) 짝
		
		if( input%2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		*/
		
		/*

		2. 정수를 입력받고 7의 배수면 "7의 배수입니다" 출력, 아니면 "아닙니다" 출력하기.
		 */
		
		/*
		System.out.print("정수 입력 : ");
		int num = scanner.nextInt();
		
		if(num %7 == 0) {
			System.out.println("7의 배수입니다");
		} else {
			System.out.println("아닙니다");
		}
		*/
		
		/*
		3. 1~1000 까지의 수 중에서 5의 배수의 합을 출력하기.
		*/
		
		/*
		int sum = 0;
//		for(int i=1; i<=100; i++) {  //i:1 2 3 4 5....99 100
//			sum =  sum + i;
//		}
		
		for(int i=1; i<=1000; i++) {  //i:1 2 3 4 5....999 1000
			//5의 배수 일때만!!
			if(i%5 == 0) {  //1X 2X 3X 4X 5O 6X 7X 8X 9X 10O
				sum =  sum + i; // +5 +10 ....
			}
		}
		System.out.println("1~1000까지 중 5의 배수의 합 : " + sum);
		
		sum = 0;
		for(int i=5; i<=1000; i=i+5) { //i: 5 10 15 20 25 ...
			sum = sum + i;
		}
		
		System.out.println("1~1000까지 중 5의 배수의 합 : " + sum);
		*/

		/*
		4. 1~50 까지의 수를 입력받아 해당 갯수만큼 *을 출력하기.
		ex) 입력 : 10
		결과 : **********
		
		5
		*****
		
		15
		***************
		*/
		
		/*
		System.out.print("1~50 까지 수 입력 : ");
		int num = scanner.nextInt();
		
		//if(num >= 1 && num <= 50) {}
		
//		if(num==1){ System.out.println("*");}
//		if(num==2){ System.out.println("**");}
//		if(num==3){ System.out.println("***");}
//		if(num==4){ System.out.println("*****");}
//		if(num==50){ System.out.println("**************************************************");}
		
		//몇번   while for   어디~어디~ 
		// for 몇번
		// for(초기화; 조건; 증감)
		
		//num 8
		//for(int i=1; i<=num; i++) {  i: 1 2 3 4 5 6 7 8
		for(int i=num; i>=1; i--) { // i: 8 7 6 5 4 3 2 1 
			System.out.print("*");
		}
		*/
		
		
		/*
		5. 1~10 까지의 수에서 홀수면 더하기(+), 짝수면 빼기(-)를 수행해서 최종 결과 출력.
		ex) 1 - 2 + 3 - 4 .....
		 */
		
		/*
		//int result = 1 - 2 + 3 - 4 + 5 - 6 + 7 - 8 + 9 - 10;
		int result = 0;
		for(int i=1; i<=10; i++) {  //i: 1 2 3 4 ... 9 10 
			//짝수 - 
			//홀수 + 
			if(i%2 == 0) {  //짝수
				result = result - i;
			} else {  //홀수
				result = result + i;
			}
		}
		System.out.println(result);
		*/
		
		/*
		6. 정수를 1부터(1+2+3+4.....) 계속 누적으로 더한다. 이런 패턴으로 누적으로 더해진 누적 값이 1000 보다 작으면 계속 더하고
		1000이 넘어가면 멈춘다. 멈추는 시점까지 누적으로 더해진 값을 출력하기.
		 */
		
		/*
		int total = 0;
		for(int i=1; i<=1000; i++) {  //  46~1000 955바퀴
			
			if(total < 1000) {
				total = total + i;
			} else {
				break;
			}
		}
		System.out.println(total);  // 1+2+...44+45    990+45 = 1035
		
		
		total = 0;
		int i=1;
		
		while(true) {
			
			//int i=1;	
			total = total + i;  // total = total + i++;
			i++;  // i = i + 1;
			
			if(total >= 1000) {
				break;
			}
		}
		System.out.println(total);
		
		total = 0;
		i=1;
		while(total<1000) {
			total = total + i;
			i++;
		}
		System.out.println(total);
		
		total = 0;
		for(i=1; total<1000; i++) {
			total = total + i;
		}
		System.out.println(total);
		*/
		
		
		/*
		7. 입력 받은 수의 구구단 출력 (1~9까지 입력)
		ex) 입력 3
		3 * 1 = 3
		3 * 2 = 6
		3 * 3 = 9
		...
		3 * 9 = 27
		*/
		
		//3 * 1 		1~9
		//3 * 2
		//3 * n
		//3 * 9
		
		System.out.print("1~9까지 중에 보고싶은 구구단은? : ");
		int num = scanner.nextInt();
		
		for(int i=1; i<=9; i++) {
			System.out.printf("%d * %d = %d\n", num, i, num*i );
		}
		
	}

}
