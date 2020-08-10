package step6_method;

/*
 * # 클래스의 구성요소
 * [1] 변수
 * [2] 메서드(method)
 */
class Student2 {

	int setScore(int score) {
		score = 100;
		return score;
	}

}

public class Method2 {
	public static void main(String[] args) {

		Student2 hgd = new Student2();

		int score = 87;
		System.out.println("메서드 호출 전의 성적 = " + score); // 87

		score = hgd.setScore(score);

		System.out.println("메서드 호출 후의 성적 = " + score); // 87 리턴이 없다.바뀐게없다.

	}

}
