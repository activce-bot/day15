package exer;

import java.util.Scanner;
import java.util.Vector;

/**
 * 利用Vector代替数组处理：从键盘读入学生成绩（以负数代表输入结束），找出最高分，并输出学生成绩等级。
 * 提示：数组一旦创建，长度就固定不变，所以在创建数组前就需要知道它的长度。 而向量类java.util.Vector可以根据需要动态伸缩。
 * 
 * 创建Vector对象：Vector v=new Vector(); 给向量添加元素：v.addElement(Object obj);
 * //obj必须是对象 取出向量中的元素：Object obj=v.elementAt(0); 注意第一个元素的下标是0，返回值是Object类型的。
 * 计算向量的长度：v.size(); 若与最高分相差10分内：A等；20分内：B等； 30分内：C等；其它：D等
 *
 */
public class ScoreTest {

	public static void main(String[] args) {

		// 1,实例化Scanner
		Scanner scan = new Scanner(System.in);
		// 2.创建对象
		Vector v = new Vector();

		// 3.添加数据
		int maxnumber = 0;

		for (;;) {
			System.out.print("请输入学生成绩(输入是负数就结束):");
			int nextint = scan.nextInt();

			// 3.1跳出循环
			if (nextint < 0) {
				break;
			} else if (nextint > 100) {
				System.out.println("输入的数据有误请重新输入！");
				continue;
			}
			// 获取到了数据

			// Integer integer = new Integer(nextint);
			v.addElement(nextint);

			// 4.获取最大数值
			if (maxnumber < nextint) {
				maxnumber = nextint;
			}

		}

		// 5.遍历最大值 获取差值
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
		// 6.计算成绩abcd
	}
}
