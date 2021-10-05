package chap02.examples.Ex;

public class CheckValueBeforeCasting {
	public static void main(String[] args) {
		
		
		//변환으로 인한 데이터 손실이 발생되지 않도록 한다.
		int i = 128; 		//  ( i< -127 || i >128) 만족한값	true
//		int i = 127;		// ( i< -127 || i >128) 만족 못하는값	false

		if( (i< Byte.MIN_VALUE) || (i > Byte.MAX_VALUE) ) {
			System.out.println("byte 타입으로 변환할 수 없습니다");
			System.out.println("값을 다시 호가인해 주세요");
		} else {
			byte b = (byte) i;
			System.out.println(b);
		}
		
	}
}
