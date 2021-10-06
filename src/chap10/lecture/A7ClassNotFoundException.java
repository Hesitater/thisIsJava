package chap10.lecture;

public class A7ClassNotFoundException {
	public static void main(String[] args) {
		try {
			Class.forName("p10.lecture.A7ClassNotFoundException");
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
