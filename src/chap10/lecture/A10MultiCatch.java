package chap10.lecture;

public class A10MultiCatch {
	public static void main(String[] args) {
		
		try {
			String[] arr1 = {"300", "abc"};
			for (int j = 0; j <arr1.length; j++) {
				int i = Integer.parseInt(arr1[j]);
				System.out.println(i);
			}
			
		} catch(NumberFormatException e) {
			System.out.println("수 형식이 바르지 않습니다");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 인덱스를 잘 못 참조.");
		} finally {
			System.out.println("항상 코드 실행 The Unkillable Demon King");
		}
			System.out.println("프로그램 종료");
	}
}
