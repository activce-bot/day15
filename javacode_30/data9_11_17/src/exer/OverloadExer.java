package exer;

/**
 * 
 * @Description
 * @author gjx Email:3118600260@qq.com
 * @version
 * @date 2021��11��17������10:33:49 ����
 *
 *
 */

public class OverloadExer {

	public static void main(String[] args) {

		OverloadExer test = new OverloadExer();
		test.mol(3);
		test.mol(3, 5);
		test.mol(new int[] { 2, 3, 4, 5, 6, 7 });
		test.mol(3,4,5,6,8);
	}

	// ����
	public void mol(int i) {
		System.out.println(i * i);
	}

	public void mol(int i, int j) {
		System.out.println(i * j);
	}

	// �ɱ��β� �����ɱ�  ���Լ�������
	public void mol(int... strs) {
		System.out.println("all");
		for (int i = 0; i < strs.length; i++) {
			System.out.print(strs[i]+" ");
		}
		System.out.println();
	}

}
