package exer;

public class TestAccount {
	public static void main(String[] args) {
		
		Account acco = new Account(1122,20000,0.045);
		
		acco.withdraw(30000);
		
		acco.withdraw(2500);
		
		acco.deposit(3000);
		
		System.out.println("账户月利率为:"+(acco.getMonthlyInterest()*100)+"%");
		
	}
	
}
