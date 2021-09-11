package chap03.Example.binary;

public class LogicalOperatorExample {
	public static void main(String[] args) {
		
		int charCode = 'A';
		
		if( (charCode >=65 ) & (charCode <= 90) ) {  //65~90 이 알파벳 대문자 유니코드인가봄
			System.out.println("대문자 이군요");
		}
		
		if ( (charCode >=97) && (charCode <=122) ) {  // 97~122이 알파멧 아스키코드
			System.out.println("소문자 이군요");
		}
		
		if( !(charCode < 48) && !(charCode >57) ) {   // 48~ 57 이 아라비아숫자 0~9까지 아스키코드
			System.out.println("0~9 숫자 이군요");
		}
		
		int value = 6;
		
		if( (value % 2 == 0) | (value % 3 == 0 ) ) {
			System.out.println("2 or 3의 배수 이군요");
		}
		
		if( (value % 2 == 0 ) || (value % 3 == 0) ) {
			System.out.println("2 or 3의 배수 이군요");
		}
		
	}
}
