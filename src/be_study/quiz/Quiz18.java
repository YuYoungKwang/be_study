package be_study.quiz;

import java.util.Scanner;

public class Quiz18 {

	public static void main(String[] args) {
		/*1. 중첩반복문을 활용하여 아래와 같이 결과가 나타나도록 출력코드를 작성해주세요.
		*****
		****
		***
		**
		*
		*/

		for(int i = 5; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-----------------------------------------------------------");
		System.out.println("-----------------------------------------------------------");
		System.out.println("-----------------------------------------------------------");
	/*	2. 중첩반복문을 활용하여 아래와 같이 결과가 나타나도록 출력코드를 작성해주세요.
		*
		**
		***
		****
		*/
		
		for(int i = 1; i < 5; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-----------------------------------------------------------");
		System.out.println("-----------------------------------------------------------");
		System.out.println("-----------------------------------------------------------");
		
		/*3. 입력된 수의 약수를 출력하시오.
		ex) 입력 : 6
		1 2 3 6
		 */
		
		System.out.print("약수를 출력 할 숫자를 입력해 주세요. : ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		for(int i = 1; i <= num; i++) {
			if(num % i == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println("-----------------------------------------------------------");
		System.out.println("-----------------------------------------------------------");
		System.out.println("-----------------------------------------------------------");
		
/*		4. 중첩반복문을 활용하여 아래와 같이 결과가 나타나도록 출력코드를 작성해주세요.
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
		System.out.print("숫자를 입력해주세요. : ");
		int starNum = scanner.nextInt();
		for(int i = 1; i < starNum; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = starNum; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-----------------------------------------------------------");
		System.out.println("-----------------------------------------------------------");
		System.out.println("-----------------------------------------------------------");
		
/*		5. 1+ (1+2)+ (1+2+3)+(1+2+3+4)+...+(1+2+3+...+10) ..결과 계산 최종결과는?
*/
		int l =0;
		for (int i = 0;  i < 11; i++) {
			int k = 0;
			for (int j = 0; j < i+1; j++) {
				
				k += j;
			}
			
			l += k;
		}
		System.out.println(l);
		System.out.println("-----------------------------------------------------------");
		System.out.println("-----------------------------------------------------------");
		System.out.println("-----------------------------------------------------------");
/*
 * 		6. 1+(-2)+3+(-4)+... , 과 같은 식으로 계속 더해나갔을 때 몇까지 더해야 총합이 100이상인지 찾으시오. 100 이상이된
 * 		시점의 누적합이 얼마인지 + 얼마까지 더해서 100이 넘었는지 찾으세요.
 */
		int i = 0;
		int j = 0;
		while (true) {
			
			if(j % 2 == 0) {
				i -= j;
			}else {
				i += j;
			} 
			
			if(i >= 100) {
				System.out.println("100 이상이된 시점의 누적합 : " + i);
				System.out.println("100을 넘을 시점의 더한 값: " + j);
				break;
			}
			j++;
		}
	} 
}
