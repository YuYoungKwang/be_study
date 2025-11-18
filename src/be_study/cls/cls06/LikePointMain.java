package be_study.cls.cls06;

public class LikePointMain {

	public static void main(String[] args) {
		
		int n = 10;
		System.out.println(n);
		
		n = 20;
		System.out.println(n);
		
		final int i = 30;
		System.out.println(i);
		//i = 300;  //final 값 변경 불가
		
		LikePoint lp1 = new LikePoint();  //단점:객체생성
		System.out.println(lp1.veryGood);
		//lp1.veryGood = 10; //수정 불가 //장점:수정불가
		
		System.out.println(LikePoint.veryBad); //장점:객체생성없이 바로 사용가능
		LikePoint.veryBad = 0; //단점 : 값 수정이 됨
		System.out.println(LikePoint.veryBad);
		System.out.println(LikePoint.veryBad);
		
		//상수형  객체생성없어도 가능, 수정불가
		System.out.println("-----------------------");
		System.out.println(LikePoint.VERY_GOOD);
		System.out.println(LikePoint.GOOD);
		System.out.println(LikePoint.NORMAL);
		System.out.println(LikePoint.BAD);
		System.out.println(LikePoint.VERY_BAD);
	}

}
