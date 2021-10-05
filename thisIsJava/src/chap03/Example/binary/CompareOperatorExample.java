package chap03.Example.binary;

public class CompareOperatorExample {
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		boolean result1 = ( x == y );
		boolean result2 = ( x != y );
		boolean result3 = ( x > y );
		boolean result4 = ( x >= y);
		boolean result5 = ( x < y );
		boolean result6 = ( x <= y);
		
		System.out.println("result1=" + result1);
		System.out.println("result2=" + result2);
		System.out.println("result3=" + result3);
		System.out.println("result4=" + result4);
		System.out.println("result5=" + result5);
		System.out.println("result6=" + result6);
		
		char char1 = 'A';
		char char2 = 'B';
		boolean result7 = (char1 < char2);
		System.out.println("result7=" + result7);
		
	}
}
