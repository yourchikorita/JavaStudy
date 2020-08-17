package step8;

public class BaseAbstract1 {
	public static void main(String[] args) {

	}

}

// 클래스4속성
// 은닉성 , 상속 , 추상화
// 추상화 ==> 부모클래스를 상속받은 자식클래스에 특정메서드를 만들도록 강제하는것
// abstract 위치 ==> 1. 키워드 강제할 메서드 앞에 와 2. 클래스 앞에 붙여준다.
class A1 {
	int a;

	void test() {
	}
}

class B1 extends A1 {
	int b;
}

abstract class C1 {
	int c;

	abstract void test(); // 메서드이름만 만들어놓고 기능은 자식에서 만든다.
}

class D extends C1 {
	int d;

	void test() { // 강제로 만들어야하는 메서드

	}

}
