package exer;
/*
 * 	��дһ����ʵ�������˻��ĸ�������������С��ʺš��������롱����������������ʡ�������С����
 * 	�����װ��Щ���Եķ������˺�Ҫ�Զ����ɡ�
	��д���࣬ʹ�������˻��࣬���롢���3��������������Ϣ��
	���ǣ���Щ���Կ�����Ƴ�static���ԡ�
 * 
 * 
 */

public class Account {

	private int id;// �˻�id
	private String pwd = "000000";// ��ʼ������
	private double balance;// �˻����
	private int total;// ���� �����û��ĸ���

	private static double minMoney = 1.0;// ��С������
	private static int init = 1001;// �����Զ�����idʹ�õ�

	public Account() {
		// �Զ������û�
		id = init++;
		total++;
	}

	public Account(String pwd, double balance) {
		this();
		this.balance = balance;
		this.pwd = pwd;
		// ��Ҫ�����Զ������û�
		// id=init++;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public static double getMinMoney() {
		return minMoney;
	}

	public static void setMinMoney(double minMoney) {
		Account.minMoney = minMoney;
	}

	public int getId() {
		return id;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", balance=" + balance + "]";
	}

	public static void show() {
		System.out.println("��̬������ʹ�ã�");

	}
}
