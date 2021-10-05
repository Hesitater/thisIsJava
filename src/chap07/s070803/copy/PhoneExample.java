package chap07.s070803.copy;

public class PhoneExample {
	public static void main(String[] args) {
		
//		Phone phone = new Phone;		//오류뜸 추상메소드는 new 연산자로 생성 불가능
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
		
	}
}
