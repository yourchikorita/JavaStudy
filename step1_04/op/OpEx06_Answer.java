package step1_04.op;

public class OpEx06_Answer {
	public static void main(String[] args) {

		//��) ������ 60�� �̻��̸� true ���
        int score = 30;
        System.out.println(score >= 60);
        
        //����1) 3�� ����̸� true ���
        //��Ʈ1) ���� % 3 == 0 (3�� ���)
        int num = 15;
        System.out.println(num % 3 == 0);
        
        //����2) ¦���̸� true ���
        //��Ʈ2) ���� % 2 == 0 (¦��)
        //��Ʈ2) ���� % 2 == 1 (Ȧ��)
        num = 22;
        System.out.println(num % 2 == 0);
        
        //����3)�Ʒ����� 1000��¥�� �̻�ȭ�� ������
               // 1000��¥���� 3�� �̻��̸� true ���
        int money = 178600;
        System.out.println((money % 5000 / 1000) >= 3);
        
	}


}
