package chap07.s070502;

public class SportCar extends Car {

	@Override
	public void speedUp() {
		speed += 10;
		
	}
	
//	@Override
//	public void stop() {						//매서드가 재정의가 안되욤
//		System.out.println("스포츠카를 멈춤");
//		speed = 0;
//	}
	

	
}
