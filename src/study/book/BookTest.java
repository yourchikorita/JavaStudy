package study.book;

public class BookTest {

	public static void main(String[] args) {
		Student2 st2 = new Student2("은정");
		st2.addingBook("시작1");
		
		Student2 st3 = new Student2("은 지");
		st3.addingBook("이태원 1");
		st3.addingBook("이태원 2");
		st3.addingBook("이태원 3");
		
		st2.show();
		st3.show();
	}

}
