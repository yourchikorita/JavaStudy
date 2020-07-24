package step1_08.ifEx;

/*
 * # if문의 구조 3가지
 * 1.
 * if(조건식){
 * 		조건식이 참(true)일 때, 실행할 문장;
 * }
 * 
 * 2.
 * if(조건식){
 * 		조건식이 참(true)일 때, 실행할 문장;
 * }else{
 * 		조건식이 거짓(false)일 때, 실행할 문장;
 * }
 * 
 * 3.
 * if(조건식1){
 * 		조건식1이 참(true)일 때, 실행할 문장;
 * }else if(조건식2){
 * 		조건식2가 참(true)일 때, 실행할 문장;
 * }else if(조건식3){
 * 		조건식3이 참(true)일 때, 실행할 문장;
 * }else{
 * 		위 조건을 모두 만족하지 않을 때, 실행할 문장;
 * }
 */

public class IfEx13 {
	public static void main(String[] args) {

		// 예) 홀짝
		int num = 10;
		if(num % 2 == 0) { 
			System.out.println("짝수"); 
		}
		if(num % 2 == 1) { 
			System.out.println("홀수"); 
		}

		/*
		 * 실행할 문장이 1문장인 경우,
		 * 블럭{}을 생략할 수 있다.
		 * 하지만 권장하지 않는다!
		 */
		if(num % 2 == 0) 
			System.out.println("짝수"); 
		
		if(num % 2 == 1)  
			System.out.println("홀수"); 
		
		if(num % 2 == 0) { 
			System.out.println("짝수"); 
		}
		else { 
			System.out.println("홀수"); 
		}
		
		/*
		 * if - else if 구문은
		 * 다중 택 일로 참인 조건식을 만나면,
		 * 이하 조건은 실행하지 않는다.
		 */
		if(10 == 10) {
			System.out.println(10);
		}
		if(11 == 11) {
			System.out.println(11);
		}
		
		if(10 == 10) {
			System.out.println(10);
		}else if(11 == 11) {
			System.out.println(11);
		}	
	}
}
