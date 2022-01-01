package exer;

public class TestCheckAccount {
	public static void main(String[] args) {
		CheckAccount check = new CheckAccount(1122, 20000, 0.045, 5000);

		check.withdraw(5000);
		System.out.println("可以使用额度为：" + check.getOverdraft());
		System.out.println();

		check.withdraw(18000);
		System.out.println("可以使用额度为：" + check.getOverdraft());

		System.out.println();
		check.withdraw(3000);		
		
		System.out.println("可以使用额度为：" + check.getOverdraft());

	}
}
