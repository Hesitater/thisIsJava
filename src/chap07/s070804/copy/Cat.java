package chap07.s070804.copy;

public class Cat extends Animal {

	public Cat() {
		this.kind = "포유쥬";
	}

	@Override
	public void sound() {
		System.out.println("야옹");
	}
	
}
