package step7;

class Book2 {

	String title; // 책 제목
	String author; // 책 저자
	int price; // 책 가격

	// 기본 생성자
	Book2() {
	}

	// 생성자 오버로딩
	Book2(String title, int price) {
		// this.title = title;
		// author = "작자미상";
		// this.price = price;

		// 생성자 호출
		this(title, "작자미상", price);
	}

	Book2(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}

	void showInfo() {
		System.out.println(this.title + ":" + this.author + "(" + this.price + "원)");
	}

}

public class Constructor3 {
	public static void main(String[] args) {

		Book2 b1 = new Book2("자바의 정석", "남궁성", 27000);
		b1.showInfo();

		Book2 b2 = new Book2("춘향전", 9000);
		b2.showInfo();

	}
}
