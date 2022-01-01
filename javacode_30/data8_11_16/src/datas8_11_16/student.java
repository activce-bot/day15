package datas8_11_16;

public class student {
	public static void main(String[] args) {

		// 可以是自定义的类
		studentTEST[] statu = new studentTEST[20];
		// 创建数组
		for (int i = 0; i < statu.length; i++) {
			statu[i] = new studentTEST();

			// 学号
			statu[i].munber = i + 1; 
			// 年级 (1-6)
			statu[i].status = (int) (Math.random() * (6 - 1 + 1) + 1);

			// 成绩 0-100
			statu[i].score = (int) (Math.random() * (100) + 1);
		}

		// 遍历
		for (int i = 0; i < statu.length; i++) {
			statu[i].allstuden();

		}
		// 年级为三的输出
		System.out.println("------");
		for (int i = 0; i < statu.length; i++) {
			if (statu[i].status == 3) {
				statu[i].allstuden();
			}
		}
		
		
//		// 冒泡排序
//		System.out.println("-----------");
//		for (int i = 0; i < statu.length; i++) {
//			for (int j = 0; j < statu.length - 1 - i; j++) {
//				// System.out.println("---"+j);
//				if (statu[j].score > statu[j + 1].score) {
//					// 特别注意
//					// 交换的是数组，不是元素
//					studentTEST tmp = statu[j];
//					statu[j] = statu[j + 1];
//					statu[j + 1] = tmp;
//				}
//			}
//		}

		// 遍历
		//冒泡排序
		System.out.println("-------------冒泡排序");
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
	 * 学号，年级，成绩
	 */
	int munber, status, score;
	// 学号，年级，成绩
	
	//输出
	public void allstuden() {
		System.out.println("学号" + munber + ",年级" + status + ",成绩" + score);
	}
	
	/**
	 * 冒泡排序
	 * @param statu
	 */
	public void paixu(studentTEST[] statu) {
		for (int i = 0; i < statu.length; i++) {
			for (int j = 0; j < statu.length - 1 - i; j++) {
				// System.out.println("---"+j);
				if (statu[j].score > statu[j + 1].score) {
					// 特别注意
					// 交换的是数组，不是元素
					studentTEST tmp = statu[j];
					statu[j] = statu[j + 1];
					statu[j + 1] = tmp;
				}
			}
		}
		
	}
	
}
