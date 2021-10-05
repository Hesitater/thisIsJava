package chap08.Example.s080502;

public class KumhoTire implements Tire { 		//구현 클래스
	
	@Override
	public void roll() {						// Tire 인터페이스 구현
		System.out.println("금호 타이어가 굴러갑니다.");
	}

}
