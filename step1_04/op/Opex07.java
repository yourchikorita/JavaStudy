package step1_04.op;

/*
 * 4. �� ������
 * 
 * 1. ����
 * 1) &&(and) : ���� ��� ���̾��, �� 
 * 2) ||(or) : ��� �����̶� ���̸�, ��
 * 
 * 2. ����
 * 1) �� �����ڸ� ���� �������� �񱳿����ڸ� ������ �� �ִ�.
 * 2) �� �����ڸ� ���� ���� ������ �����ϴ�. 
 */


public class Opex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(10 == 10 && 3 == 3);
		System.out.println(10 != 10 && 3 == 3);
		System.out.println(10 == 10 && 3 != 3);
		System.out.println(10 != 10 && 3 != 3);
		
		System.out.println();
		
		System.out.println(10 == 10 || 3 == 3);
		System.out.println(10 != 10 || 3 == 3);
		System.out.println(10 == 10 || 3 != 3);
		System.out.println(10 != 10 || 3 != 3);


	}

}
