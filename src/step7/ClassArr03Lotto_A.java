package step7;

import java.util.Random;

class Lotto {
	int[] data = new int[8];
	boolean win = false;

	void print() {
		for (int i = 0; i < 8; i++) {
			System.out.print(data[i]);
		}
		System.out.println();
	}
}

public class ClassArr03Lotto_A {
	public static void main(String[] args) {

		// 문제) 로또 1셋트
		// 1개는 당첨 4개는 꽝인 랜덤복권 생성 3이 연달아서 3개 나오면 당첨
		Random ran = new Random();

		Lotto[] lotto = new Lotto[5];
		// 로또 1셋트 (1)
		// 1개는 당첨 4개는 꽝 인 랜덤복권

		boolean check = false;
		int n = 0;
		while (n < 5) {
			lotto[n] = new Lotto();
			for (int i = 0; i < 8; i++) {
				int r = ran.nextInt(2);
				if (r == 0) {
					lotto[n].data[i] = 0;
				} else {
					lotto[n].data[i] = 3;
				}
			}
			int count = 0;
			for (int i = 0; i < 8; i++) {
				if (lotto[n].data[i] == 3) {
					count += 1;
					if (count == 3) {
						lotto[n].win = true;
						break;
					}
				} else {
					count = 0;
				}
			}
			if (check == false && lotto[n].win == true) {
				check = true;
				lotto[n].print();
				n += 1;
			} else if (check == true && lotto[n].win == false) {
				lotto[n].print();
				n += 1;
			}
		}

	}
}
