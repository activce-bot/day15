package datas8_11_16;

public class student {
	public static void main(String[] args) {

		// �������Զ������
		studentTEST[] statu = new studentTEST[20];
		// ��������
		for (int i = 0; i < statu.length; i++) {
			statu[i] = new studentTEST();

			// ѧ��
			statu[i].munber = i + 1; 
			// �꼶 (1-6)
			statu[i].status = (int) (Math.random() * (6 - 1 + 1) + 1);

			// �ɼ� 0-100
			statu[i].score = (int) (Math.random() * (100) + 1);
		}

		// ����
		for (int i = 0; i < statu.length; i++) {
			statu[i].allstuden();

		}
		// �꼶Ϊ�������
		System.out.println("------");
		for (int i = 0; i < statu.length; i++) {
			if (statu[i].status == 3) {
				statu[i].allstuden();
			}
		}
		
		
//		// ð������
//		System.out.println("-----------");
//		for (int i = 0; i < statu.length; i++) {
//			for (int j = 0; j < statu.length - 1 - i; j++) {
//				// System.out.println("---"+j);
//				if (statu[j].score > statu[j + 1].score) {
//					// �ر�ע��
//					// �����������飬����Ԫ��
//					studentTEST tmp = statu[j];
//					statu[j] = statu[j + 1];
//					statu[j + 1] = tmp;
//				}
//			}
//		}

		// ����
		//ð������
		System.out.println("-------------ð������");
		for(int i=0;i<statu.length;i++) {
			statu[i].paixu(statu);
		}
		for (int i = 0; i < statu.length; i++) {
			statu[i].allstuden();
		}
	}
}

class studentTEST {
	/**
	 * ѧ�ţ��꼶���ɼ�
	 */
	int munber, status, score;
	// ѧ�ţ��꼶���ɼ�
	
	//���
	public void allstuden() {
		System.out.println("ѧ��" + munber + ",�꼶" + status + ",�ɼ�" + score);
	}
	
	/**
	 * ð������
	 * @param statu
	 */
	public void paixu(studentTEST[] statu) {
		for (int i = 0; i < statu.length; i++) {
			for (int j = 0; j < statu.length - 1 - i; j++) {
				// System.out.println("---"+j);
				if (statu[j].score > statu[j + 1].score) {
					// �ر�ע��
					// �����������飬����Ԫ��
					studentTEST tmp = statu[j];
					statu[j] = statu[j + 1];
					statu[j + 1] = tmp;
				}
			}
		}
		
	}
	
}
