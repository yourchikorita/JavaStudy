package step2_11.arrayEx;

public class ArrayExTest {

	public static void main(String[] args) {
		// # 문제2) 9의 배수중 십의 자리가 6인 첫번째 배수 출력
		// # 답 : 63
		for(int i = 1; i < 100; i++) {
			if(i % 9 == 0) {
				if(i / 10 == 6) {
					System.out.println(i);
				}
			}
		}
		System.out.println("======================");
		// # 문제3) 8로 나누면 5가 남는수 중 150보다 적은수중에 에 가장 가까운수를 구하시요
		// # 답 149
		int max = 0;
		for(int i = 1; i < 200; i ++) {
			if(i % 8 == 5) {
				if(i<150) {
					if(max <i) {
						max = i;
					}
				}
				
			}
		}
		System.out.println("가장 큰 값"+max);
		
		System.out.println("======================");
		// # 문제4) 50에서 100까지 자연수중에서 9의 배수는 모두 몇개입니까?
		// # 답 6 (54,63,72,81,90,99)
		int count = 0;
		for(int i = 50; i<100; i++) {
			if(i % 9 == 0) {
				count += 1;
				//System.out.println(i);
			}
		}
		System.out.println(count +"개");
		
		
		System.out.println("======================");
		// # 문제5) 28의 배수 중에서 가장 큰 세자리 수를 구하시요.
		// # 답 980
		int max2 = 0;
		for(int i = 0; i < 1000; i++) {
			if(i % 28 == 0) {
				if(max2 < i) {
					max2 = i;
				}
			}
		}
		System.out.println(max2);
		
		System.out.println("======================");
		// # 문제6) 8의 배수를 작은수부터 5개 출력
		// # 답 : 0,8,16,24,32
		// }
		int cnt = 0;
		for(int i = 0; i<100; i++ ) {
			if(i % 8 == 0) {
				System.out.println(i);
				cnt += 1;
				if(cnt == 5) {
					break;
				}
			}
		}
	}
}
