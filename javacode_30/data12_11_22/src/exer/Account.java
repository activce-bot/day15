package exer;
/**
 * 1��дһ����Ϊ Account ����ģ���˻���
 * ��������Ժͷ�������ͼ��ʾ��������������ԣ�
	�˺� id����� balance�������� annualInterestRate��
	�����ķ�����������������getter ��setter ��������
	���������ʵķ��� getMonthlyInterest()��
	ȡ��� withdraw()��
	����deposit()��
* @Description
* @author gjx Email:3118600260@qq.com
* @version
* @date 2021��11��22������3:17:25
*
 */
public class Account {

	private int id;// �˻�
	private double balance;// ���
	private double annuallnterestRate;// ������
	
	
	
	public Account(int id, double balance, double annuallnter) {
		this.id = id;
		this.balance = balance;
		this.annuallnterestRate = annuallnter;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnuallnterestRate() {
		return annuallnterestRate;
	}

	public void setAnnuallnterestRate(double annuallnterestRate) {
		this.annuallnterestRate = annuallnterestRate;
	}

	// ����������
	public double getMonthlyInterest() {
		return getAnnuallnterestRate() / 12;
	}

	// ȡ��
	public void withdraw(double amount) {
		
		if (amount > balance) {
			System.out.println("ȡ��ʧ�ܣ�����"+"�����Ϊ��"+balance);
		} else {
			balance -= amount;
			System.out.println("ȡ��ɹ������Ϊ��" + balance);
		}

	}

	// ���
	public void deposit(double amount) {
		balance+=amount;
		System.out.println("���ɹ������Ϊ"+balance);
	}
	//�鿴���
	public void show() {
		System.out.println("���Ϊ��"+this.balance);
	}

}
