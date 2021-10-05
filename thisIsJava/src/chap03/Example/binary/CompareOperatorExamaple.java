package chap03.Example.binary;

public class CompareOperatorExamaple {
	public static void main(String[] args) {
		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2 == v3); //true
		
		double v4 = 0.1;
		float v5 = 0.1f;
		System.out.println(v4 == v5); //false
		System.out.println((float)v4 == v5); //true  강제형변환시켜서  비교연산
		System.out.println( (int)(v4*10) == (int)(v5*10) ); //true 정수로 변환해서 비교
		
		
	}
}
