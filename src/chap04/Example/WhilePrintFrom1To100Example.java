package chap04.Example;

public class WhilePrintFrom1To100Example {
	public static void main(String[] args) {
		int sum = 0;
		
		int i = 1;
		
		while (i <= 100) {
			
			sum += i;
			i++;
		}
		System.out.println("1~" + (i-1) + "까지의합: " +sum);
//		System.out.println("1~100까지의합: " +sum);
	}
}
