package exerjava8;

public class SubClassTest {
	public static void main(String[] args) {
		SubClass s = new SubClass();
		// Ĭ�Ϸ�������ʹ����Ķ���ֱ�ӵ����
		s.method2();
		s.method3();
		// ��̬����ֻ����ʹ�ýӿ������ã��Լ�ʹ��
		ComepareA.method1();
		System.out.println("------------------------");
		s.myMethod();
	}
}

class SubClass extends SupClass implements ComepareA, CompareB {

	// ����д������д��
	@Override
	public void method2() {
		System.out.println("SubClass.��д2");
	}

	// �Լ�����ʹ���Լ���
	@Override
	public void method3() {
		System.out.println("SubClass.��д3");
	}


	// ����ӿڣ��ӿڳ�ͻ��ô��
	// 1.�Լ���дһ��
	//2.
	public void myMethod() {
		super.method3();// ���ø����
		ComepareA.super.method3();// ��������ĳ���ӿڵķ���
		CompareB.super.method3();

	}

}