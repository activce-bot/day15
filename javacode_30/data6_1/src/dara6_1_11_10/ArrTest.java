
package dara6_1_11_10;

import java.util.Scanner;



/**
 * @author Guan_x_c
 * @version 1.8
 * @date 2021��11��10������7:45:27
 */
/**
 * @author Guan_x_c
 * @version 1.8
 * @date 2021��11��10������8:08:41
 */
/**
 * @author Guan_x_c
 * @version 1.8
 * @date 2021��11��10������8:08:42
 */
public class ArrTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ����һά����

		// ʵ����Scanner
		Scanner scan = new Scanner(System.in);

		int[] arr1 = { 1000, 2000 };
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}

		// �����������������
		System.out.println("����������ĳ���");
		int number = scan.nextInt();
		//	��������
		int[] id = new int[number];
		for (int i = 0; i < id.length; i++) {
			System.out.println("�������" + (i + 1) + "������");
			id[i] = scan.nextInt();
		}
		//�������
		System.out.println("���Ϊ�� ");
		for (int i = 0; i < id.length; i++) {
			System.out.print(id[i] + " ");
		}

	}
}
