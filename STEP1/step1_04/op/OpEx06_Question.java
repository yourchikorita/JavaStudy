package step1_04.op;

public class OpEx06_Question {

	public static void main(String[] args) {
		//��) ������ 60�� �̻��̸� true ���
        int score = 30;
        System.out.println(score >= 60);
        
        //����1) 3�� ����̸� true ���
        System.out.println(score % 3 == 0);
        //��Ʈ1) ���� % 3 == 0 (3�� ���)
        
        //����2) ¦���̸� true ���
        int num = 20;
        System.out.println(num % 2 == 0);
        //��Ʈ2) ���� % 2 == 0 (¦��)
        //��Ʈ2) ���� % 2 == 1 (Ȧ��)
        
         //����3)�Ʒ����� 1000��¥�� �̻�ȭ�� ������
                //1000��¥���� 3�� �̻��̸� true ���
         int money = 178600;
        System.out.println(money % 5000 > 3);

	}

}
