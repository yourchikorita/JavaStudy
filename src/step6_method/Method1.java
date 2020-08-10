package step6_method;

/*
 * # 클래스의 구성요소
 * [1] 변수
 * [2] 메서드(method)
 */
class Student {

	void say() {
		System.out.println("안녕하세요.");
		// return; // void일 때에는 생략가능
	}

}

public class Method1 {
	public static void main(String[] args) {

		Student hgd = new Student();
		// 메서드 호출(사용)되면 stack 메모리에 쌓인다.
		hgd.say();

	}

}
