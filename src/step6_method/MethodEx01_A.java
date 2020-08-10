package step6_method;

import java.util.Scanner;

/*
 * [1]클래스의 구성요소
 * 1. 변수
 * 2. 메서드
 * 
 * [2]메서드의 필요성
 * 반복되는 코드를 메서드를 통해 재활용 하기 위함
 * 
 * [3]메서드의 구조[1단계]
 * void print(){
 * 		실행할 내용;
 * } 
 * 1) void			: 키워드
 * 2) print()		: 메서드명
 * 3) {}			: 메서드 영역
 * 4) 숨겨진 변수가 있다.(자기 주소를 저장하고 있는 변수 : this)
 * 
 * [4]메서드의 사용(호출)
 * print();			: 메서드명();
 */

class Ex01 {
	int num;

	void setNum() {
		System.out.println(this);
		this.num = 10;
	}

	void test1() {
		int sum = 0;
		for (int i = 1; i < 6; i++) {
			sum += i;
		}
		System.out.println("sum=" + sum);
	}

	void test2() {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 입력 ");
		int num1 = scan.nextInt();
		System.out.println("정수 입력 ");
		int num2 = scan.nextInt();
		System.out.println("정수 입력 ");
		int num3 = scan.nextInt();
		int max = num1;
		if (num1 < num2) {
			max = num2;
		}
		if (num2 < num3) {
			max = num3;
		}
		System.out.println("max="+max);

	}

}

public class MethodEx01_A {
	public static void main(String[] args) {

		Ex01 e = new Ex01();
		System.out.println(e+"=methodex01A에서의 e");

		e.num = 20;

		System.out.println(e.num+"이것은 20");// 20

		e.setNum();
		System.out.println(e.num+"이것은 10");// 10

		// --------------------------------------------

		// 문제 1) 1부터 5까지의 합을 출력하는 메서드
		e.test1();

		// 문제 2) 정수 3개를 입력받아 최대값을 출력하는 메서드
		e.test2();

	}

}
