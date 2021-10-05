package chap06.Example.sec060704;

public class Car {
	//필드
	String company = "현재자동차";
	String model;
	String color;
	int maxSpeed;
	
	
	//생성자
	Car () {												//①생성자
		
	}
	
	Car (String model) {									//②생성자
		this.model = model;
	}
	
	Car (String model, String color) {						//③생성자
		this.model = model;
		this.color = color;
	}

	public Car(String model, String color, int maxSpeed) { 	//④생성자 
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	//alt + Shitf + s -> Field 로 가능
	
}
