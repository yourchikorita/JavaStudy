package step7;
/*
 * # 메서드 오버로딩(overloading)
 * 1. 메서드 오버로딩이란,
 *    같은 이름을 사용하지만 서로 다른 매개변수 형식을 가지고 있는 메서드를 
 *    여러개 정의하는 것을 의미한다.
 * 2. System.out.println() 메서드가 대표적인 예이다.
 * 3. 오버로딩의 조건
 * 1) 메서드의 이름이 같아야 한다.
 * 2) 매개변수의 개수 또는 매개변수의 자료형이 달라야 한다.
 */

class Mobile {
	String name;
	int price;
	String maker;

	void init() {
		name = "";
		price = 0;
		maker = "";
	}

	void init(String na, int pr, String ma) {
		name = na;
		price = pr;
		maker = ma;
	}

	void init(String na, int pr) {
		name = na;
		price = pr;
		maker = "";
	}

	void init(String na, String ma) {
		name = na;
		maker = ma;
		price = 0;
	}

	void init(int pr, String na) {
		price = pr;
		name = na;
		maker = "";
	}
}

public class Overloading {

	public static void main(String[] args) {
		Mobile m = new Mobile();
		m.init();
		m.init("아이폰", 1000, "애플");
		m.init("아이폰", 1000);

	}

}
