package exer;

public class InstanceTest {

	public static void main(String[] args) {

		InstanceTest test = new InstanceTest();
		//��������
		test.mathod(new Student());

	}

	// ����person�ļ̳���
	public void mathod(Person e) {
		String info = e.getInfo();
		System.out.println(info);
		
		System.out.println();
		if (e instanceof Graduate) {
			System.out.println("��a graduated student��");

			System.out.println("��a student��");
			System.out.println("��a person��");
		} else if (e instanceof Student) {
			System.out.println("��a student��");
			System.out.println("��a person��");
		} else {
			System.out.println("��a person��");
		}

	}

}

class Person {
	protected String name = "person";
	protected int age = 50;

	public String getInfo() {
		return "Name: " + name + "\n" + "age: " + age;
	}
}

class Student extends Person {
	protected String school = "pku";

	public String getInfo() {
		return "Name: " + name + "\nage: " + age + "\nschool: " + school;
	}
}

class Graduate extends Student {
	public String major = "IT";

	public String getInfo() {
		return "Name: " + name + "\nage: " + age + "\nschool: " + school + "\nmajor:" + major;
	}
}