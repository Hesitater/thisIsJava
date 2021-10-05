package chap03.Example.exercises;

public class Exercise03 {
	public static void main(String[] args) {
		int score = 85;
		String result =(!(score>90)) ? "가" : "나";
		System.out.println(result);   //  !(score >90) -> score <= 90 이니깐 가
	}
}
