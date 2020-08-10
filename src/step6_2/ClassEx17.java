package step6_2;

/*
 * # static 변수와 멤버 변수 
 * 1. static 변수
 * 1) static 메모리에 생성
 * 2) 공용 공간
 * 
 * 2. 멤버 변수
 * 1) heap 메모리에 생성
 * 2) 개별 공간
 */

class Card{
	static int width  = 150;
	static int height = 300;
	
	int number;
	String shape;
}


public class ClassEx17 {

	public static void main(String[] args) {
		Card c1 = new Card();
		c1.number = 4;
		c1.shape = "heart";
		
		Card c2 = new Card();
		c2.number = 7;
		c2.shape = "spade";
		
		c1.width = 300;
		c1.height = 150;
		
		System.out.println(Card.width);		// 300  공용이라 마지막에 대입한게 나옴
		System.out.println(Card.height);	// 150

        System.out.println(c1.width);		// 300
		System.out.println(c1.height);	// 150

        System.out.println(c2.width);		// 300
		System.out.println(c2.height);	// 150



	}

}
