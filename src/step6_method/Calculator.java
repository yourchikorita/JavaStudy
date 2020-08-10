package step6_method;
//# 계산기 프로그램

class Ex06{
	long add(long x, long y) {
		long result = x + y;
		return result;
	}
	long sub(long x, long y) {
		return x - y;
	}
	long mul(long x, long y) {
		return x * y;
	}
	double div(long x, long y) {
		return x / (double)y;
	}
	
	void showInfo(long x, long y) {
		System.out.printf("%d + %d = %d\n", x, y, add(x, y));
		System.out.printf("%d - %d = %d\n", x, y, sub(x, y));
		System.out.printf("%d * %d = %d\n", x, y, mul(x, y));
		if(y != 0) {
			System.out.printf("%d / %d = %.1f\n", x, y, div(x, y));
		}else {
			System.out.println("0으로 나눌 수 없습니다.");
		}
	}
}


public class Calculator {

	public static void main(String[] args) {

		Ex06 e = new Ex06();
		
		long r1 = e.add(5L, 3L);
		long r2 = e.sub(5L, 3L);
		long r3 = e.mul(5L, 3L);
		double r4 = e.div(5L, 3L);
		
		
		e.showInfo(5L, 3L);


	}

}
