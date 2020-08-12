package step7;

class Car {

	String color;
	String type;
	int door;

	// 기본 생성자
	Car() {
		this("white", "auto", 4);
	}

	// 생성자 오버로딩
	Car(String color, String type, int door) {
		this.color = color;
		this.type = type;
		this.door = door;
	}

	// 생성자 오버로딩
	Car(Car c) {
		this.color = c.color;
		this.type = c.type;
		this.door = c.door;
	}

	void showInfo() {
		System.out.println(this.color + ":" + this.type + ":" + this.door);
	}
}

public class Constructor4 {

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.showInfo();

		Car c2 = new Car(c1);
		c2.showInfo();

		c2.color = "red";
		c2.showInfo();

		Car c5 = new Car("yellow","sudong",5);
		c5.showInfo();
	}

}
