package chap08.Example.s080502;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.run();
		
		System.out.println("-------------------------");
		
		myCar.frontLeftTire = new KumhoTire();
		
		myCar.frontRightTire = () -> System.out.println("중괄호뺀 람다식타 이어가 굴러가유");
		
		
		myCar.backLeftTire = () -> {
			System.out.println(" 중괄호 포함 람다식타이어가 굴러갑니다");
		};
		
		myCar.run();
		
	}
}
