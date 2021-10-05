package chap04.exercises;

public class Exercise03 {
	public static void main(String[] args) {
		int sum = 0;
		
		for( int i = 1 ; i <= 100; i++) {
			if( i % 3 == 0) {
				sum += i;
			}
		}
		System.out.println("1~100중 3의배수합:" +sum);
		
	}
	
}
