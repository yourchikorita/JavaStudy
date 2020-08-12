package step7;

//static // 전역변수 
//프로그램이 시작할때 할당받아서 
//프로그램이 종료될때 해제되는 변수 (위치 : static 영역)
class Test1 {
	int a;
	static int b;
	int c;

	static void test() {
	}
}

public class Static {

	public static void main(String[] args) {
		Test1.b = 100;
		Test1 t = new Test1();
		Test1 t1 = new Test1();
	}

}
