package step7;
/*
* # 래퍼 클래스(wrapper class)
* - 래퍼 클래스란, 기본 자료형을 클래스로 만들어 놓은 것을 의미한다.
* [기본형]          [래퍼 클래스]
* byte             Byte
* short            Short
* int              Integer
* long             Long
* float            Float
* double           Double
* char             Character
* boolean          Boolean
*/

class MyInteger {
	int a;

	MyInteger(int a) {
		this.a = a;
	}
	public String toString() {
		System.out.println("~");
		return this.a+"입니다";
	}
}

public class WrapperClass {

	public static void main(String[] args) {
		int a = 10;
		Integer i = new Integer(10);

		float b = 10.1f;
		Float f = new Float(10.1);
		System.out.println(f);
		
		double d = 10.1;
		Double dd = new Double(10.11);
		System.out.println(dd);
		
		MyInteger ii = new MyInteger(100);
		System.out.println(ii);
	}

}
