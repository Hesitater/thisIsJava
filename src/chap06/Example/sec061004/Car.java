package chap06.Example.sec061004;

public class Car {
		int speed;
		
		void run() {
			System.out.println(speed + "으로달립니다.");	
		}
	
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.speed = 60;
		myCar.run();
		
		System.out.println(myCar.speed);
	}
}
