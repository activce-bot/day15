package exer1;

/*
 * 3.写一个测试程序。
（1） 创建一个 Customer ，名字叫 Jane Smith, 他有一个账号为 1000，余额为 2000 元，
年利率为 1.23％ 的账户。
（2） 对 Jane Smith 操作。
存入 100 元，再取出 960 元。再取出 2000 元。
打印出 Jane Smith 的基本信息
尚硅谷 Java 基础编程 宋红康
成功存入 ：100.0
成功取出：960.0
余额不足，取款失败
Customer [Smith, Jane] has a account: id is 1000, annualInterestRate is 1.23％, balance is 
1140.0
 * 
 * 
 * 
 */
public class CustomerTest {
	public static void main(String[] args) {
		// 创建账号
		Customer cust = new Customer("jane", "smith");

		// 初始化账号 余额2000，年利率1.23%
		Account acco =new Account(1000, 2000, 0.0123);
		
		//设置用户账号为acco
		cust.setAccount(acco);
		
		//通过设置账号为acco，调取acco对应的类中的方法
		//对用户存钱
		cust.getAccount().deposit(100);
		//用户取钱
		cust.getAccount().Withdraw(960);
		
		System.out.println("用户姓名为："+cust.getFirstName()+" "+cust.getLastName()+
				",余额为:"+cust.getAccount().getBalance());
		
	}
	
}
