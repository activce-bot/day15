package TestFile.exer;

import org.junit.Test;

import java.util.Scanner;

/**
 * 假如今天星期一，求10的n次方天后为星期几！！
 *
 * @author gjx
 * @create 2021-12-25 14:08
 */
public class dataForMoth {

    @Test
    public void testnumber() {

        long number = 10;
        for (int i = 0; i < 15; i++) {
            number *= 10;
            System.out.print(number % 7);

        }
        // 2，6，4，5，1，3 有循环节
        System.out.println();

    }

    @Test
    public void test2() {

        System.out.println();
// 分三个大部分 上中下
        for (int i = 0, k = 0; i < 14; i++) {// 打印行
            // 上部分 上分为 四个部分
            if (i < 3) {
                for (int j = 0; j < 5 - 2 * i; j++) {// 1、空心
                    System.out.print(" ");
                }
                if (i == 2) {// 2、*
                    for (int j = 0; j < 6 + 4 * i - 1; j++) {
                        System.out.print("*");
                    }
                    for (int j = 0; j < 7 - 4 * i + 2; j++) {// 3、空心
                        System.out.print(" ");
                    }
                    for (int j = 0; j < 6 + 4 * i - 1; j++) {// 4、*
                        System.out.print("*");
                    }
                } else {
                    for (int j = 0; j < 6 + 4 * i; j++) {// 2、*
                        System.out.print("*");
                    }
                    for (int j = 0; j < 7 - 4 * i; j++) {// 3、空心
                        System.out.print(" ");
                    }
                    for (int j = 0; j < 6 + 4 * i; j++) {// 4、*
                        System.out.print("*");
                    }
                }
            } else if (i < 6) {// 中间
                for (int j = 0; j < 29; j++) {
                    System.out.print("*");
                }
            } else {// 下部分 6
                if (i == 13) {
                    for (int j = 0; j < 2 * (i - 6); j++) {// 打印空格
                        System.out.print(" ");
                    }
                    System.out.print("*");
                } else {
                    for (int j = 0; j < 2 * (i - 6) + 1; j++) {// 打印空格
                        System.out.print(" ");
                    }
                    for (int j = 1; j < 28 - 4 * k; j++) {
                        System.out.print("*");
                    }
                    k++;
                }
            }
            System.out.println();// 换行
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isFlage = true;
        while (isFlage) {
            System.out.print("请输入10的n次方(n为大于等于100)");
            int i = scanner.nextInt();
            if (i < 100) {
                System.out.println("请重新输入！！");
            } else {
                int weekDay = 1;
                int j = i % 7;
                switch (j) {
                    case 1:
                        weekDay += 2;
                        break;
                    case 2:
                        weekDay += 6;
                        break;

                    case 3:
                        weekDay += 4;
                        break;

                    case 4:
                        weekDay += 5;
                        break;

                    case 5:
                        weekDay += 1;
                        break;

                    case 6:
                        weekDay += 3;
                        break;
                    case 0:
                }
                String[] str = {"一", "二", "三", "四", "五", "六", "天"};
                System.out.println("10的" + i + "次方天后为星期" + str[weekDay - 1]);
                scanner.close();
                isFlage = false;
            }
        }
    }

    @Test
    public void tesat3() {
        int a;
        int doub = 0;
        int notdoub = 0;
        for (int i = 1; i <= 100; i++) {
            //范围为999到100
            a = (int) (Math.random()*(999-100)+100);
            if ( a % 2 == 0) {
                doub++;
            } else {
                notdoub++;
            }
            System.out.print(a +"\t");
            /**
             * 10个数换行
             */
            if (i % 10 == 0) {
                System.out.println();
            }
        }
        System.out.println();
        System.out.println("偶数有:"+doub+"个，奇数有:"+notdoub+"个");

    }
}
