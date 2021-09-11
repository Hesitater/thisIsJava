package chap04.Example;

public class SwitchStringExample {
	public static void main(String[] args) {
		String position = "과장";

		switch (position) {
		case "부장":
			System.out.println("부장은 돈안줘");
			break;
		case "과장":
			System.out.println("과장은 지원금 가능 ");
			break;
		default:
			System.out.println("과장 밑 직급은 다른 계좌에쏴드림!");
			break;
		}
	}
}
