package exer1;
/**
 * �������ģʽ��
 * 1. ��ν��ĵ������ģʽ�����ǲ�ȡһ���ķ�����֤�����������ϵͳ�У���ĳ����ֻ�ܴ���һ������ʵ����
 * 
 * 2. ���ʵ�֣�
 * 	 ����ʽ  vs ����ʽ
 * 
 * 3. ���ֶ���ʽ �� ����ʽ
 *   ����ʽ��	
 *   	�������������ʱ�������
 *   	�ô�������ʽ���̰߳�ȫ��
 *   
 *   ����ʽ���ô����ӳٶ���Ĵ�����
 * 		  Ŀǰ��д���������̲߳���ȫ��--->�����߳�����ʱ�����޸�
 * 
 * 
 */
public class SingletoTest2 {
	
	public static void main(String[] args) {
	
	bank bakn2=bank.getInstace();
	bank bakn3=bank.getInstace();
	System.out.println( bakn2==bakn3);
	
		
	}
}

/**
 * 1.˽�л���Ĺ����� 2.������ǰ�����û�г�ʼ�� 3.����public��static�ķ��ص�ǰ�����ķ��� 4.�˶���Ҳ��������Ϊstatic��
 */
class bank{
	
	private static bank bank1=new bank();
	
	private bank() {
		
	}
	public static  bank getInstace() {
		
		return bank1;
		
	}
}