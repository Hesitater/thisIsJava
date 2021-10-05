package chap08.Example.s080503;

import chap08.Example.s080502.KumhoTire;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.run();
		System.out.println("------------허허---------------");
		
		myCar.tires[0] = new KumhoTire();
		myCar.tires[1] = () -> {
			System.out.println("중괄호 포함 람다식 금호타이어 굴러가유");
		};
		myCar.tires[2] = () -> System.out.println("중괄호뺀 람다식 금호타이어 굴러가유");
		
		myCar.run();
		
	}
}
