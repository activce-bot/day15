package projact2;

import projact2.CMUtility;

/**
 * 
 * @DescriptionΪ��ģ�飬����˵�����ʾ�ʹ����û�����
 * @author gjx Email:3118600260@qq.com
 * @version
 * @date 2021��11��19������3:29:07
 *
 */
public class CustomerView {

	CustomerList customerList = new CustomerList(10);

	/**
	 * ����ҳ����ʾ
	 */
	public CustomerView() {
		Customer customer = new Customer("caixk", '��', 18, "21343243", "1434");
		customerList.addCustomer(customer);
	}

	public void enterMainMenu() {

		char number;
		boolean isFlage = true;
		while (isFlage) {
			System.out.println("\n-----------------�ͻ���Ϣ�������-----------------\n");
			System.out.println("                   1 �� �� �� ��");
			System.out.println("                   2 �� �� �� ��");
			System.out.println("                   3 ɾ �� �� ��");
			System.out.println("                   4 �� �� �� ��");
			System.out.println("                   5 ��       ��\n");
			System.out.print("                   ��ѡ��(1-5)��");

			// ��ȡ1-5
			number = CMUtility.readMenuSelection();

			// ѡ�����
			switch (number) {
			case '1':
				addNewCustomer();
				break;
			case '2':
				modifyCustomer();
				break;
			case '3':
				deleteCustomer();
				break;
			case '4':
				listAllCustomers();
				break;
			case '5':
				System.out.print("�Ƿ�ȷ���˳� ����Y��N��");
				char isbreak = CMUtility.readConfirmSelection();

				if (isbreak == 'Y') {
					System.out.println("ϵͳ�˳��ɹ�");
					// ��������
					isFlage = false;
				}

			}

		}
	}

	/**
	 * ��ӿͻ�
	 */
	private void addNewCustomer() {
		System.out.println("---------------------��ӿͻ�---------------------");

		// ��ȡָ����Ԫ��
		System.out.print("����:");
		String name = CMUtility.readString(5);
		System.out.print("����:");
		int age = CMUtility.readInt();
		System.out.print("�Ա�:");
		char gender = CMUtility.readChar();
		System.out.print("�绰:");
		String phone = CMUtility.readString(13);
		System.out.print("����:");
		String email = CMUtility.readString(20);

		// ��Ԫ�ش��������� ������
		Customer customer = new Customer(name, gender, age, phone, email);
		boolean isFlage = customerList.addCustomer(customer);

		// �ж��Ƿ����ɹ�
		if (isFlage) {
			System.out.println("---------------------������---------------------");
		} else {
			System.out.println("---------------------���ʧ��---------------------");
		}

	}

	/**
	 * �޸Ŀͻ�
	 * 
	 */
	private void modifyCustomer() {
		System.out.println("---------------------�޸Ŀͻ�---------------------");

		int isNumber;
		Customer cust;

		// �޸ĵĽ���
		for (;;) {
			System.out.print("��������Ҫ�޸ĵ�λ��(����)(-1�˳�):");
			isNumber = CMUtility.readInt();
			// �˳�
			if (isNumber == -1) {
				return;
			}

			// Ѱ�ҿͻ�
			cust = customerList.getCustomer(isNumber - 1);
			if (cust == null) {
				System.out.println("�޷��ҵ��ͻ�");
				// �˳�ѭ��
				break;
			}

			// �ҵ��˿ͻ�

			// �޸Ŀͻ�����
			System.out.print("����(" + cust.getName() + "):");
			String name = CMUtility.readString(10, cust.getName());
			System.out.print("����(" + cust.getAge() + "):");
			int age = CMUtility.readInt(cust.getAge());
			System.out.print("�绰(" + cust.getPhone() + "):");
			String phone = CMUtility.readString(13, cust.getPhone());
			System.out.print("�Ա�(" + cust.getGender() + "):");
			char gender = CMUtility.readChar(cust.getGender());
			System.out.print("����(" + cust.getEmail() + "):");
			String email = CMUtility.readString(20, cust.getEmail());

			// ���޸ĵ�����װ���µ�����
			Customer newcust = new Customer(name, gender, age, phone, email);

			// �滻����
			customerList.replaceCustomer(isNumber-1, newcust);
			//�˳�
			return;
		}
	}

	/**
	 * ɾ���û�
	 */
	private void deleteCustomer() {
		System.out.println("---------------------ɾ���ͻ�---------------------");
		System.out.print("��������Ҫɾ����λ��(����)(-1�˳�):");

		int index = CMUtility.readInt();

		if (index == -1) {
			return;
		}
		Customer customer = customerList.getCustomer(index - 1);
		// û���ҵ�����
		if (customer == null) {
			System.out.println("�޷��ҵ�ָ���Ŀͻ���");
		}
		// �ҵ���ָ���Ŀͻ�
		System.out.print("�Ƿ�ɾ��(y��n):");
		char isDel = CMUtility.readConfirmSelection();
		if (isDel == 'Y') {
			customerList.deleteCustomer(index - 1);
			System.out.println("ɾ���ɹ�");
		}
	}

	/**
	 * �ͻ��б�
	 */
	private void listAllCustomers() {
		System.out.println("---------------------�ͻ��б�---------------------");

		// ��ȡ�ͻ�����
		int total = customerList.getTotal();
		if (total == 0) {
			System.out.println("û�пͻ���¼");
		} else {
			// ����һ������������
			// ���������һ������ Ҫʹ֮��Ӧ Customer
			Customer[] custs = customerList.getAllCustomers();
			System.out.println("���\t����\t�Ա�\t����\t�绰\t����");
			for (int i = 0; i < custs.length; i++) {
				// ���ʹ��ֵַ��ͬ����û�д����µ�����
				// ֻ��������
				Customer cust = custs[i];
				System.out.println((i + 1) + "\t" + cust.getName() + "\t" + cust.getGender() + "\t" + cust.getAge()
						+ "\t" + cust.getPhone() + "\t" + cust.getEmail());
			}
		}
	}

	public static void main(String[] args) {

		// ������Ͳ���ʹ�ó�ʼ��
		// CMUtility cmUtility = new CMUtility();

		CustomerView customerView = new CustomerView();
		// ֱ����ת����ʾҳ��
		customerView.enterMainMenu();
	}

}
