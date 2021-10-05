package chap03.Example.binary;

public class BitOperator {
	public static void main(String[] args) {
		// & | ^ ~ << >> >>>
		// 피연산자 정수(byte, short, int , long), boolean
		// 결과 정수 or boolean

		// ~
		// 1 -> 0 , 0 -> 1
		int i = 3;
		System.out.println(i);
		System.out.println(~i);

		// &
		// 비트 둘 다 1 일때 만 1
		// 1 & 1 => 1
		// 1 & 0 => 0
		// 0 & 1 => 0
		// 0 & 0 => 0

		// |
		// 비트 둘다 0일 때만 0
		// 1 | 1 => 1
		// 1 | 0 => 1
		// 0 | 1 => 1
		// 0 | 0 => 0

		// ^
		// 비트가 다르면 1
		// 1 ^ 1 => 0
		// 1 ^ 0 => 1
		// 0 ^ 1 => 1
		// 0 ^ 0 => 0

		// 10: 0000 0000 0000 0000 0000 0000 0000 1010
		// 25: 0000 0000 0000 0000 0000 0000 0001 1001
		// ^ : 0000 0000 0000 0000 0000 0000 0001 0011
		// | : 0000 0000 0000 0000 0000 0000 0001 1011
		// & : 0000 0000 0000 0000 0000 0000 0000 1000

		i = 10;
		int j = 25;
		System.out.println(i & j);
		System.out.println(i | j);
		System.out.println(i ^ j);

	}
}
