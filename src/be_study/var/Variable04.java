package be_study.var;

public class Variable04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s1 = "12";
		int n1 = 11;
		int n2 = 22;
		System.out.println( n1 + n2 + s1  );
		System.out.println( n1 + s1 + n2   );
		
		// 11 + 22 + "12"  = "3312"
		// 11 + 22 + 12  = 45 
		
		
		String s2 = "1234";
		int n3 = 16;
		System.out.println(s2 + n3);
		
		//String -> 숫자 (정수/실수) (int/double)
		System.out.println( Integer.parseInt(s2) + n3 );
		//					Integer.parseInt("1234")
		//					1234 + 16
		
		String s3 = "33.55"; 
		//int n4 = Integer.parseInt(s3);  //실수형태의 문자열 -> int 변환
		double d4 = Double.parseDouble(s3);
		System.out.println( d4 + 12.1 );
		
		String s4 = "12a.12b";
		//Double.parseDouble(s4);
		
		boolean b1 = true; //false;
		
		String s5 = "false";  //문자열 "false"
		boolean b2 = Boolean.parseBoolean(s5); // false
		System.out.println(b2);
		
		String s10 = String.valueOf(true);
		String s11 = String.valueOf(123);
		String s12 = String.valueOf(33.598);
		
		String s13 = 123 + ""; // "123"
		//           int + String ->> String
	}

}
