package projact2;

import projact2.CMUtility;

/**
 * 
 * @Description为主模块，负责菜单的显示和处理用户操作
 * @author gjx Email:3118600260@qq.com
 * @version
 * @date 2021年11月19日下午3:29:07
 *
 */
public class CustomerView {

	CustomerList customerList = new CustomerList(10);

	/**
	 * 进入页面显示
	 */
	public CustomerView() {
		Customer customer = new Customer("caixk", '男', 18, "21343243", "1434");
		customerList.addCustomer(customer);
	}

	public void enterMainMenu() {

		char number;
		boolean isFlage = true;
		while (isFlage) {
			System.out.println("\n-----------------客户信息管理软件-----------------\n");
			System.out.println("                   1 添 加 客 户");
			System.out.println("                   2 修 改 客 户");
			System.out.println("                   3 删 除 客 户");
			System.out.println("                   4 客 户 列 表");
			System.out.println("                   5 退       出\n");
			System.out.print("                   请选择(1-5)：");

			// 读取1-5
			number = CMUtility.readMenuSelection();

			// 选择操作
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
				System.out.print("是否确认退出 ：（Y或N）");
				char isbreak = CMUtility.readConfirmSelection();

				if (isbreak == 'Y') {
					System.out.println("系统退出成功");
					// 结束方法
					isFlage = false;
				}

			}

		}
	}

	/**
	 * 添加客户
	 */
	private void addNewCustomer() {
		System.out.println("---------------------添加客户---------------------");

		// 获取指定的元素
		System.out.print("姓名:");
		String name = CMUtility.readString(5);
		System.out.print("年龄:");
		int age = CMUtility.readInt();
		System.out.print("性别:");
		char gender = CMUtility.readChar();
		System.out.print("电话:");
		String phone = CMUtility.readString(13);
		System.out.print("邮箱:");
		String email = CMUtility.readString(20);

		// 将元素存入数组中 构造器
		Customer customer = new Customer(name, gender, age, phone, email);
		boolean isFlage = customerList.addCustomer(customer);

		// 判断是否加入成功
		if (isFlage) {
			System.out.println("---------------------添加完成---------------------");
		} else {
			System.out.println("---------------------添加失败---------------------");
		}

	}

	/**
	 * 修改客户
	 * 
	 */
	private void modifyCustomer() {
		System.out.println("---------------------修改客户---------------------");

		int isNumber;
		Customer cust;

		// 修改的界面
		for (;;) {
			System.out.print("请输入需要修改的位置(数字)(-1退出):");
			isNumber = CMUtility.readInt();
			// 退出
			if (isNumber == -1) {
				return;
			}

			// 寻找客户
			cust = customerList.getCustomer(isNumber - 1);
			if (cust == null) {
				System.out.println("无法找到客户");
				// 退出循环
				break;
			}

			// 找到了客户

			// 修改客户数据
			System.out.print("姓名(" + cust.getName() + "):");
			String name = CMUtility.readString(10, cust.getName());
			System.out.print("年龄(" + cust.getAge() + "):");
			int age = CMUtility.readInt(cust.getAge());
			System.out.print("电话(" + cust.getPhone() + "):");
			String phone = CMUtility.readString(13, cust.getPhone());
			System.out.print("性别(" + cust.getGender() + "):");
			char gender = CMUtility.readChar(cust.getGender());
			System.out.print("邮箱(" + cust.getEmail() + "):");
			String email = CMUtility.readString(20, cust.getEmail());

			// 将修改的数据装入新的数组
			Customer newcust = new Customer(name, gender, age, phone, email);

			// 替换数组
			customerList.replaceCustomer(isNumber-1, newcust);
			//退出
			return;
		}
	}

	/**
	 * 删除用户
	 */
	private void deleteCustomer() {
		System.out.println("---------------------删除客户---------------------");
		System.out.print("请输入需要删除的位置(数字)(-1退出):");

		int index = CMUtility.readInt();

		if (index == -1) {
			return;
		}
		Customer customer = customerList.getCustomer(index - 1);
		// 没有找到数组
		if (customer == null) {
			System.out.println("无法找到指定的客户！");
		}
		// 找到了指定的客户
		System.out.print("是否删除(y或n):");
		char isDel = CMUtility.readConfirmSelection();
		if (isDel == 'Y') {
			customerList.deleteCustomer(index - 1);
			System.out.println("删除成功");
		}
	}

	/**
	 * 客户列表
	 */
	private void listAllCustomers() {
		System.out.println("---------------------客户列表---------------------");

		// 获取客户数量
		int total = customerList.getTotal();
		if (total == 0) {
			System.out.println("没有客户记录");
		} else {
			// 创建一个数组来接收
			// 这个东西是一个数组 要使之对应 Customer
			Customer[] custs = customerList.getAllCustomers();
			System.out.println("编号\t姓名\t性别\t年龄\t电话\t邮箱");
			for (int i = 0; i < custs.length; i++) {
				// 这个使地址值相同，并没有创建新的数组
				// 只是引用了
				Customer cust = custs[i];
				System.out.println((i + 1) + "\t" + cust.getName() + "\t" + cust.getGender() + "\t" + cust.getAge()
						+ "\t" + cust.getPhone() + "\t" + cust.getEmail());
			}
		}
	}

	public static void main(String[] args) {

		// 导入包就不用使用初始化
		// CMUtility cmUtility = new CMUtility();

		CustomerView customerView = new CustomerView();
		// 直接跳转到显示页面
		customerView.enterMainMenu();
	}

}
