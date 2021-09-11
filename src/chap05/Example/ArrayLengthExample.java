package chap05.Example;

public class ArrayLengthExample {
	public static void main(String[] args) {
		int[] scores = { 83, 90, 87};
		
		int sum = 0;
		for(int i = 0; i < 3; i++) {
			sum += scores[i];
		}
		System.out.println("총합 : " + sum);
		
		double avg = (double) sum / scores.length;       //scores.length; 로하면 배열의 크기가 바뀔때마다 자동으로 바뀌죠?
		System.out.println("평균 : " + avg);
		
		
	}
}
