package exer1;

/*
 * 3.дһ�����Գ���
��1�� ����һ�� Customer �����ֽ� Jane Smith, ����һ���˺�Ϊ 1000�����Ϊ 2000 Ԫ��
������Ϊ 1.23�� ���˻���
��2�� �� Jane Smith ������
���� 100 Ԫ����ȡ�� 960 Ԫ����ȡ�� 2000 Ԫ��
��ӡ�� Jane Smith �Ļ�����Ϣ
�й�� Java ������� �κ쿵
�ɹ����� ��100.0
�ɹ�ȡ����960.0
���㣬ȡ��ʧ��
Customer [Smith, Jane] has a account: id is 1000, annualInterestRate is 1.23��, balance is 
1140.0
 * 
 * 
 * 
 */
public class CustomerTest {
	public static void main(String[] args) {
		// �����˺�
		Customer cust = new Customer("jane", "smith");

		// ��ʼ���˺� ���2000��������1.23%
		Account acco =new Account(1000, 2000, 0.0123);
		
		//�����û��˺�Ϊacco
		cust.setAccount(acco);
		
		//ͨ�������˺�Ϊacco����ȡacco��Ӧ�����еķ���
		//���û���Ǯ
		cust.getAccount().deposit(100);
		//�û�ȡǮ
		cust.getAccount().Withdraw(960);
		
		System.out.println("�û�����Ϊ��"+cust.getFirstName()+" "+cust.getLastName()+
				",���Ϊ:"+cust.getAccount().getBalance());
		
	}
	
}
