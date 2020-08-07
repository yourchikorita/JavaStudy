package step5_2.classEx;

class Student{
	String name;
	int score;
}

public class ClassEx02 {

	public static void main(String[] args) {

	// 같은 패키지 안의 클래스는 다른 클래스에서 사용이 가능하다.
		Ex01 e = new Ex01();
		e.x = 10;
		e.y = 20;
		
		Student st = new Student();
		st.name = "홍길";
		st.score = 100;

	}

}
