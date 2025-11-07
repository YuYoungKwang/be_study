package be_study.iter;

public class Iter03 {

	public static void main(String[] args) {
		
		
		//if() 
		//	if()
		
		//반복문 중첩
		
		// 2  3
		
		for(int i=1; i<=5; i++) {
			
			//실행문
			System.out.println("for i 실행문 " + i);
			
			for(int j=1; j<=3; j++) {
				System.out.println("> for j 실행문 " + j);
			}
			
			System.out.println("---for 실행문 end---");
		}
		
		for(int i=1; i<=5; i++) { 
			for(int j=1; j<=3; j++) {
				for(int k=1; k<=2; k++) {
					//실행
					/*
						i:1 j:1 k:1 2
						    j:2 k:1 2
						    j:3 k:1 2
						i:2 j:1 k:1 2
						    j:2 k:1 2
						    j:3 k:1 2
						i:3 j:1 k:1 2
						    j:2 k:1 2
						    j:3 k:1 2
						i:4 j:1 k:1 2
						    j:2 k:1 2
						    j:3 k:1 2
						i:5 j:1 k:1 2
						    j:2 k:1 2
						    j:3 k:1 2    
						 
					 */
				}
			}
		}
		
		
		// 방 3개
			// 3번씩 쓸기
			// 2번씩 닦기
			// 1번씩 쓰레기 정리
		
//		for방3
//			for쓸기3 -> 쓸기 3번
//				for닦기2	-> 닦기 6번
		
//		for방3
//			for쓸기3 -> 쓸기 3번
//			for닦기2	-> 닦기 2번
		
		for(int i=1; i<=3; i++) {  //i: 1 2 3  (방 3개 의미)
			System.out.println(i + "번 방 청소");
			//쓸기 3번 의미
			for(int j=1; j<=3; j++) {  //j: 1 2 3 (3번 쓸기)
				System.out.println("쓸기");
			}
			
			int k=1;
			while(k<=2) {
				System.out.println("닦기");
				k++;
			}
			
			System.out.println("쓰레기 정리");
		}
		
		
	}

}
