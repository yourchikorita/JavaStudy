package study.bookShopping;

public class bookShoppingTest {

	public static void main(String[] args) {
		MyShoppingBag msb = new MyShoppingBag("은정");
		msb.addingBook("이태원1", "a출판사", 10000);
		msb.addingBook("이태원2", "a출판사", 12000);
		MyShoppingBag msb2 = new MyShoppingBag("은디");
		msb2.addingBook("시작 1", "a출판사", 10000);
		msb2.addingBook("이태원2", "a출판사", 300);
		msb.show();
		msb2.show();
	}

}
