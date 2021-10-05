package chap06.Example.sec061005;

public class Singleton {
	private static Singleton singleton = new Singleton();
	
	private Singleton() {
		
	}
		
	
		
		static Singleton getInstance() {
			return singleton;
	}
	
}
