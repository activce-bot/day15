package exer;
/*
 * 	编写一个类实现银行账户的概念，包含的属性有“帐号”、“密码”、“存款余额”、“利率”、“最小余额”，
 * 	定义封装这些属性的方法。账号要自动生成。
	编写主类，使用银行账户类，输入、输出3个储户的上述信息。
	考虑：哪些属性可以设计成static属性。
 * 
 * 
 */

public class Account {

	private int id;// 账户id
	private String pwd = "000000";// 初始化密码
	private double balance;// 账户余额
	private int total;// 计算 创建用户的个数

	private static double minMoney = 1.0;// 最小存入金额
	private static int init = 1001;// 用于自动生成id使用的

	public Account() {
		// 自动创建用户
		id = init++;
		total++;
	}

	public Account(String pwd, double balance) {
		this();
		this.balance = balance;
		this.pwd = pwd;
		// 不要忘记自动创建用户
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
		System.out.println("静态方法的使用！");

	}
}
