package chap03.Example.exercises;

public class Exercise05 {
	public static void main(String[] args) {
		int value = 356;
		System.out.println(value - (value % 100));  // 356 - (300 % 100 = 56)
		System.out.println( (value / 100) *100);  // (356 나누기 100 = 3) * 100
		
	}
}
