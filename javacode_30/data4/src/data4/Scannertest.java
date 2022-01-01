package data4;

import java.util.Scanner;

public class Scannertest {
	public static void main(String[] args) {
		// scanner实例化
		Scanner scan = new Scanner(System.in);
		// System.out.println("请输入你的姓名");
		// String name=scan.next();
		// System.out.println(name);

		// 成绩对应
		System.out.print("请输入你的成绩(100到0):");
		int crom = scan.nextInt();
		if (crom <= 100 && crom >= 0) {
			if (crom == 100) {
				System.out.println("满分");
			} else if (crom >= 90) {
				System.out.println("成绩优秀");
			} else if (crom >= 70) {
				System.out.println("成绩合格");
			} else {
				System.out.println("成绩不合格");
			}
		} else {
			System.out.println("请输入正确的数值");
		}
		scan.close();
	}
}