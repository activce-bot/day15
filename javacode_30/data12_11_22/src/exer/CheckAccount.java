package exer;

import java.util.function.Supplier;

/*
 * 创建 Account 类的一个子类 CheckAccount 代表可透支的账户，
 * 该账户中定义一个属性overdraft 代表可透支限额。
 * 在 CheckAccount 类中重写 withdraw 方法
 */
public class CheckAccount extends Account {

	private double overdraft;// 可透支的额度

	public CheckAccount(int id, double balance, double annuallnter, double overdraft) {

		super(id, balance, annuallnter);
		this.overdraft = overdraft;
	}

	public double getOverdraft() {
		return overdraft;
	}

	public void setOverdraft(double overdraft) {
		this.overdraft = overdraft;
	}

	@Override
	public void withdraw(double amount) {

		// 余额够就消费
		if (amount <= getBalance()) {
			// 调用父类的方法
			super.withdraw(amount);
			// setBalance(getBalance() - amount);
			// 或 直接设置减余额
		} else {

			// 获取的需要透支额度
			double lsbalance = amount - getBalance();

			if (lsbalance <= getOverdraft()) {

				// 设置额度为减少后的
				setOverdraft(getOverdraft() - lsbalance);

				// 设置余额为0
				setBalance(0);

				// super.withdraw(getBalance());

			} else {
				System.out.println("超过使用额度！");
			}
		}
		// 查看余额
		super.show();
	}

}
