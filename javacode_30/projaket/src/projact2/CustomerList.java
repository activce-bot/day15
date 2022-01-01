package projact2;

/**
 * ��
 * 
 * @Description CustomerListΪCustomer����Ĺ���ģ�飬
 *              �ڲ����������һ��Customer���󣬲��ṩ��Ӧ����ӡ��޸ġ�ɾ���ͱ��������� \ ��CustomerView��
 * @author gjx Email:3118600260@qq.com
 * @version
 * @date 2021��11��19������3:28:24
 *
 */
public class CustomerList {
	private Customer[] customers;// ��������ͻ����������
	private int total; // ��¼�ѱ���ͻ�������

	/**
	 * ��������������ʼ��customers����
	 * 
	 * @param totalCustomer��ָ������ĳ���
	 */
	public CustomerList(int totalCustomer) {

		// ��̬��ʼ��
		customers = new Customer[totalCustomer];
	}

	/**
	 * ��;�� ��ָ���Ŀͻ���ӵ������� ������customerָ��Ҫ��ӵĿͻ����� ���أ���ӳɹ�����true��false��ʾ�����������޷����
	 * 
	 * @param customer
	 * @return
	 */
	public boolean addCustomer(Customer customer) {
		if (customers.length <= total) {

			System.out.println("�޷���ӿͻ����洢�Ѵ����ޣ�");
			return false;
		} else {

			customers[total++] = customer;
			//total++;
			return true;
		}

	}

	/**
	 * ��;���ò���customer�滻��������indexָ���Ķ��� ������customerָ���滻���¿ͻ����� indexָ�����滻�����������е�λ�ã���0��ʼ
	 * ���أ��滻�ɹ�����true��false��ʾ������Ч���޷��滻
	 * 
	 * @param index
	 * @param cust
	 * @return
	 */
	public boolean replaceCustomer(int index, Customer cust) {
		if (index < 0 || index >= total) {
			return false;
		}
	
		customers[index] = cust;
		return true;
	}

	/**
	 * ��;����������ɾ������indexָ������λ�õĿͻ������¼ ������ indexָ����ɾ�������������е�����λ�ã���0��ʼ
	 * ���أ�ɾ���ɹ�����true��false��ʾ������Ч���޷�ɾ��
	 * 
	 * @param index
	 * @return
	 */
	public boolean deleteCustomer(int index) {
		if (index < 0 || index >= total) {
			return false;
		}
		for (int i = index; i < total - 1; i++) {
			// �������ǰ��
			customers[i] = customers[i + 1];
		}
		customers[total-1] = null;

		total--;

		return true;
	}

	/**
	 * ��;�����������м�¼�����пͻ����� 
	 * ���أ� Customer[] �����а����˵�ǰ���пͻ����� �����鳤������������ͬ
	 * 
	 * @return
	 */
	public Customer[] getAllCustomers() {
		//�����԰��������鷵��
		//�����ȴ���һ�����飬��ԭ�ȵ�����ĵ�ֵַ��ֵ���´���������
		Customer[] custs = new Customer[total];
		for (int i = 0; i < total; i++) {
			custs[i] = customers[i];
		}
		return custs;
	}

	/**
	 * ��;�����ز���indexָ������λ�õĿͻ������¼ ������ indexָ����Ҫ��ȡ�Ŀͻ��������е�����λ�ã���0��ʼ
	 * ���أ���װ�˿ͻ���Ϣ��Customer����
	 * 
	 * @param index
	 * @return
	 */
	public Customer getCustomer(int index) {
		if (index < 0 || index >= total) {
			return null;
		}
		return customers[index];
	}

	/**
	 * ��ȡ�û�����
	 * 
	 * @return
	 */
	public int getTotal() {
		return total;
	}

}
