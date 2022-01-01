package exer1;

public class Account {
	//
	private int id; // 账号
	private double balance; // 余额
	private double annualInterestRate; // 年利率

	// 构造器
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

	// 取钱操作
	public void Withdraw(double amount) {
		if (amount <= balance) {
			System.out.println("取钱金额为："+amount);
			balance -= amount;
		}
	}

	// 存钱操作
	public void deposit(double amount) {
		if (amount < 0) {
			System.out.println("操作失败");
		} else {
			balance += amount;
			System.out.println("存钱金额为："+amount);
		}
	}

}
