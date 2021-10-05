package chap03.Example.exercises;

public class Exercise04 {
	public static void main(String[] args) {
		int pencils = 543;
		int students = 30;
		
		//학생 한 명이 가지는 연필 수
		int pencilsPerStudent = (pencils / students);		//543 / 30  몫 17
		System.out.println(pencilsPerStudent);
		
		// 남은 연필 수
		int pencilsLeft = ( pencils % students);			// 543 % 30 나머지 3
		System.out.println(pencilsLeft);
		
	}
}
