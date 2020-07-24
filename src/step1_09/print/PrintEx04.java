package step1_09.print;

public class PrintEx04 {

	public static void main(String[] args) {
		System.out.printf("%d", 10);
		System.out.println();
		
		System.out.printf("%f\n", 3.14);
		System.out.printf("%.2f\n", 3.14);
		
		System.out.printf("%c\n", 'b');
		
		System.out.printf("%s", "출력문의이해");
		
		String fruit = "사과";
		int cnt = 5;
		System.out.printf("%s가 %d개 있습니다.\n", fruit, cnt);


	}

}
