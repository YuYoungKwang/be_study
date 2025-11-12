package be_study.quiz;

import java.util.Scanner;

public class Quiz23 {

	public static void main(String[] args) {
//		스마트 엘리베이터 시스템을 제작하려고 합니다.
//		해당 시스템이 적용되는 빌딩은 100층 짜리 빌딩이며, 사람들을 원하는 층으로 스마트하게 이동시켜 줍니다.
//		해당 시스템은 사람들을 원하는 층으로 스마트하게 데려다 줍니다.
//		(반복문, 조건문, 배열, 메소드를 최대한 사용하시면 됩니다. )
//
//		- 기본 문제
//		1층에서 사람들이 탑승하며, 각자 내릴 층에 버튼을 누릅니다.
//		(2 ~ 100 이외의 수는 입력이 없을 거라고 가정)
//		엘리베이터는 100층까지 올라가는 와중에 탑승 인원을 모두 내려주고 1층으로 내려오며,
//		엘리베이터의 층수가 변경될 때마다 현재 층수를 출력합니다.
//		참고로, 엘리베이터는 10층에서 5층으로 갔다가 11층으로 가지 않습니다. (오로지 한번에 100층까지 쭉)
//
//		+ 탑승 인원을 입력받습니다.
//		+ 탑승 인원 만큼, 사람들이 내릴 층(2층부터 100층까지)를 각각 입력 받습니다.
		
//		- 레벨 1
//		부실 공사로 인한 전기 공급의 한계로, 엘리베이터가 멈출 수 있는 횟수에 제한이 생깁니다.
//		엘리베이터는 마지막 횟수가 되면, 남아 있는 사람들은 계단으로 보내며
//		(마지막 횟수가 3일 때, 사람들의 내릴 층이 2, 3, 4, 5층이라면 4층에서 멈추어야 함)
//		현재 층 수에 점검 중 표시를 하고 운영을 멈춥니다.
//
//		+ 엘리베이터가 멈출 수 있는 최대 횟수는 사용자 입력을 받습니다.
		
		Scanner scanner = new Scanner(System.in);
		
		int humanCount = 0; //사람수
		int stopCount = 0;
		int tempStop = 0;
		//탑승인원 체크
		System.out.print("탑승인원을 입력해주세요 : ");
		humanCount = scanner.nextInt();
		
		System.out.print("멈출수 있는 최대 횟수를 입력해주세요 : ");
		stopCount = scanner.nextInt();
		
		int[] floor = new int[humanCount]; //목적지 층을 입력받는 배열
		//내리는 층 입력받기
		System.out.print("이동을 원하는 층을 입력해주세요. (사람인수 만큼 입력 ex) 3명 : 3 5 7): ");
		for(int i = 0; i < humanCount; i++) { // 0 ~ 사람수-1 만큼 반복
			floor[i] = scanner.nextInt(); // 입력받은 층수를 0 ~ 사람수-1에 저장
		}
		
		
		for(int i = 1; i <= 100; i++ ) { // 1부터 100까지 반복
			System.out.print(i + " 층"); 
			for(int j = 0; j < floor.length; j++) { // 입력받은 층수의 수 만큼 반복
				// 0 1 2 
				if(floor[j] == i) { // 입력받은 층수와 1~100까지 반복중의 층수와 같으면 실행.
					System.out.print(" 승객이 하차했습니다.");
					tempStop++;
				}
				
				
			}
			
			System.out.println();
			if(tempStop == stopCount) {
				System.out.println("점검 중");
				break;
			}
		}
		
		if(tempStop != stopCount) {
			// 99층부터 1층까지 출력
			for(int i = 99; i >= 1; i--) {
				System.out.println(i + " 층");
			}
		}
		
	} 
}
