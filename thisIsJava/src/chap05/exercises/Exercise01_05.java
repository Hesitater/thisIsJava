package chap05.exercises;

import java.util.Arrays;

public class Exercise01_05 {
	public static void main(String[] args) {
		
		//문제 1번 : 답 4번
		// 참조 타입은 null 값으로 초기화 할 수있다.
		
		//문제2번 : 답 3번
			int[] array = {3, 4, 5};
			array = null;
			System.out.println(Arrays.toString(array));
		//문제 3번 : 답 2번
		// String 타입의 문자열 비교는 	equals() 메소드로 합니다.
			
		// 문제 4번 : 답 2
			int[] array1 = {1,2,3};			//1번 가능
//			int[] array2; 
//			array2 = {1,2,3};	// 2보너 컴파일오류
			int[] array3 = new int[3];		//3번 가능
			int[][] array4 = new int[3][2];	//4번 가능
			
		//문제 5번 : 답	 3번
		// boolean 타입 배열 항목의 기촌 초기값은 false 이다	
			
			
		
	}
	
	
	
	
	
}
