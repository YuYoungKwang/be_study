package be_study.quiz;

import java.util.Scanner;

public class Quiz23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		엘리베이터

		스마트 엘리베이터 시스템을 제작하려고 합니다.
		해당 시스템이 적용되는 빌딩은 100층 짜리 빌딩이며, 사람들을 원하는 층으로 스마트하게 이동시켜 줍니다.
		해당 시스템은 사람들을 원하는 층으로 스마트하게 데려다 줍니다.
		(반복문, 조건문, 배열 최대한 사용하시면 됩니다. )

		- 기본 문제
		1층에서 사람들이 탑승하며, 각자 내릴 층에 버튼을 누릅니다.
		(2 ~ 100 이외의 수는 입력이 없을 거라고 가정)
		엘리베이터는 100층까지 올라가는 와중에 탑승 인원을 모두 내려주고 1층으로 내려오며,
		엘리베이터의 층수가 변경될 때마다 현재 층수를 출력합니다.
		참고로, 엘리베이터는 10층에서 5층으로 갔다가 11층으로 가지 않습니다.
		(오로지 한번에 100층까지 쭉)
		(100층을 찍고 다시 1층까지 내려와야함)

		+ 탑승 인원을 입력받습니다.
		+ 탑승 인원 만큼, 사람들이 내릴 층(2층부터 100층까지)를 각각 입력 받습니다.
		(
		* 입력된 층은 중복되지 않게 입력이 된다고 가정
		예시)
		[10, 20, 35, 50, 11, 24] O 정상입력 케이스로 가정하고 진행
		[10, 20, 35, 10, 20, 24] X 중복층 입력 없음으로 가정
		)
		*/
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("탑승 인원 수 입력 : ");
		int personCount = scanner.nextInt(); //탈 사람 수
		//10 5
		
		int[] destFloorArr = new int[personCount];  //사람 수많큼 층수 입력을 저장할 배열 생성
		System.out.print("목적지 층수 입력(2~100) : ");
		for(int i=0; i<destFloorArr.length; i++) {
			destFloorArr[i] = scanner.nextInt();
			//2~100 층 필터링 예외처리
		}
		
		/*
		//v1 : 1->100->1
		//v2 : 1-> 입력한 층수 중에 최고층까지만 갔다가 -> 1  
			//destFloorArr 에서 최대값 찾기 이후 진행
			//maxFloor 
			//for(int i=1; i<=maxFloor; i++)
		for(int i=1; i<=100; i++) {  //올라갈때 몇층에 멈출것인가? 
			System.out.println(i + "층");  //멈춰야 하는 층 정보 : destFloorArr 10 35 55
			
			for(int j=0; j<destFloorArr.length; j++) {
				//현재 층이 목적지 층에 속해있는가?
				if(i == destFloorArr[j]) {  //멈춰야 하는 층이 맞다!
					System.out.println("***도착 (승객하차)***");
				}
			}
		}
		
		for(int i=100; i>=1; i--) { // 내려오기. 100 -> 1
			System.out.println(i + "층");
		}
		*/
		
		//진행 방향을 별도의 변수로 처리 boolean flag 변수
//		int floor = 1; //현재 층수
//		boolean isUp = true; //flag 역할  true 올라가는 방향 / false 내려가는 방향
//		
//		while(true) {
//			System.out.println(floor + "층");
//			
//			//내릴 층인가?
//			if(floor >= 100) {
//				isUp = false;
//			}
//			
//			//100층 올라갔다가 다시 1층으로 내려오면 끝.
//			if(floor <= 1 && isUp == false) { //내려오는 방향으로 1층일때 끝
//				break; //끝.
//			}
//			
//			if(isUp)  //isUp true -> 올라가는중 +1
//				floor++; // 1-> 100 ++ 
//			else //isUp false -> 내려가는중 -1
//				floor--; // 100 -> 1  --
//		}
		
		int floor = 1; //현재 층수
		int flow = 1; //flag 역할겸 층이 변하는 값 역할
		// flow : 1   -1   층이 변하는 연산에 값으로 참여  (층의 진행 방향을 의미)
		
		while(true) {
			System.out.println(floor + "층");
			
			//내릴 층인가?
			if(flow == 1) { //올라갈때
				for(int j=0; j<destFloorArr.length; j++) {
					//현재 층이 목적지 층에 속해있는가?
					if(floor == destFloorArr[j]) {  //멈춰야 하는 층이 맞다!
						System.out.println("***도착 (승객하차)***");
					}
				}
			}
			
			if(floor >= 100) {
				flow = -1;
			}
			
			//100층 올라갔다가 다시 1층으로 내려오면 끝.
			if(floor <= 1 && flow == -1) { //내려오는 방향으로 1층일때 끝
				break; //끝.
			}
			
			floor += flow;  //flow 1 +1     -1  -1 
		}
		
	}

}






