package chap08.Example.s080702;

public interface ChildInterface2 extends ParentInterface {
	@Override
	default void method2() {
	}
	
	public void method3();
	
}
