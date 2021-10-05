package chap06.exercises.ex18;

public class ShopService {
	//정적필드
	private static ShopService singleton = new ShopService();
	
	//생성자
	private  ShopService() {}
	
	//정적 메소드
	static ShopService getInstance() {
		return singleton;
	}
}
