package exer;
/**
 * 1、写一个名为 Account 的类模拟账户。
 * 该类的属性和方法如下图所示。该类包括的属性：
	账号 id，余额 balance，年利率 annualInterestRate；
	包含的方法：访问器方法（getter 和setter 方法），
	返回月利率的方法 getMonthlyInterest()，
	取款方法 withdraw()，
	存款方法deposit()。
* @Description
* @author gjx Email:3118600260@qq.com
* @version
* @date 2021年11月22日下午3:17:25
*
 */
public class Account {

	private int id;// 账户
	private double balance;// 余额
	private double annuallnterestRate;// 年利率
	
	
	
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

	// 返回月利率
	public double getMonthlyInterest() {
		return getAnnuallnterestRate() / 12;
	}

	// 取款
	public void withdraw(double amount) {
		
		if (amount > balance) {
			System.out.println("取款失败，余额不足"+"，余额为："+balance);
		} else {
			balance -= amount;
			System.out.println("取款成功，余额为：" + balance);
		}

	}

	// 存款
	public void deposit(double amount) {
		balance+=amount;
		System.out.println("存款成功，余额为"+balance);
	}
	//查看余额
	public void show() {
		System.out.println("余额为："+this.balance);
	}

}
