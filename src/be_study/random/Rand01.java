package be_study.random;

import java.util.Random;

public class Rand01 {

	public static void main(String[] args) {
		
		//난수 (랜덤값) 뽑기 사용
		
		//Math.random()  0 <= 랜덤값 < 1
		
		// (int)(Math.random()*갯수(범위)) + 시작숫자
		
		// 1~10까지 중 랜덤
		// (int)(Math.random()*10) + 1
		
		/*

			랜덤값 0~1	*10		(int)	+1
			0.0123		0.123	0		1
			0.1234		1.234	1		2
			0.255		2.55	2		3
			0.33355		3.3355	3		4
			0.44687		4.4687	4		5
			...
			0.89548		8.9548	8		9
			0.91155		9.1155	9		10
			
		 */
		
		for(int i=1; i<=10; i++)
			System.out.println( Math.random() );
		
		for(int i=1; i<=10; i++)   //1~10
			System.out.println((int)(Math.random()*10) + 1);
		
		for(int i=1; i<=10; i++)   //1~50
			System.out.println((int)(Math.random()*50) + 1);
		
		for(int i=1; i<=10; i++)   //101~200
			System.out.println((int)(Math.random()*100) + 101);
		
		for(int i=1; i<=10; i++)   //30~50
			System.out.println((int)(Math.random()*21) + 30);
		
		Random random = new Random();
		
		for(int i=1; i<=10; i++) //0~9
			System.out.println(random.nextInt(10)); // 0<= v <10
		for(int i=1; i<=10; i++) //1~10
			System.out.println(random.nextInt(10) + 1 );
		
		for(int i=1; i<=10; i++) //10~15
			System.out.println(random.nextInt(6)+10 );
		
		for(int i=1; i<=10; i++) //10~15
			System.out.println(random.nextInt(10, 16) ); // <=  <
	}

}
