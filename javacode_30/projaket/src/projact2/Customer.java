package projact2;

/**
 * CustomerΪʵ�����������װ�ͻ���Ϣ
 * 
 * @Description
 * @author gjx Email:3118600260@qq.com
 * @version
 * @date 2021��11��19������3:28:44
 *
 */

public class Customer {

	public static void main(String[] args) {

	}

	// ˽�л�
	private String name; // ����
	private char gender;// �Ա�
	private int age; // ����
	private String phone; // �绰����
	private String email; // ��������

	// ����
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

	// ������
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
