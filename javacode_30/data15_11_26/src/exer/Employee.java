package exer;
/**
 * ��дһ��Employee�࣬����Ϊ�����࣬
���������������ԣ�name��id��salary��
�ṩ��Ҫ�Ĺ������ͳ��󷽷���work()��
* @Description
* @author gjx Email:3118600260@qq.com
* @version
* @date 2021��11��26������4:34:43
*
 */

abstract public class Employee {
	
	private String name;//����
	private int id;//id
	private int salary;//
	
	public Employee(String name, int id, int salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	//������ķ����з�����Ϊ��
	public abstract void work();
	
	
}
