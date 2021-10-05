package chap08.Example.s080301;

import chap08.Example.s080205.RemoteControl;

public class RemoteControlExample {
	public static void main(String[] args) {
		
		RemoteControl rc = null; 			//인터페이스 변수 선언
		
		rc = new Television();				//Television 객체를 인터페이스 타입에 대입
		rc.turnOn();						
		rc.turnOff();						//인터페이스의 turnOn(),turnOff() 호출
		
		rc = new Audio();					//Audio 객체를 인터페이스 타입에 대입
		rc.turnOn();
		rc.turnOff();
		
		
		
		
		
		
		
//		RemoteControl rc;
//		rc = new Television();
//		rc = new Audio();
//		
//		RemoteControl rc1 = new Television();
//		RemoteControl rc2 = new Audio();
	}
}
