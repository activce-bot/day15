package data6_11_9;

/**
 * 
 * @Description ������ӡ
 * @author gjx Email:3118600260@qq.com
 * @version
 * @date 2021��11��13������9:01:02
 *
 */
public class NumberSSHU {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ��������Ϊ��
		boolean isFlage = true;
		int tmp = 0;

		for (int i = 2; i < 100; i++) {
			for (int j = 2; j < i; j++) {
				// �ж��Ƿ�Ϊ����
				if (i % j == 0) {
					isFlage = false;
					break;
				}

			}
			// �����������
			if (isFlage) {
				tmp++;
				System.out.print(String.format("%-4s", i));
				if (tmp % 10 == 0) {
					System.out.println();
				}
			}

			// ����isFlage
			isFlage = true;
		}
		System.out.println();
		System.out.println("����Ϊ" + tmp + "����");
	}

}
