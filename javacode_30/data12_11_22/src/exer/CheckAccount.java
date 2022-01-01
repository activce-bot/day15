package exer;

import java.util.function.Supplier;

/*
 * ���� Account ���һ������ CheckAccount �����͸֧���˻���
 * ���˻��ж���һ������overdraft �����͸֧�޶
 * �� CheckAccount ������д withdraw ����
 */
public class CheckAccount extends Account {

	private double overdraft;// ��͸֧�Ķ��

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

		// ��������
		if (amount <= getBalance()) {
			// ���ø���ķ���
			super.withdraw(amount);
			// setBalance(getBalance() - amount);
			// �� ֱ�����ü����
		} else {

			// ��ȡ����Ҫ͸֧���
			double lsbalance = amount - getBalance();

			if (lsbalance <= getOverdraft()) {

				// ���ö��Ϊ���ٺ��
				setOverdraft(getOverdraft() - lsbalance);

				// �������Ϊ0
				setBalance(0);

				// super.withdraw(getBalance());

			} else {
				System.out.println("����ʹ�ö�ȣ�");
			}
		}
		// �鿴���
		super.show();
	}

}
