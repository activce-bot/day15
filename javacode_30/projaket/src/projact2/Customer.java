package projact2;

/**
 * Customer为实体对象，用来封装客户信息
 * 
 * @Description
 * @author gjx Email:3118600260@qq.com
 * @version
 * @date 2021年11月19日下午3:28:44
 *
 */

public class Customer {

	public static void main(String[] args) {

	}

	// 私有化
	private String name; // 名字
	private char gender;// 性别
	private int age; // 年龄
	private String phone; // 电话号码
	private String email; // 电子邮箱

	// 方法
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	// 构造器
	public Customer() {

	}

	public Customer(String name, char gender, int age, String phone, String email) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.phone = phone;
		this.email = email;
	}

}
