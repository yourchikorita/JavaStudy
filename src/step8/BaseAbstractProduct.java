package step8;
//한 개 이상의 추상 메소드를 포함한 클래스를 추상 클래스라 부르며 abstract 예약어를 사용해 만든다.

//추상 클래스는 불완전한 추상 메소드를 포함한 불완전한 클래스이므로 객체를 만들어 사용할 수 없다.
//추상 클래스는 상속을 시키기 위해서 만들어 사용하는 클래스로 추상 클래스를 상속받은 자식 클래스는 추상 클래스의
//모든 추상 메소드를 override 시켜서 사용해야 한다.

abstract class BaseAbstractProduct {
//	public void kindOf() { }			// 아무런 일도 하지 않는 일반 메소드
//	추상 메소드는 아무런 일도 하지 않는 {} 블록을 가지지 않는 메소드를 말한다.
//	추상 메소드는 abstract 예약어를 사용해 만들며 {} 블록이 없는 불완전한 메소드로 추상 메소드가 포함된 클래스를
//	상속받은 자식 클래스에서 반드시 override 해서 사용해야 하는 메소드이다.
	public abstract void kindOf(); // 추상 메소드

}

//Product 클래스를 상속받아 Camera 클래스를 만든다.
class Camera extends BaseAbstractProduct {

	@Override
	public void kindOf() {

	}

}
