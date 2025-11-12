package be_study.refer;

public class Refer02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// enum 열거타입
		
		//선호도 저장
		
		int likePoint = 50;
		String likeLevel = "매우좋음";  //좋음 보통 매우좋음 나쁨 매우나쁨
		
		String likeLevel2 = "많이좋음";
		
		//if(likeLevel2 == likeLevel) {
		if(likeLevel2.equals(likeLevel)) {
			System.out.println("아주 좋다 긍정적이다");
		}
		
		if(likeLevel2.equals("매우좋음")) {
			
		}
		
		LikeIndex li1 = LikeIndex.VERYGOOD;
		LikeIndex li2 = LikeIndex.NORMAL;
		
		if(li2 == LikeIndex.VERYBAD) {
			System.out.println("매우나쁨이네");
		} else {
			System.out.println("매우나쁨은 아니네");			
		}

		
		Week today = Week.WED;
		Week w2 = Week.FRI;
		
		if(w2 == Week.FRI) {
			System.out.println("금요일입니다.");
		}
	}

}
