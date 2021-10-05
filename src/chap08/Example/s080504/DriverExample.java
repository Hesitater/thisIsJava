package chap08.Example.s080504;

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);
		driver.drive(taxi);
		
		Vehicle vb = new Kickboard();
		vb = () -> System.out.println("헬멧쓰고 운행합니다");
		
//		Kickboard kb = () -> System.out.println("뭔가 했는데 운행해");
		
		
		
		
		vb.run();
		
	}
}
