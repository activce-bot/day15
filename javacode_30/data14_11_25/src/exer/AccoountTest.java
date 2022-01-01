package exer;

public class AccoountTest {
	public static void main(String[] args) {
		Account.show();
		Account acc1=new Account("123456",100);
		System.out.println(acc1.getId());
		System.out.println(acc1.toString());
		
		Account acc2=new Account("123456",100);
		System.out.println(acc2.getId());
		System.out.println(acc2.toString());
		
		double minMoney = Account.getMinMoney();
		System.out.println(minMoney);
		
		
		
		
	}
	
}
