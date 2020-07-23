package step1_03;

public class VarEx03 {


/* # 변수의 명명규칙
 * 1. 숫자로 시작할 수 없다.
 * 2. 특수문자는 _, $만을 허용한다.
 * 3. 예약어(키워드)는 사용할 수 없다.
 *    ex) public, class, static, void...
 * 4. 자바는 알파벳의 대소문자를 구분한다.
 * --------------------------------------
 * 1. 패키지명, 변수명은 소문자로 시작한다.
 * 2. 클래스명은 대문자로 시작한다.
*/

/*
 * 
 *  변수 명명 규칙
 * 
 *  1) 절대적규칙 (법)
 * 
 *  - 변수명에 띄어쓰기를 사용할 수 없다.
 *  - 변수명에 $와 _를 제외한 특수문자를 사용할 수 없다.
 *  - 변수명에 숫자는 사용가능하나 숫자로 시작할 수 없다.
 *  - 예약어를 사용할 수 없다.    ex) int , void (색깔있는거...) 
 *  - 대소문자를 구별한다.      Ex) productCode != ProductCode
 * 
 *  2) 암묵적규칙 ( 사회적약속, 룰 )
 *  
 *  - 변수명은 소문자로 시작한다.
 *  - 변수명에 한글을 사용하지 않는다.
 *  - 두 단어가 이어지는 경우 이어지는 단어의 첫글자를 대문자로 작성한다. (camel case)
 *    Ex) productCode , studentName
 *  - 두 단어가 이어지는 경우 이어지는 단어를 _로 이어준다. (snake case) 
 *    Ex) product_code , student_name
 *  - '제3자가'보아도 변수안의 데이터를 '직관적'으로 알 수 있도록 변수명을 작성한다. (제일 중요)
 *    ex) a (x)    , productCode (o)
 *    
 *  
 * */	
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
	 int test = 1;
     int Test = 2;
     System.out.println(test);
     System.out.println(Test);
     
     int $money = 1000; //오 $ 허용
     int curPos = -1;    // 현재위치(current position)
     
     // int 1num = 10;
     // int #test = 10;
     // int void = 20;


	}

}
