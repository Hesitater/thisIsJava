package chap06.Example.sec060703;

public class KoreanExample {
	public static void main(String[] args) {
		Korean k1 = new Korean("김태희","010101-1234567");
		System.out.println("k1.name : " + k1.name);
		System.out.println("k1 ssn : " + k1.ssn);
		
		
		Korean k2 = new Korean("전지현","990103-0654321" );
		System.out.println("k2.name : " + k2.name);
		System.out.println("k2.ssn : " + k2.ssn);
	}
}
