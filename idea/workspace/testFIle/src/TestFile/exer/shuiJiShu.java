package TestFile.exer;

import org.junit.Test;

import java.util.Scanner;

/**
 * 猜随机数！！
 *
 * @author gjx
 * @create 2021-12-25 15:30
 */
public class shuiJiShu {
    public static void main(String[] args) {

        System.out.print("猜100内的随机数。");
        //100以内的随机数
        int num = (int) (Math.random() * 99 + 1);
        System.out.println(num);
        int total = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("输入你猜的数字:");
            int i = scanner.nextInt();
            total++;
            if (i == num) {
                System.out.println("猜对了！！");
                break;
            } else if (i > num) {
                System.out.println("猜的数大了，在猜一次吧！");
            } else {
                System.out.println("猜的数小了，在试一次吧！");
            }
        }
        System.out.println("一共猜了" + total + "次" + "，随机数为:" + num);
    }

    @Test
    public void test() {
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
