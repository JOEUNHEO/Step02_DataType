package test.main;

public class MainClass02 {
	public static void main(String[] args) {
		//��������
		int kor = 95;
		//��������
		int eng= 100;
		//���� ���� ������ ����� ���ؼ� ����ϰ� �ʹٸ�?
		
		// �� ������ ��
		int sum = kor + eng;
		
		/*
		 *  ���� ���� ���� �ϸ� ����� ����
		 *  ������ �Ǽ��� �����ϸ� ����� �Ǽ�
		 *  ���� �����Ϳ� ���� �����͸� �����ϸ� ����� ���� �����Ͱ� �ȴ�.
		 *  ���� ���, byte �� short �� �����ϸ� ����� short �� �ȴ�.
		 */
		//���
		double ave = sum/2.0;
		//or
		double ave1 = sum/2d;		
		
		System.out.println("���:"+ave);
		System.out.println("���:"+ave1);
	}
}
