package chap10.s100201;

public class NullpointerException {
	public static void main(String[] args) {
		System.out.println("프로그램 실행");

		String data = null;
		if (data != null) {
			System.out.println(data.toString());
		}

		System.out.println("프로그램 종료");
	}
}
