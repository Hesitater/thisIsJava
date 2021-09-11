package chap03.Example.exercises;

public class Exercise02 {
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int z = (++x) + (y--);		// 11 + 20
		
		System.out.println(z);		// 
		
		System.out.println(x);		//11
		System.out.println(y);		//19
	}
}
