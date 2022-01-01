package exer1;

public class Account {
	//
	private int id; // �˺�
	private double balance; // ���
	private double annualInterestRate; // ������

	// ������
	public Account(int id, double balance, double annualInterestRate) {
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
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

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	// ȡǮ����
	public void Withdraw(double amount) {
		if (amount <= balance) {
			System.out.println("ȡǮ���Ϊ��"+amount);
			balance -= amount;
		}
	}

	// ��Ǯ����
	public void deposit(double amount) {
		if (amount < 0) {
			System.out.println("����ʧ��");
		} else {
			balance += amount;
			System.out.println("��Ǯ���Ϊ��"+amount);
		}
	}

}
