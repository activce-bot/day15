package exer1;

/**
 * ����ģʽ������ʽ
 * 
 * @Description
 * @author gjx Email:3118600260@qq.com
 * @version
 * @date 2021��11��25������3:35:04
 *
 */
public class SingletoTest1 {

	public static void main(String[] args) {

		order order1 = order.getInstace();
		order order2 = order.getInstace();
		// ����ֻ������һ������ Ϊtrue
		System.out.println(order1 == order2);

	}
}

/**
 * 1.˽�л���Ĺ����� 2.������ǰ�����û�г�ʼ�� 3.����public��static�ķ��ص�ǰ�����ķ��� 4.�˶���Ҳ��������Ϊstatic��
 */
class order {

	// ��������Ϊ��
	private static order instace = null;

	// 1.˽�л���Ĺ�����
	private order() {

	}

	public static order getInstace() {
		// Ϊ�շ��ش���һ������
		if (instace == null) {
			instace = new order();
		}

		return instace;
	}

}
