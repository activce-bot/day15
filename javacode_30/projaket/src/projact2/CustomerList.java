package projact2;

/**
 * 用
 * 
 * @Description CustomerList为Customer对象的管理模块，
 *              内部用数组管理一组Customer对象，并提供相应的添加、修改、删除和遍历方法， \ 供CustomerView调
 * @author gjx Email:3118600260@qq.com
 * @version
 * @date 2021年11月19日下午3:28:24
 *
 */
public class CustomerList {
	private Customer[] customers;// 用来保存客户对象的数组
	private int total; // 记录已保存客户的数量

	/**
	 * 构造器，用来初始化customers数组
	 * 
	 * @param totalCustomer：指定数组的长度
	 */
	public CustomerList(int totalCustomer) {

		// 动态初始化
		customers = new Customer[totalCustomer];
	}

	/**
	 * 用途： 将指定的客户添加到数组中 参数：customer指定要添加的客户对象 返回：添加成功返回true；false表示数组已满，无法添加
	 * 
	 * @param customer
	 * @return
	 */
	public boolean addCustomer(Customer customer) {
		if (customers.length <= total) {

			System.out.println("无法添加客户，存储已达上限！");
			return false;
		} else {

			customers[total++] = customer;
			//total++;
			return true;
		}

	}

	/**
	 * 用途：用参数customer替换数组中由index指定的对象 参数：customer指定替换的新客户对象 index指定所替换对象在数组中的位置，从0开始
	 * 返回：替换成功返回true；false表示索引无效，无法替换
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
	 * 用途：从数组中删除参数index指定索引位置的客户对象记录 参数： index指定所删除对象在数组中的索引位置，从0开始
	 * 返回：删除成功返回true；false表示索引无效，无法删除
	 * 
	 * @param index
	 * @return
	 */
	public boolean deleteCustomer(int index) {
		if (index < 0 || index >= total) {
			return false;
		}
		for (int i = index; i < total - 1; i++) {
			// 后面的往前移
			customers[i] = customers[i + 1];
		}
		customers[total-1] = null;

		total--;

		return true;
	}

	/**
	 * 用途：返回数组中记录的所有客户对象 
	 * 返回： Customer[] 数组中包含了当前所有客户对象， 该数组长度与对象个数相同
	 * 
	 * @return
	 */
	public Customer[] getAllCustomers() {
		//不可以把整个数组返回
		//我们先创建一个数组，把原先的数组的地址值赋值给新创建的数组
		Customer[] custs = new Customer[total];
		for (int i = 0; i < total; i++) {
			custs[i] = customers[i];
		}
		return custs;
	}

	/**
	 * 用途：返回参数index指定索引位置的客户对象记录 参数： index指定所要获取的客户在数组中的索引位置，从0开始
	 * 返回：封装了客户信息的Customer对象
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
	 * 获取用户个数
	 * 
	 * @return
	 */
	public int getTotal() {
		return total;
	}

}
