package data4;

import java.util.Scanner;

public class Scannertest {
	public static void main(String[] args) {
		// scannerʵ����
		Scanner scan = new Scanner(System.in);
		// System.out.println("�������������");
		// String name=scan.next();
		// System.out.println(name);

		// �ɼ���Ӧ
		System.out.print("��������ĳɼ�(100��0):");
		int crom = scan.nextInt();
		if (crom <= 100 && crom >= 0) {
			if (crom == 100) {
				System.out.println("����");
			} else if (crom >= 90) {
				System.out.println("�ɼ�����");
			} else if (crom >= 70) {
				System.out.println("�ɼ��ϸ�");
			} else {
				System.out.println("�ɼ����ϸ�");
			}
		} else {
			System.out.println("��������ȷ����ֵ");
		}
		scan.close();
	}
}