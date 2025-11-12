package be_study.refer;

public class Arr05 {

	public static void main(String[] args) {
		
		int[] arr = {10, 20, 30, 40, 50};
		
		for(int i=0; i<5; i++) { //i : index 역할
			System.out.printf("arr[%d] = %d\n", i, arr[i]);
		}
		System.out.println();
		
		
		for(int v : arr) {  // {10, 20, 30, 40, 50};
			
			//배열 전체 갯수만큼 처음부터 끝가지 다 반복
			//v : 값이 주어진다.  인덱스는 모름.
			System.out.print(v + " ");
		}
		System.out.println();
	
		
		int index = 0;
		for(int v : arr) {  // {10, 20, 30, 40, 50};
			
			//배열 전체 갯수만큼 처음부터 끝가지 다 반복
			//v : 값이 주어진다.  인덱스는 모름.
			System.out.print(v + " ");
			// arr[index]
			// index++
		}
		System.out.println();
		
		
		int[] scores = {90, 95, 100, 85, 80}; 
		int sum = 0;
		
		for(int i=0; i<scores.length; i++) {
			sum = sum + scores[i];  //90 + 95 + 100 + 85 + 80
		}
		System.out.println(sum);
		
		sum = 0;
		//index=0;
		for(int s : scores) {
			sum = sum + s;
			//index++;
			//if(index==숫자) break;
		}
		System.out.println(sum);
		
		// {90, 95, 100, 85, 80}; 
		// 채점실수 각 모든 점수 -5 점 처리
		// {85, 90, 95, 80, 75};
		
		//단순출력용
		for(int s : scores) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		//-5점 처리
//		for(int i=0; i<scores.length; i++) {
//			scores[i] = scores[i] - 5;
//		}
		
		for(int s : scores) {
			s = s - 5;
		}
		
		//단순출력용
		for(int s : scores) {
			System.out.print(s + " ");
		}
		System.out.println();
		
	}

}
