package chap03.Example;

public class Operator {
	public static void main(String[] args) {
		
		// 산술, 부호, 대입, 증감, 비교, 논리
		// 조건, 비트, 쉬프트
		
		// 단항, 이항, 삼항
		
		int a = 0;
		a++; // 단항, 증감 연산자
		
		int b = 0;
		
		int c = a + b; // 이항, 산술 연산자
		
		c = (true) ? a : b; // 삼항 연산자
		
		// 연산의 결과는 하나이며 다양한 타입이 나온다.
		c = a + b;
		boolean d = a < b;
		
		// 연산의 결과를 하나의 항으로 사용 가능.
		d = a + b < a - b; 
		
		// 연산자는 우선순위를 갖는다.
		c = a + b * c;
		
		// 우선순위가 가장 높은 ()를 사용하여야 함.
		d = (a + b) < (a - b);
		
		c = a + (b * c);
		c = (a + b) * c;
	}
}
