package exer;

import java.util.Scanner;
import java.util.Vector;

/**
 * ����Vector�������鴦���Ӽ��̶���ѧ���ɼ����Ը�������������������ҳ���߷֣������ѧ���ɼ��ȼ���
 * ��ʾ������һ�����������Ⱦ͹̶����䣬�����ڴ�������ǰ����Ҫ֪�����ĳ��ȡ� ��������java.util.Vector���Ը�����Ҫ��̬������
 * 
 * ����Vector����Vector v=new Vector(); ���������Ԫ�أ�v.addElement(Object obj);
 * //obj�����Ƕ��� ȡ�������е�Ԫ�أ�Object obj=v.elementAt(0); ע���һ��Ԫ�ص��±���0������ֵ��Object���͵ġ�
 * ���������ĳ��ȣ�v.size(); ������߷����10���ڣ�A�ȣ�20���ڣ�B�ȣ� 30���ڣ�C�ȣ�������D��
 *
 */
public class ScoreTest {

	public static void main(String[] args) {

		// 1,ʵ����Scanner
		Scanner scan = new Scanner(System.in);
		// 2.��������
		Vector v = new Vector();

		// 3.�������
		int maxnumber = 0;

		for (;;) {
			System.out.print("������ѧ���ɼ�(�����Ǹ����ͽ���):");
			int nextint = scan.nextInt();

			// 3.1����ѭ��
			if (nextint < 0) {
				break;
			} else if (nextint > 100) {
				System.out.println("����������������������룡");
				continue;
			}
			// ��ȡ��������

			// Integer integer = new Integer(nextint);
			v.addElement(nextint);

			// 4.��ȡ�����ֵ
			if (maxnumber < nextint) {
				maxnumber = nextint;
			}

		}

		// 5.�������ֵ ��ȡ��ֵ
		char level;
		for (int i = 0; i < v.size(); i++) {
			Object obj = v.elementAt(i);

			int score = (int) obj;

			if (maxnumber - score <= 10) {
				level = 'A';
			} else if (maxnumber - score <= 20) {
				level = 'B';
			} else if (maxnumber - score <= 30) {
				level = 'C';
			} else {
				level = 'D';
			}
			System.out.println("student:" + (i+1) + " score is " + score + ",level is " + level);
		}
		// 6.����ɼ�abcd
	}
}
