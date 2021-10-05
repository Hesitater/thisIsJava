package chap05.exercises;

public class Exercise7 {
	public static void main(String[] args) {

//		//선생님 답변
//		System.out.println(Integer.MAX_VALUE);
//		System.out.println(Integer.MIN_VALUE);
//		int[] array = {1, 5, 3, 8, 2};
//		int max = Integer.MIN_VALUE;
//		int min = Integer.MAX_VALUE;
//		
//		for(int i = 0; i < array.length; i++) {
//			if( max < array[i]) {
//				max = array[i];
//			}
//			if(min > array[i]) {
//				min = array[i];
//			}
//		}
//		System.out.println("max: " + max);
//		System.out.println("min: " + min);
		
		
		int max = Integer.MIN_VALUE;
		int[] array = {1, 5, 3, 8, 2};
		
		
		for(int i = 0; i < array.length; i++) {
			if( max < array[i]) {
				max = array[i];
			}
			
			}
		
		System.out.println("max: " + max);
	}
}
