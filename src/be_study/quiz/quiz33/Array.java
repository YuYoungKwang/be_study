package be_study.quiz.quiz33;

public class Array {

	public static void main(String[] args) {

		int[] numArr = {5, 4, 3, 2, 1};// 정수 배열
		
		System.out.println("====================================================");
		System.out.print("1. 배열의 요소 출력 : ");
		System.out.print(numArr[0] + " ");
		System.out.print(numArr[1] + " ");
		System.out.print(numArr[2] + " ");
		System.out.print(numArr[3] + " ");
		System.out.print(numArr[4] + " ");
		System.out.println();
		System.out.println("====================================================");
		
		int[] numArr2 = new int[50];
		numArr2[2] = 50;
		System.out.println("====================================================");
		System.out.println("2. numArr2의 2번 인덱스 : " + numArr2[2]);
		System.out.println("====================================================");
		System.out.println("====================================================");
		System.out.println("3. numArr2의 길이 : " + numArr2.length);
		System.out.println("====================================================");
		
		int[] numArr3 = new int[10];
		int totalNum = 0;
		for(int i = 0; i < numArr3.length; i++) {
			numArr3[i] = (int)(Math.random() * 10) + 1;
			totalNum += numArr3[i];
		}
		
		System.out.println("====================================================");
		System.out.println("4. numArr3의 합계 : " + totalNum);
		System.out.println("====================================================");

		System.out.println("====================================================");
		System.out.print("5. numArr3 배열 요소 출력 :");
		for(int i = 0; i < numArr3.length; i++) {
			System.out.print(numArr3[i]+" ");
		}
		System.out.println();
		System.out.println("====================================================");
		
		Array array = new Array();
		System.out.println("====================================================");
		System.out.println("6. numArr3의 평균을 구하는 메서드의 결과값 : " + array.average(numArr3));
		System.out.println("====================================================");
		
		System.out.println("====================================================");
		System.out.println("7. numArr3의 가장 큰 값을 반환하는 메서드의 결과값 : " + array.biggest(numArr3));
		System.out.println("====================================================");
		
		array.plusOne(numArr3);
		System.out.println("====================================================");
		System.out.print("8. numArr3 모든 요소를 1 증가시키는 메서드의 결과 값 :");
		for(int i = 0; i < numArr3.length; i++) {
			System.out.print(numArr3[i]+" ");
		}
		System.out.println();
		System.out.println("====================================================");
		
		System.out.println("====================================================");
		System.out.print("9. 길이를 받아서 0으로 채워진 배열 리턴 :");
		
		int[] zeroArr = array.arrCreate(10);
		for(int i = 0; i < zeroArr.length; i++) {
			System.out.print(zeroArr[i]+" ");
		}
		System.out.println();
		System.out.println("====================================================");
		
		System.out.println("====================================================");
		System.out.print("10. numArr3 역순으로 뒤집어주는 메서드 :");
		int[] reverseArr = array.arrReverse(numArr3);
		for(int i = 0; i < reverseArr.length; i++) {
			System.out.print(reverseArr[i]+" ");
		}
		System.out.println();
		System.out.println("====================================================");
	}
	
	public double average(int[] numArr) {
		double averageNum = 0;
		
		int totalNum = 0;
		for(int i = 0; i < numArr.length; i++) {
			totalNum += numArr[i];
		}
		
		averageNum = (double)totalNum / numArr.length;
		
		return averageNum;
	}
	
	public int biggest(int[] numArr) {
		int maxNum = 0;
		for(int i = 0; i < numArr.length; i++) {
			if(numArr[i] > maxNum) {
				maxNum = numArr[i];
			}
		}
			
		return maxNum;
	}
	
	public void plusOne(int[] numArr) {
		for(int i = 0; i < numArr.length; i++) {
			numArr[i]++;
		}
	}
	
	public int[] arrCreate(int i) {
		int[] zeroArr = new int[i]; 
		return zeroArr; 
	}
	
	public int[] arrReverse(int[] numArr) {
		int[] reverseArr = new int[numArr.length];
		for(int i = 0 , j = numArr.length - 1; i < numArr.length; i++) {
			reverseArr[j] = numArr[i];
			j--;
		}
		return reverseArr;
	}

}
