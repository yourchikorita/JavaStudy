package step8;

class Test1 {

}

class Test2 {
	int a;
	int b;

	public String toString() {
		a = 10;
		b = 20;
		return "" + a + b;
	}
}

public class Test01 {

	public static void main(String[] args) {
		Test1 t1 = new Test1();
		System.out.println(t1);// 원래는 주소가 나온다.
		Test2 t2 = new Test2();
		System.out.println(t2); // toString() 을 만들면 주소대신 return 값출력

	}

}
