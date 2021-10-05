package chap02.examples.Ex;

public class FromIntTOFloat {
	public static void main(String[] args) {
		
		// 정수 타입을 실수 타입으로 변환할 때 정밀도 손실을 피한다.
		 
		int num1 = 123456780;
		int num2 = 123456780;
		
		float num3 = num2;
		num2 = (int) num3;
		
		int result = num1 - num2;
		System.out.println(result);
		
		//결과가 0이  아니라 -4가 나온다.
		// int값을 float타입으로 자동 변환하면서 문제가 발생했기 떄문에다
		//설명 보면 변환 과정중에 정밀도 손실이 발생하여..
		// float : 부호(1비트) + 지수 (8비트) + 가수(23비트)
		// double " 부호(1비트) + 지수(11비트) + 가수(52비트)
		
		
	}
}
