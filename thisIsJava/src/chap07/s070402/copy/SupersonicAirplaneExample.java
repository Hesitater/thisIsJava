package chap07.s070402.copy;

public class SupersonicAirplaneExample {
	public static void main(String[] args) {

		SupersonicAirplane sa = new SupersonicAirplane();

		sa.takeOff();
		sa.fly();
		sa.flyMode = SupersonicAirplane.SUPERSONIC;
		sa.fly();
		sa.flyMode = SupersonicAirplane.NORMAL;
		sa.fly();
		sa.land();

	}

}
