package chap08.Example.s080506;

public class Driver {
	public void drive(Vehicle vehicle) {	//vehicle Bus 객체 ,Taxi 객체
		
		if( vehicle instanceof Bus) {	
			Bus bus = (Bus) vehicle;		//vehicle 매개 변수가 참조하는 객체가 Bus인지조사
			bus.checkFare();				//Bus 객체일 경우 안전하게 강제 타입 변환 시킴
		}
		
		vehicle.run();
	}
}
